package com.fuy.service;

import com.fuy.pojo.ElectricityRelated;

import java.util.Date;
import java.util.List;
//2张   用电关联性
public interface ElectricityRelatedService {
    List<ElectricityRelated> findAllRelated();


    List<String> findAllDate();

    List<Integer> findSumByName(String name);


}
