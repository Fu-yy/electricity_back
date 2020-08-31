package com.fuy.mapper;

import com.fuy.pojo.ElectricityTso;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * 分时电量优化
 * 5
 */
@Repository
public interface ElectricityTsoMapper {
    List<ElectricityTso> findAllElectricityTso();

    List<String> findAllDate();


    List<String> findAllName();
}
