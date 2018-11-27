package com.lzp.control;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.lzp.abc.AbcConstant;
import com.lzp.abc.FlightTools;
import com.lzp.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.lzp.abc.FlightTools.getFlightBackInfo;
import static com.lzp.abc.FlightTools.getUrl;
import static com.lzp.abc.FlightTools.paramsEncoderByUtf8;

@Controller
@RequestMapping("/abc")
public class ABCController {

    @ResponseBody
    @RequestMapping(value = "/getdata" )
    public static  List<FlightInfo> getdata(FlightInfoParams applicationParams, String level){
        List<FlightInfo> newflightInfos =new ArrayList<>();
        System.out.println(level);
        FlightBackInfo flightBackInfo=new FlightBackInfo();
        List<FlightInfo> flightInfos = new ArrayList<>();
        //第一步：获得JSONString
        String params=JSON.toJSONString(applicationParams);
        //第二步：params utf-8编码
        String paramsUtf=paramsEncoderByUtf8(params);
        //第三步：获取sign
        String sign = FlightTools.getSign(AbcConstant.token,AbcConstant.flightInfoTag,"1506338970415",params,AbcConstant.key);
        String urlFinal = getUrl(AbcConstant.baseUrl,sign,AbcConstant.flightInfoTag,AbcConstant.token,"1506338970415",paramsUtf);
        System.out.println(urlFinal);
        //获取返回值
        String returnResult=getFlightBackInfo(urlFinal);
        flightBackInfo =  JSON.parseObject(returnResult,new TypeReference<FlightBackInfo>(){});
        flightInfos=flightBackInfo.getResult().getFlightInfos();
        if (!level.equals("1")){
            for (FlightInfo flightInfo: flightInfos) {
                if (flightInfo.getBarePrice()<1000){
                   newflightInfos.add(flightInfo);
                }
            }
        }else{
            newflightInfos = flightInfos;
        }

        Collections.sort(newflightInfos, new Comparator<FlightInfo>() {
            @Override
            public int compare(FlightInfo o1, FlightInfo o2) {
                if (o1.getBarePrice()>o2.getBarePrice()){
                    return 1;
                }else  if (o1.getBarePrice()<o2.getBarePrice()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        return newflightInfos;
    }

    @ResponseBody
    @RequestMapping(value = "/searchFlightPrice")
    public FlightPriceResult searchFlightPrice( FlightPriceParams flightPriceParams, String level) {
        System.out.println(JSON.toJSONString(flightPriceParams));
        String paramsUtf = paramsEncoderByUtf8(JSON.toJSONString(flightPriceParams));
        System.out.println(paramsUtf);
        String sign = FlightTools.getSign(AbcConstant.token, AbcConstant.searchLightPriceTag, "1506338970415", JSON.toJSONString(flightPriceParams), AbcConstant.key);
        System.out.println("mysign");
        System.out.println(sign);
        String urlFinal = getUrl(AbcConstant.baseUrl, sign, AbcConstant.searchLightPriceTag, AbcConstant.token, "1506338970415", paramsUtf);
        System.out.println(urlFinal);
        String backinfo = getFlightBackInfo(urlFinal);
        FlightPriceBackInfo flightPriceBackInfo = JSON.parseObject(backinfo, new TypeReference<FlightPriceBackInfo>() {});
        if (!level.equals("1")){
            List<FlightPriceVendors> flightPriceVendorsList = new ArrayList<>();
            List<FlightPriceVendors> flightPriceVendorsParams=flightPriceBackInfo.getResult().getVendors();
            for (FlightPriceVendors flightPriceVendors1:flightPriceVendorsParams){
                if (flightPriceVendors1.getCabinType()==0){
                    flightPriceVendorsList.add(flightPriceVendors1);
                }
            }
            flightPriceBackInfo.getResult().setVendors(flightPriceVendorsList);
        }
        Collections.sort(flightPriceBackInfo.getResult().getVendors(), new Comparator<FlightPriceVendors>() {
            @Override
            public int compare(FlightPriceVendors o1, FlightPriceVendors o2) {
                if (o1.getPrice()>o2.getPrice()){
                    return  1;
                }else if (o1.getPrice()<o2.getPrice()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        return flightPriceBackInfo.getResult();
    }
}
