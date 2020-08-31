package com.fuy.service;

import com.fuy.pojo.ElectricityDo;

import java.util.Date;
import java.util.List;

public interface ElectricityDoService {
    //    获取所有
    List<ElectricityDo> findAllElectricityDo();


    List<String> findAllDate();


    List<String> findAllName();
}
