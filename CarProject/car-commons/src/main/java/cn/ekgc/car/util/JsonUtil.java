package cn.ekgc.car.util;

import com.fasterxml.jackson.databind.json.JsonMapper;

/**
 * JSON转换工工具类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public class JsonUtil {
	/**
	 * <b>将对象转换为 JSON 格式数据</b>
	 * @param obj
	 * @return
	 */
	public static String parseToJSON(Object obj){
		// 创建 JsonMapper 对象
		JsonMapper jsonMapper = new JsonMapper();
		// 进行数据转换
		try {
			return jsonMapper.writeValueAsString(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "{}";
	}

	/**
	 * <b>按照目标对象将 JSON 格式数据恢复为对象</b>
	 * @param json
	 * @param argcClass
	 * @return
	 */
	public static Object parseToObject(String json,Class argcClass){
		JsonMapper jsonMapper = new JsonMapper();
		try {
			return jsonMapper.readValue(json,argcClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
