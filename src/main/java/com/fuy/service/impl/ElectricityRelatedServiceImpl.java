package com.fuy.service.impl;

import com.fuy.mapper.ElectricityRelatedMapper;
import com.fuy.pojo.ElectricityRelated;
import com.fuy.service.ElectricityPastService;
import com.fuy.service.ElectricityRelatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
//2张   用电关联性
@Service
public class ElectricityRelatedServiceImpl implements ElectricityRelatedService {

    @Autowired
    private ElectricityRelatedMapper electricityRelatedMapper;

    @Override
    public List<ElectricityRelated> findAllRelated() {
        return electricityRelatedMapper.findAllRelated();
    }

    @Override
    public List<String> findAllDate() {
        return electricityRelatedMapper.findAllDate();
    }

    @Override
    public List<Integer> findSumByName(String name) {
        return electricityRelatedMapper.findSumByName(name);
    }


}
