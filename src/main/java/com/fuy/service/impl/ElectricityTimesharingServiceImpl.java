package com.fuy.service.impl;

import com.fuy.mapper.ElectricityTimesharingMapper;
import com.fuy.pojo.ElectricityTimesharing;
import com.fuy.service.ElectricityTimesharingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ElectricityTimesharingServiceImpl implements ElectricityTimesharingService {


    @Autowired
    private ElectricityTimesharingMapper electricityTimesharingMapper;

    @Override
    public List<ElectricityTimesharing> findAllElectricityTimeSharing() {
        return electricityTimesharingMapper.findAllElectricityTimeSharing();
    }

    @Override
    public List<String> findAllTime() {
        return electricityTimesharingMapper.findAllTime();
    }

    @Override
    public List<String> findAllName() {
        return electricityTimesharingMapper.findAllName();
    }
}
