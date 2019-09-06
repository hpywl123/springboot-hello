package com.hpywl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody   //返回JSON格式
    public String index(String name,String age){
        return "姓名："+name+",年龄："+age+".";
    }

    @RequestMapping("/map")
    @ResponseBody   //返回JSON格式
    public Map<String,String> mapTest(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("name","袁文郎");
        map.put("age","23");
        map.put("sex","0");
        return map;
    }
}
