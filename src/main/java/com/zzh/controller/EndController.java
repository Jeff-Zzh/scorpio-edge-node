package com.zzh.controller;

import com.zzh.pojo.DataDemo1;
import com.zzh.pojo.DataDemo2;
import com.zzh.pojo.MetaData;
import com.zzh.pojo.Result;
import com.zzh.service.data.EndService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 暴露给End端侧使用的接口，用于和端侧通信，接收端侧请求
 */
@Slf4j
@RestController
@RequestMapping("/ends")
public class EndController {
    @Autowired
    private EndService endService;

    @PostMapping("/datas")
    public Result getDataFromEnd(@RequestBody MetaData metaData){
        log.info("get data from end: " + metaData);
        endService.storeCompressedData(metaData);
        return Result.success();
    }
}
