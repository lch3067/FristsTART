package com.CHLEE.lee.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.CHLEE.lee.service.CommonService;

@Controller
public class MainController {

    @Autowired 
    private CommonService commonService;


    @RequestMapping(value = "/index.do")
    public String index() {

        return "redirect:/test.do";
    }


    /**
     * 
     */
    @RequestMapping(value = "/test.do", method = RequestMethod.POST)
    public String test(HttpServletRequest request, HttpServletResponse response, ModelMap model) {

        String value = commonService.prepareTest();

        System.out.println(value);

        Map<String, Object> testMap = new HashMap<>();
        testMap.put("test", "over");

        request.setAttribute("test", testMap);

        return "test";
    }

}