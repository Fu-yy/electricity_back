package com.fuy.service;

import com.fuy.pojo.ElectricityTso;

import java.util.Date;
import java.util.List;

public interface ElectricityTsoService {
    List<ElectricityTso> findAllElectricityTso();


    List<String> findAllDate();


    List<String> findAllName();

}
