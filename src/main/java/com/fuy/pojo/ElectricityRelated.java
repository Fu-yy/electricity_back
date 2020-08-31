package com.fuy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

//2张   用电关联性
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ElectricityRelated {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private Integer relatedId;
    private Date electDate;
    private String electDateStr;
    private Integer manuId;
    private Integer energy;

    private Manufacts manufacts;

    public String getElectDateStr() {
        return simpleDateFormat.format(this.electDate);
    }
}
