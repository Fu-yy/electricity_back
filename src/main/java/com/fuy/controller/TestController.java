package com.fuy.controller;

import com.fuy.pojo.*;
import com.fuy.service.*;
import com.fuy.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;

@Controller
public class TestController {

    @Autowired
    private ElectricityPastService electricityPastService;


    @Autowired
    private ElectricityRelatedService electricityRelatedService;

    @Autowired
    private ElectricityForecastService electricityForecastService;

    @Autowired
    private ElectricityTimesharingService electricityTimesharingService;//4图

    @Autowired
    private ElectricityTsoService electricityTsoService; //5图


    @Autowired
    private ElectricityDoService electricityDoService;//6图

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


//    第一张图   历史用电量
    @GetMapping("/findElectricityPastList")
    @CrossOrigin
    @ResponseBody
    public Result findElectricityPastList(){

        List<ElectricityPast> electricityPasts = electricityPastService.findElectricityPastList();

        List<String> electricityPastDataList = electricityPastService.findElectricityPastDataList();
        List<String> electricityPastNameList = electricityPastService.findElectricityPastNameList();
        List<BigDecimal> electricityPastNumSumByDate = electricityPastService.findElectricityPastNumSumByDate();


        System.out.println(electricityPastNumSumByDate);
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("pastElectricityList",electricityPasts);
        resultMap.put("electricityPastDataList",electricityPastDataList);
        resultMap.put("electricityPastNumSumByDate",electricityPastNumSumByDate);

//        resultMap.put("resultCode",electricityPastDataList);







        return new Result(200,"成功",resultMap);
    }



    //    第二张图   用电量关联性
    @GetMapping("/findAllElectricityRelated")
    @CrossOrigin
    @ResponseBody
    public Result findAllElectricityRelated(){
        HashMap<String, Object> resultMap = new HashMap<>();
        List<ElectricityRelated> electricityRelatedServiceAllRelated = electricityRelatedService.findAllRelated();
        List<String> electricityRelatedServiceAllDate = electricityRelatedService.findAllDate();

        List<Integer> mechanicalSum = electricityRelatedService.findSumByName("机械制造业");
        List<Integer> carSum = electricityRelatedService.findSumByName("航空制造业");
        List<Integer> aviationSum = electricityRelatedService.findSumByName("汽车制造业");


        resultMap.put("electricityRelatedServiceAllRelated",electricityRelatedServiceAllRelated);
        resultMap.put("electricityRelatedServiceAllDate",electricityRelatedServiceAllDate);
        resultMap.put("mechanicalSum",mechanicalSum);
        resultMap.put("carSum",carSum);
        resultMap.put("aviationSum",aviationSum);


        return new Result(200,"成功",resultMap);
    }



    //    第3张图   预测用电量
    @GetMapping("/findElectricityForecastList")
    @CrossOrigin
    @ResponseBody
    public Result findElectricityForecastList(){

        List<ElectricityForecast> electricityForecastList = electricityForecastService.findElectricityForecastList();
        List<String> electricityForecastDataList = electricityForecastService.findElectricityForecastDataList();
        List<BigDecimal> electricityForecastNumSumByDate = electricityForecastService.findElectricityForecastNumSumByDate();






        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("electricityForecastList",electricityForecastList);
        resultMap.put("electricityForecastDataList",electricityForecastDataList);
        resultMap.put("electricityForecastNumSumByDate",electricityForecastNumSumByDate);

//        resultMap.put("resultCode",electricityPastDataList);







        return new Result(200,"成功",resultMap);
    }



    //    第4张图   峰谷平
    @GetMapping("/findAllElectricityTimeSharing")
    @CrossOrigin
    @ResponseBody
    public Result findAllElectricityTimeSharing(){

        List<ElectricityTimesharing> allElectricityTimeSharing = electricityTimesharingService.findAllElectricityTimeSharing();
        List<String> electricityTimesharingServiceAllTime = electricityTimesharingService.findAllTime();
        List<String> electricityTimesharingServiceAllName = electricityTimesharingService.findAllName();


        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("allElectricityTimeSharing",allElectricityTimeSharing);
        resultMap.put("electricityTimesharingServiceAllTime",electricityTimesharingServiceAllTime);
        resultMap.put("electricityTimesharingServiceAllName",electricityTimesharingServiceAllName);

//        resultMap.put("resultCode",electricityPastDataList);







        return new Result(200,"成功",resultMap);
    }

    //    第5张图   分时优化
    @GetMapping("/findAllElectrElectricityTso")
    @CrossOrigin
    @ResponseBody
    public Result findAllElectrElectricityTso(){

        List<ElectricityTso> electricityTsoServiceAllElectricityTso = electricityTsoService.findAllElectricityTso();
        List<String> electricityTsoServiceAllDate = electricityTsoService.findAllDate();
        List<String> electricityTsoServiceAllName = electricityTsoService.findAllName();


        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("electricityTsoServiceAllElectricityTso",electricityTsoServiceAllElectricityTso);
        resultMap.put("electricityTsoServiceAllDate",electricityTsoServiceAllDate);
        resultMap.put("electricityTsoServiceAllName",electricityTsoServiceAllName);

//        resultMap.put("resultCode",electricityPastDataList);







        return new Result(200,"成功",resultMap);
    }


    //    第6张图   需求侧优化
    @GetMapping("/findAlElectricityDo")
    @CrossOrigin
    @ResponseBody
    public Result findAlElectricityDo(){

        List<ElectricityDo> electricityDoServiceAllElectricityDo = electricityDoService.findAllElectricityDo();
        List<String> electricityDoServiceAllDate = electricityDoService.findAllDate();
        List<String> electricityDoServiceAllName = electricityDoService.findAllName();


        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("electricityDoServiceAllElectricityDo",electricityDoServiceAllElectricityDo);
        resultMap.put("electricityDoServiceAllDate",electricityDoServiceAllDate);
        resultMap.put("electricityDoServiceAllName",electricityDoServiceAllName);

//        resultMap.put("resultCode",electricityPastDataList);







        return new Result(200,"成功",resultMap);
    }


}
