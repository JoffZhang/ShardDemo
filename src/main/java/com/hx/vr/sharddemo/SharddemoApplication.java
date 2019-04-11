package com.hx.vr.sharddemo;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@MapperScan("com.hx.vr.sharddemo.dao")
@SpringBootApplication //(exclude = {DruidDataSourceAutoConfigure.class})
public class SharddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharddemoApplication.class, args);
    }

}
