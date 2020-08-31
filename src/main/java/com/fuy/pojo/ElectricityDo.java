package com.fuy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 需求侧用电量优化
 * 第六张
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricityDo {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    private Integer doId;
    private String doName;
    private Date doTime;
    private BigDecimal doNum;
    private String doTimeStr;

    public String getDoTimeStr() {
        return simpleDateFormat.format(doTime);
    }
}
