package cn.ekgc.car.util;


import java.util.Properties;

/**
 * 智慧公务车信息平台-常量工具类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public class ConstantUtil {
	private static Properties properties = new Properties();

	static {
		try {
			// 加载 properties 配置文件
			properties.load(ConstantUtil.class.getClassLoader().getResourceAsStream("props/system.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>分页信息：当前页数</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(properties.getProperty("page.num"));

	/**
	 * <b>分页信息：每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(properties.getProperty("page.size"));

	/**
	 * <b>秘钥信息：加密私钥</b>
	 */
	public static final String  SECURITY_KEY = properties.getProperty("Security.key");

	/**
	 * <b>秘钥：过期时间</b>
	 */
	public static final Integer  EXPIRE_MINUTE = Integer.parseInt(properties.getProperty("expire.minute"));
}
