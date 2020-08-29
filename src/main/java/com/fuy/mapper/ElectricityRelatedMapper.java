package com.fuy.mapper;

import com.fuy.pojo.ElectricityRelated;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElectricityRelatedMapper {


    List<ElectricityRelated> findAllRelated();
}
