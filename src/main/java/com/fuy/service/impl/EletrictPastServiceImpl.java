package com.fuy.service.impl;

import com.fuy.mapper.EletrictPastMapper;
import com.fuy.pojo.EletrictPast;
import com.fuy.service.EletrictPastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EletrictPastServiceImpl implements EletrictPastService {


    @Autowired
    private EletrictPastMapper eletrictPastMapper;

    @Override
    public List<EletrictPast> findEletrictPastList() {
        return eletrictPastMapper.findEletrictPastList();
    }
}
