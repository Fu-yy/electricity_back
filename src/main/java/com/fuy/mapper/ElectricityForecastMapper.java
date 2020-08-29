package com.fuy.mapper;


import com.fuy.pojo.ElectricityForecast;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

//表示这是一个mybatis的mapper类
//@Mapper
@Repository
public interface ElectricityForecastMapper {

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
