package com.fuy.pojo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

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
