package com.fuy.mapper;

import com.fuy.pojo.ElectricityRelated;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
//2张   用电关联性
@Repository
public interface ElectricityRelatedMapper {


    List<ElectricityRelated> findAllRelated();


    List<String> findAllDate();


}
