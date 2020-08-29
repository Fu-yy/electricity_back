package com.fuy.service;

import com.fuy.pojo.ElectricityPast;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ElectricityPastService {

    List<ElectricityPast> findElectricityPastList();

    /**
     * 所有时间列表
     * @return
     */
    List<String> findElectricityPastDataList();

    /**
     * 行业名称
     * @return
     */
    List<String> findElectricityPastNameList();


    /**
     * 用电量
     * @return
     */
    List<BigDecimal> findElectricityPastNumList();

    List<BigDecimal> findElectricityPastNumSumByDate();


}
