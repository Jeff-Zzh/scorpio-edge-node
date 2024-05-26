package com.zzh.service.data.impl;

import com.zzh.mapper.EndMapper;
import com.zzh.pojo.DataDemo2;
import com.zzh.pojo.MetaData;
import com.zzh.service.data.EndService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Slf4j
@Service
public class EndServiceImpl implements EndService {
    @Autowired
    private EndMapper endMapper;

    @Override
    public void storeCompressedData(MetaData metaData) {
        log.info("数据库存dataDemo2");
        DataDemo2 dataDemo2 = new DataDemo2(null, new Timestamp(System.currentTimeMillis()), metaData); // edge收到end节点数据的时间
        endMapper.insertDataDemo2(dataDemo2);
    }
}
