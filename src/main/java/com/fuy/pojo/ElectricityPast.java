package com.fuy.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricityPast {
    private Integer electricityId;
    private Date electricityDate;
    private String  electricityName;
    private BigDecimal electricityNum;

}
