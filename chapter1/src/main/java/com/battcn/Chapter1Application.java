package com.battcn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * 我的第一个SpringBoot程序
 * 其中 @RestController 等同于 （@Controller 与 @ResponseBody）
 *
 * @author Levin
 */
@RestController
@SpringBootApplication
public class Chapter1Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter1Application.class, args);
    }

    @GetMapping("/demo1")
    public String demo1() {
        return "Hello battcn";
    }

}
