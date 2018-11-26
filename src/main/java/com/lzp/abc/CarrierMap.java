package com.lzp.abc;

import java.util.HashMap;
import java.util.Map;

public class CarrierMap {
	public static Map<String, String> CARRIER_MAP = new HashMap<String, String>();

	static {
		CARRIER_MAP.put("CA", "中国国际航空公司");
		CARRIER_MAP.put("CZ", "中国南方航空公司");
		CARRIER_MAP.put("PN", "西部航空有限责任公司");
		CARRIER_MAP.put("MU", "东方航空公司");
		CARRIER_MAP.put("MF", "厦门航空公司");
		CARRIER_MAP.put("SC", "山东航空公司");
		CARRIER_MAP.put("FM", "上海航空公司");
		CARRIER_MAP.put("ZH", "深圳航空公司");
		CARRIER_MAP.put("X2", "中国新华航空公司");
		CARRIER_MAP.put("JR", "幸福航空责任有限公司");
		CARRIER_MAP.put("3Q", "云南航空公司");
		CARRIER_MAP.put("UQ", "新疆航空公司");
		CARRIER_MAP.put("3U", "四川航空公司");
		CARRIER_MAP.put("Z2", "中原航空公司");
		CARRIER_MAP.put("WU", "武汉航空公司");
		CARRIER_MAP.put("G4", "贵州航空公司");
		CARRIER_MAP.put("HU", "海南航空公司");
		CARRIER_MAP.put("3U", "四川航空公司");
		CARRIER_MAP.put("GP", "中国通用航空公司");
		CARRIER_MAP.put("3W", "南京航空公司");
		CARRIER_MAP.put("ZJ", "浙江航空公司");
		CARRIER_MAP.put("G8", "长城航空公司");
		CARRIER_MAP.put("FJ", "福建航空公司");
		CARRIER_MAP.put("9H", "长安航空公司");
		CARRIER_MAP.put("GJ", "浙江长龙航空公司");
		CARRIER_MAP.put("JD", "首都航空公司");
		CARRIER_MAP.put("HO", "上海吉祥航空公司");
		CARRIER_MAP.put("GS", "天津航空公司");
		CARRIER_MAP.put("G5", "华夏航空有限公司");
	}

	public static Map<String, String> getCarrierMap() {
		return CARRIER_MAP;
	}

	public static void setCarrierMap(Map<String, String> carrierMap) {
		CARRIER_MAP = carrierMap;
	}
}