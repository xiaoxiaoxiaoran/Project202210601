package cn.tedu.project2022106.util;

import cn.hutool.core.date.DateUtil;
import cn.tedu.project2022106.Exception.ServiceException;
import cn.tedu.project2022106.entity.Account;
import cn.tedu.project2022106.service.IAccountService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class TokenUtil {
   @Autowired
   static
   IAccountService accountService;

    static IAccountService staticAccountService;

    public static void eq(){
        staticAccountService = accountService;
    }
    public static String genToken(String id ,String sign){
        return JWT.create().withAudience(id)
                .withExpiresAt(DateUtil.offsetHour(new Date(),2))
                .sign(Algorithm.HMAC256(sign));
    }
    public static String getCurrentUser(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader("token");
        try{
            String userId = JWT.decode(token).getAudience().get(0);
            Account account = staticAccountService.getById(userId);
            return account.toString();
        }catch(Exception e){
            return "";
        }
    }
}
