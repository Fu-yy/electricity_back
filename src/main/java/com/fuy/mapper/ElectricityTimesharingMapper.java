package com.fuy.mapper;

import com.fuy.pojo.ElectricityTimesharing;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

//分时电量  4图
@Repository
public interface ElectricityTimesharingMapper {

    //获取所有
    List<ElectricityTimesharing> findAllElectricityTimeSharing();

    //获取所有时间
    List<String> findAllTime();

    //获取所有名字
    List<String> findAllName();



}
