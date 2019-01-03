package com.bryce;


import org.springframework.stereotype.Component;

@Component
public class DataDao {
    public String getData() {
        return "dao中返回的数据！";
    }
}
