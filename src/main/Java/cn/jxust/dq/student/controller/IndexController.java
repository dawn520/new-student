package cn.jxust.dq.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xixi on 2017/5/11.
 */

@Controller
public class IndexController {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index() {
        return "index";
    }


}
