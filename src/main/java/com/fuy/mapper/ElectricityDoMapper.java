package com.fuy.mapper;

import com.fuy.pojo.ElectricityDo;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

//第六章
@Repository
public interface ElectricityDoMapper {


//    获取所有
    List<ElectricityDo> findAllElectricityDo();



    List<String> findAllDate();


    List<String> findAllName();
}
