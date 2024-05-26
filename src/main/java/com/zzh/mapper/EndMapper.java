package com.zzh.mapper;

import com.zzh.pojo.DataDemo2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * 处理end端传来edge端的数据，DB为mysql
 */
@Mapper
public interface EndMapper {
    @Insert("insert into data_demo(send_to_edge_time, ori_time, metric1, metric2, metric3, metric4) " +
            "VALUES (#{sendToEdgeTime},#{metaData.oriTime},#{metaData.metric1},#{metaData.metric2},#{metaData.metric3},#{metaData.metric4})")
    void insertDataDemo2(DataDemo2 dataDemo);
}
