package com.fuy.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;


//行业分时优化  第五张

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricityTso {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    private Integer optimizationId;
    private String optimizationName;
    private BigDecimal optimizationNum;
    private Date optimizationTime;
    private String optimizationTimeStr;

    public String getOptimizationTimeStr() {
        return simpleDateFormat.format(this.optimizationTime);
    }
}
