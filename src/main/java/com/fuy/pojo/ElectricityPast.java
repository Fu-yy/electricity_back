package com.fuy.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricityPast {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式

    private Integer electricityId;

    private Date electricityDate;
    private String electricityDateStr;
    private String  electricityName;
    private BigDecimal electricityNum;


    public String getElectricityDateStr() {
        return dateFormat.format(this.electricityDate);
    }
}
