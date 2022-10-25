package cn.tedu.project2022106.controller;

import cn.tedu.project2022106.common.Result;
import cn.tedu.project2022106.controller.Dto.UserDto;
import cn.tedu.project2022106.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;
;

import javax.annotation.PostConstruct;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/auth")


public class LoginController {
    @Autowired
    AccountServiceImpl accountService;

//    @PostMapping("/login")
//    public Result login( HttpServletRequest request){
////        return accountService.login(username,password);
//            String username = request.getParameter("username");
//        System.out.println(username);
//        String password = request.getParameter("password");
//        String a = accountService.login(username, password);
//
//        Object b = "ok";
//        return Result.success(b);
////     if(a=="ok")
////         return "redirect:http://localhost:63342/project2022-10-6/static/ok.html?_ijt=k82de6nkt3jmsml9han3679qt3";
////     else
////         return "redirect:http://localhost:63342/project2022-10-6/static/fail.html?_ijt=apkh63t36h0lrah23usea4djre";
//    }
@PostMapping("/login")
public Result login(@RequestBody UserDto userDTO) {
    String username = userDTO.getUsername();
    String password = userDTO.getPassword();

    UserDto  dto = accountService.login(username,password);
    return Result.success(dto);
}

}
