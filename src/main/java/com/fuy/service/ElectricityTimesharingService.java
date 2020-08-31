package com.fuy.service;

import com.fuy.pojo.ElectricityTimesharing;

import java.util.Date;
import java.util.List;

public interface ElectricityTimesharingService {
    //    获取所有
    List<ElectricityTimesharing> findAllElectricityTimeSharing();

    //获取所有时间
    List<String> findAllTime();

    //获取所有名字
    List<String> findAllName();

}
