package com.fuy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricityForecast {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式

    private Integer forecastId;
    private String forecastName;
    private Date forecastDate;
    private String forecastDateStr;
    private BigDecimal forecastNum;

    public String getForecastDateStr() {
        return dateFormat.format(this.forecastDate);
    }
}
