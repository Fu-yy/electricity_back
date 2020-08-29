package com.fuy.mapper;


import com.fuy.pojo.ElectricityPast;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

//表示这是一个mybatis的mapper类
//@Mapper
@Repository
public interface ElectricityPastMapper {

    /**
     * 所有信息
     * @return
     */
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


    /**
     * 查询每天的和
     * @return
     */
    List<BigDecimal> findElectricityPastNumSumByDate();
}
