package com.fuy.service.impl;

import com.fuy.mapper.ElectricityForecastMapper;
import com.fuy.pojo.ElectricityForecast;
import com.fuy.service.ElectricityForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


@Service
public class ElectricityForecastServiceImpl implements ElectricityForecastService {

    @Autowired
    private ElectricityForecastMapper electricityForecastMapper;

    @Override
    public List<ElectricityForecast> findElectricityForecastList() {
        return electricityForecastMapper.findElectricityForecastList();
    }

    @Override
    public List<String> findElectricityForecastDataList() {
        return electricityForecastMapper.findElectricityForecastDataList();
    }

    @Override
    public List<String> findElectricityForecastNameList() {
        return electricityForecastMapper.findElectricityForecastNameList();
    }

    @Override
    public List<BigDecimal> findElectricityForecastNumList() {
        return electricityForecastMapper.findElectricityForecastNumList();
    }

    @Override
    public List<BigDecimal> findElectricityForecastNumSumByDate() {
        return electricityForecastMapper.findElectricityForecastNumSumByDate();
    }
}
