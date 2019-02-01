package com.mxc.client.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 马秀成
 * @date 2019/1/31
 * @jdk.version 1.8
 * @desc
 */
@RestController
@Slf4j
public class TailLogController {

    @RequestMapping(value = "/tailLog")
    public String tailLog(){
        log.info("info级别的日志");
        log.error("error级别的日志");
        return "get log ook";
    }

}
