package com.fuy.service;

import com.fuy.pojo.ElectricityForecast;

import java.math.BigDecimal;
import java.util.List;

public interface ElectricityForecastService {

    /**
     * 所有信息
     * @return
     */
    List<ElectricityForecast> findElectricityForecastList();


    /**
     * 所有时间列表
     * @return
     */
    List<String> findElectricityForecastDataList();

    /**
     * 行业名称
     * @return
     */
    List<String> findElectricityForecastNameList();


    /**
     * 用电量
     * @return
     */
    List<BigDecimal> findElectricityForecastNumList();


    /**
     * 查询每天的和
     * @return
     */
    List<BigDecimal> findElectricityForecastNumSumByDate();
}
