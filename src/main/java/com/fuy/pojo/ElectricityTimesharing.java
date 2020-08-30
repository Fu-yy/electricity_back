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
public class ElectricityTimesharing {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    private Integer timesharingId;
    private Date timesharingTime;
    private String timesharingTimeStr;
    private BigDecimal timesharingNum;
    private String  timesharingName;

    public String getTimesharingTimeStr() {
        return simpleDateFormat.format(timesharingTime);
    }
}
