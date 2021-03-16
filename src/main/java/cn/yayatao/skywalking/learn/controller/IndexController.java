package cn.yayatao.skywalking.learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class IndexController {
   private static final  Logger LOGGER= LoggerFactory.getLogger(IndexController.class);
    @RequestMapping("/")
    public String  index(){
        LOGGER.info( "我就是测试测试. 打个日志...."+"现在的时间是:"+new Date());
        return "我就是测试测试";
    }
}
