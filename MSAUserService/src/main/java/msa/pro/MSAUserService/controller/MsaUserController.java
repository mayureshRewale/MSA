package msa.pro.MSAUserService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MsaUserController {

    @Value("${app.name}")
    String appName;

    @Value("${app.test}")
    String appTest;

    @GetMapping("/app-name")
    public String getAppName(){
        return appName;
    }

    @GetMapping("/app-test")
    public String getAppTest(){
        return appTest;
    }

}
