package com.fuy.service.impl;


import com.fuy.mapper.ElectricityPastMapper;
import com.fuy.pojo.ElectricityPast;
import com.fuy.service.ElectricityPastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class ElectricityPastServiceImpl implements ElectricityPastService {


    @Autowired
    private ElectricityPastMapper electricityPastMapper;


    @Override
    public List<ElectricityPast> findElectricityPastList() {
        return electricityPastMapper.findElectricityPastList();
    }

    @Override
    public List<String> findElectricityPastDataList() {
        return electricityPastMapper.findElectricityPastDataList();
    }

    @Override
    public List<String> findElectricityPastNameList() {
        return electricityPastMapper.findElectricityPastNameList();
    }

    @Override
    public List<BigDecimal> findElectricityPastNumList() {
        return electricityPastMapper.findElectricityPastNumList();
    }

    @Override
    public List<BigDecimal> findElectricityPastNumSumByDate() {
        return electricityPastMapper.findElectricityPastNumSumByDate();
    }


}
