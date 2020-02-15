package com.richsoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.OutputStream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        OutputStream out = System.out ;        // 此时的输出流是向屏幕上输出
        try{
            out.write("hello world!!!".getBytes()) ;    // 向屏幕上输出
        }catch(IOException e){
            e.printStackTrace() ;    // 打印异常
        }
        try{
            out.close() ;    // 关闭输出流
        }catch(IOException e){
            e.printStackTrace() ;
        }

    }

}
