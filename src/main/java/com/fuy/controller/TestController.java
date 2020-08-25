package com.fuy.controller;

import com.fuy.pojo.EletrictPast;
import com.fuy.pojo.TestPojo;
import com.fuy.service.EletrictPastService;
import com.fuy.util.Result;
import com.fuy.util.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class TestController {

    @Autowired
    private EletrictPastService eletrictPastService;

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


    @GetMapping("/findEletrictPastList")
    @CrossOrigin
    @ResponseBody
    public Result findEletrictPastList(){

        List<EletrictPast> eletrictPastList = eletrictPastService.findEletrictPastList();

        Map<String,Object> resultMap = new HashMap<>();

        List<Object> timeList = new ArrayList<>();



//        List<Object> carList = new ArrayList<>();
//        List<Object> machineList = new ArrayList<>();
//        List<Object> aviationList = new ArrayList<>();




        Map<Date, Object> aviationMap = new HashMap<>();
        Map<Date, Object> carMap = new HashMap<>();
        Map<Date, Object> machineMap = new HashMap<>();

        for (EletrictPast eletrictPast : eletrictPastList) {


            aviationMap.put(eletrictPast.getDateTime(),eletrictPast.getAviationPast());
            carMap.put(eletrictPast.getDateTime(),eletrictPast.getCarPast());
            machineMap.put(eletrictPast.getDateTime(),eletrictPast.getMachinePast());

            timeList.add(eletrictPast.getDateTime());

        }

        resultMap.put("machine",machineMap);
        resultMap.put("time",timeList);
        resultMap.put("car",carMap);
        resultMap.put("aviation",aviationMap);

//        List<TestPojo> objects = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            objects.add(new TestPojo(Integer.toString(i),"dasd"+i));
//        }
        return new Result(200,"成功",resultMap);
    }



}
