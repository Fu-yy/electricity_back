package com.fuy.service.impl;

import com.fuy.mapper.ElectricityDoMapper;
import com.fuy.pojo.ElectricityDo;
import com.fuy.service.ElectricityDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ElectricityDoServiceImpl implements ElectricityDoService {

    @Autowired
    private ElectricityDoMapper electricityDoMapper;

    @Override
    public List<ElectricityDo> findAllElectricityDo() {
        return electricityDoMapper.findAllElectricityDo();
    }

    @Override
    public List<String> findAllDate() {
        return electricityDoMapper.findAllDate();
    }

    @Override
    public List<String> findAllName() {
        return electricityDoMapper.findAllName();
    }
}
