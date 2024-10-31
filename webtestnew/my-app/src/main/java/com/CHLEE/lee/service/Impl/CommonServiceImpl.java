package com.CHLEE.lee.service.Impl;

import org.springframework.stereotype.Service;
import com.CHLEE.lee.service.CommonService;

@Service
public class CommonServiceImpl implements CommonService {

    @Override
    public String prepareTest() {
        
        try {
            System.out.println("Hellow Workd");

        } catch(Exception e) {

        }
        return "성공출력";
        
    }
    
}