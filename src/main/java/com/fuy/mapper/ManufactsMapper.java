package com.fuy.mapper;


import com.fuy.pojo.Manufacts;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufactsMapper {

//    通过id 查
    Manufacts findById(String manuId);
}


