package com.fuy.mapper;


import com.fuy.pojo.EletrictPast;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//表示这是一个mybatis的mapper类
//@Mapper
@Repository
public interface EletrictPastMapper {

    List<EletrictPast> findEletrictPastList();
}
