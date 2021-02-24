package cn.ekgc.car.base.pojo.enums;

import cn.ekgc.car.util.ConstantUtil;

import java.io.IOException;
import java.util.Properties;

/**
 * 智慧公务车信息平台-枚举信息类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
class EnumConstant {
	private static Properties properties = new Properties();
	static {
		try {
			properties.load(EnumConstant.class.getClassLoader().getResourceAsStream("props/enums.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>状态信息：启用</b>
	 */
	 static final Integer STATUS_ENABLE = Integer.parseInt(properties.getProperty("status.enable"));

	/**
	 * <b>状态信息：禁用</b>
	 */
     static final Integer STATUS_DISABLE = Integer.parseInt(properties.getProperty("status.disable"));

	/**
	 * <b>响应码信息：响应处理成功信息</b>
	 */
     static final Integer RESPONSE_SUCCESS = Integer.parseInt(properties.getProperty("response.success"));

	/**
	 * <b>响应码信息：响应处理失败信息</b>
	 */
	 static final Integer RESPONSE_ERROR = Integer.parseInt(properties.getProperty("response.error"));

	/**
	 * <b>响应码信息：响应处理异常信息</b>
	 */
	 static final Integer RESPONSE_EXCEPTION = Integer.parseInt(properties.getProperty("response.exception"));

}
