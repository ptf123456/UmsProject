package cn.ekgc.car.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * redis操作工具类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@Component("redisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate redisTemplate;

	/**
	 * <b>根据 key 将对应的 value 存储在 redis 中</b>
	 * @param key
	 * @param value
	 * @return
	 * @throws Exception
	 */
	private boolean saveToRedis(String key , Object value) throws Exception{
		// 将 object 类型的 value 变为 String 类型 json
		String valueJson = JsonUtil.parseToJSON(value);
		// 根据 key 将变换后的 value 存储到 redis 中
		redisTemplate.opsForValue().set(key , valueJson);
		// 为存入的信息设定过期时间  30分钟后失效
		redisTemplate.expire(key , ConstantUtil.EXPIRE_MINUTE, TimeUnit.MINUTES);

		return true;
	}

	/**
	 * <b>根据 key 从 redis 中获取数据对象</b>
	 * @param key
	 * @param argClass
	 * @return
	 * @throws Exception
	 */
	public Object getFromRedis(String key, Class argClass) throws Exception {
		// 根据 key 获得存储在 redis 中 json
		String valueJson = redisTemplate.opsForValue().get(key);
		// 判断所获取的值是否存在
		if (valueJson != null ) {
			// 根据 key 获得了存储在 redis 中的值，那么将该 json 变为对象
			return JsonUtil.parseToObject(key , argClass);
		}
		return null;
	}
}
