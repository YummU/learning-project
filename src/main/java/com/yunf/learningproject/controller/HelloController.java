package com.yunf.learningproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 60591
 * @Date 2020/6/2 16:26
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "Hello world";
    }

    @ResponseBody
    @RequestMapping("/interval")
    public String interval(HttpServletRequest request, HttpServletResponse response) throws ParseException {

        String param = request.getParameter("param");

        Map<String,String> map = new HashMap<>();


        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = df.parse("2020-06-07 00:00:00");

        System.out.println(d);

        String result = map.get(param);

        return result;
    }

}
