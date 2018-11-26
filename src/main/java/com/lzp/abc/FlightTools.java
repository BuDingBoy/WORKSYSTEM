package com.lzp.abc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.lzp.domain.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightTools {

    public static void main(String[] args) {
        try {
            String keyWord = URLEncoder.encode("{\"arr\":\"SHA\",\"date\":\"2018-12-09\",\"dpt\":\"PEK\",\"ex_track\":\"tehui\"}", "UTF-8");
//            String mdrstring = get("test", "flight.order.orderInfo.orderDetail", "1506338970415", "{\"orderNo\":\"test\"}", "test");
//            System.out.println(mdrstring);
            System.out.println(keyWord);
//            getdata();
            javaBeanToJsonString();
            flightPriceTest();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    public static   void javaBeanToJsonString(){
        FlightInfoParams params = new FlightInfoParams();
        params.setArr("CAN");
        params.setDate("2018-12-09");
        params.setDpt("PEK");
        params.setEx_track("tehui");


        System.out.println(JSON.toJSONString(params));
        String paramsUtf=paramsEncoderByUtf8(JSON.toJSONString(params));
        System.out.println(paramsUtf);
        String sign = FlightTools.getSign(AbcConstant.token,AbcConstant.flightInfoTag,"1506338970415",JSON.toJSONString(params),AbcConstant.key);
        System.out.println("mysign");
        System.out.println(sign);
        String url="http://qae.qunar.com/api/router";
        String urlFinal = getUrl(url,sign,AbcConstant.flightInfoTag,AbcConstant.token,"1506338970415",paramsUtf);
        System.out.println(urlFinal);
    }

    public static   void flightPriceTest(){
        FlightPriceParams flightPriceParams = new FlightPriceParams();
        flightPriceParams.setArr("CAN");
        flightPriceParams.setDate("2018-12-09");
        flightPriceParams.setDpt("PEK");
        flightPriceParams.setEx_track("tehui");
        flightPriceParams.setFlightNum("MU3003");

        System.out.println(JSON.toJSONString(flightPriceParams));
        String paramsUtf=paramsEncoderByUtf8(JSON.toJSONString(flightPriceParams));
        System.out.println(paramsUtf);
        String sign = FlightTools.getSign(AbcConstant.token,AbcConstant.searchLightPriceTag,"1506338970415",JSON.toJSONString(flightPriceParams),AbcConstant.key);
        System.out.println("mysign");
        System.out.println(sign);
        String url="http://qae.qunar.com/api/router";
        String urlFinal = getUrl(url,sign,AbcConstant.searchLightPriceTag,AbcConstant.token,"1506338970415",paramsUtf);
        System.out.println(urlFinal);
        String backinfo=getFlightBackInfo(urlFinal);
        FlightPriceBackInfo flightPriceBackInfo=JSON.parseObject(backinfo,new TypeReference<FlightPriceBackInfo>(){});
    }
    public static String paramsEncoderByUtf8(String params){
        String resultParams="";
        try {
            resultParams= URLEncoder.encode(params, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return resultParams;
    }

    public static String  getFlightBackInfo(String url){
        StringBuffer buffer = new StringBuffer();
        HttpURLConnection httpConn = null;
        BufferedReader reader = null;
        try {
            //url远程接口

            URL conUrl = new URL(url);
            httpConn = (HttpURLConnection) conUrl.openConnection();
            httpConn.setRequestMethod("POST");
            httpConn.connect();

            reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream(),"utf-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            return  buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (httpConn != null) {
                httpConn.disconnect();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return  buffer.toString();
    }

    public static String getSign(String token, String tag, String createTime, String params, String key) {
        List<String> list = new ArrayList<>();
        list.add("token=" + token);
        list.add("tag=" + tag);
        list.add("createTime=" + createTime);
        list.add("params=" + params);
        list.add("key=" + key);
        Collections.sort(list);
        StringBuffer sb = new StringBuffer(512);
//        StringBuffer dd = new StringBuffer(512);
//        String s = new String();
//        dd.append("createTime=1506338970415key=49daebda3569fda60b82216c92bf580cparams={\"arr\":\"SHA\",\"date\":\"2018-12-09\",\"dpt\":\"PEK\",\"ex_track\":\"tehui\"}tag=flight.national.supply.sl.searchflighttoken=c414e5cd53c458edaba9ef06ce609809");
        for (String param : list) {
            sb.append(param);
        }
        try {
//            System.out.println("signString");
//            System.out.println(dd.toString());
//            System.out.println(sb.toString());
//
//            System.out.println("sign");
//            System.out.println(makeMD5(dd.toString()));
            return makeMD5(sb.toString());
        } catch (Exception e) {
            return "";
        }

    }

    public static String makeMD5(String str) {
     MessageDigest md;
       try {
            md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] bPwd = md.digest();
            String pwd = new BigInteger(1, bPwd).toString(16);
            if (pwd.length() % 2 == 1) {
                pwd = "0" + pwd;

            }
            return pwd.toString().toLowerCase();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return "FAUILE";
    }

    public static  String getUrl(String url,String sign,String tag,String token,String createTime,String utf8Params){
        url=url+"?sign="+sign+"&tag=" +tag+"&token="+token+"&createTime="+createTime+"&params="+utf8Params;
        return  url;
    }
}
//http://qae.qunar.com/api/router?sign=0f36ae1900e3fbc4b385038d3e97c3e2&tag=flight.national.supply.sl.searchflight&token=c414e5cd53c458edaba9ef06ce609809&createTime=1506338970415&params=%7B%22dpt%22%3A%22PEK%22%2C%22arr%22%3A%22SHA%22%2C%22date%22%3A%222018-12-05%22%2C%22ex_track%22%3A%22tehui%22%7D