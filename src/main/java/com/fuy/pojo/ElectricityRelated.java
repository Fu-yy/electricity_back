package com.fuy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ElectricityRelated {

    private Integer relatedId;
    private Date electDate;
    private Integer manuId;
    private Integer energy;

    private Manufacts manufacts;
}
