package com.fuy.service.impl;

import com.fuy.mapper.ElectricityTsoMapper;
import com.fuy.pojo.ElectricityTso;
import com.fuy.service.ElectricityTsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ElectricityTsoServiceImpl implements ElectricityTsoService {
    @Autowired
    private ElectricityTsoMapper electricityTsoMapper;

    @Override
    public List<ElectricityTso> findAllElectricityTso() {
        return electricityTsoMapper.findAllElectricityTso();
    }

    @Override
    public List<String> findAllDate() {
        return electricityTsoMapper.findAllDate();
    }

    @Override
    public List<String> findAllName() {
        return electricityTsoMapper.findAllName();
    }
}
