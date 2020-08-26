package com.fuy.controller;

import com.fuy.pojo.ElectricityPast;
import com.fuy.pojo.TestPojo;
import com.fuy.service.ElectricityPastService;
import com.fuy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class TestController {

    @Autowired
    private ElectricityPastService electricityPastService;

    @GetMapping("/test")
    @CrossOrigin
    @ResponseBody
    public Result test(){

        List<TestPojo> objects = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            objects.add(new TestPojo(Integer.toString(i),"dasd"+i));
        }
        return new Result(200,"成功",objects);
    }


    @GetMapping("/findElectricityPastList")
    @CrossOrigin
    @ResponseBody
    public Result findElectricityPastList(){

        List<ElectricityPast> electricityPasts = electricityPastService.findElectricityPastList();

        List<Date> electricityPastDataList = electricityPastService.findElectricityPastDataList();
        List<String> electricityPastNameList = electricityPastService.findElectricityPastNameList();


        Map<String,Object> resultMap = new HashMap<>();





        return new Result(200,"成功",electricityPasts);
    }



}
