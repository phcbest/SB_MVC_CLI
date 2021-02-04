package org.phcbest.multi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: PengHaiChen
 * @Description:
 * @Date: Create in 19:03 2021/2/3
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String testApi() {
        return "it's high noon";
    }
}
