package com.fuy.service;

import com.fuy.mapper.EletrictPastMapper;
import com.fuy.pojo.EletrictPast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EletrictPastService {

    public List<EletrictPast> findEletrictPastList();

}
