package cn.tedu.project2022106.config.interceptor;


import cn.hutool.core.util.StrUtil;
import cn.tedu.project2022106.Exception.ServiceException;
import cn.tedu.project2022106.common.ConStants;
import cn.tedu.project2022106.config.AuthAccess;
import cn.tedu.project2022106.entity.Account;
import cn.tedu.project2022106.service.IAccountService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JWTInterceptor implements HandlerInterceptor {
    @Autowired
    private IAccountService accountService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        if(!(handler instanceof HandlerMethod)){
            return true;
        }else{
            HandlerMethod h = (HandlerMethod)handler;
            AuthAccess authAccess = h.getMethodAnnotation(AuthAccess.class);
            if(authAccess!= null){
                return true;
            }
        }
        if(StrUtil.isBlank(token)){
            return true;
        }
        String accountId ;
        try{
            accountId = JWT.decode(token).getAudience().get(0);
        }catch(JWTDecodeException e){
            throw new ServiceException(ConStants.CODE_600,"无法解析");

        }
        Account account = accountService.getById(accountId);
        if(account == null)
        {
            throw new ServiceException(ConStants.CODE_401,"用户无法找到");
        }
        //验证加签
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(account.getPassword().toString())).build();
        try{
            jwtVerifier.verify(token);
        }catch(JWTVerificationException e){
            throw  new ServiceException(ConStants.CODE_600,"验证失败");
        }
        return true;
    }
}
