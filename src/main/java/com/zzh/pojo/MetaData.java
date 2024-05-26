package com.zzh.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetaData {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8") // 规范时间格式
    private Timestamp oriTime; // 端侧产生此数据时间
    // 端侧字段
    private Integer metric1;
    private String metric2;
    private Boolean metric3;
    private Double metric4;
}
