
package ggauthority.v1.auth.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Description:TODO
 * @version 1.0
 * @since JDK1.7
 * @author yaomy
 * @company xxxxxxxxxxxxxx
 * @copyright (c) 2017 yaomy Co'Ltd Inc. All rights reserved.
 * @date 2017年10月13日 下午4:23:36
 */
@Controller
@EnableAutoConfiguration
public class UserController {

    @RequestMapping("/list")
    @ResponseBody
    public String list() {
        return "Hello World111!";
    }
}