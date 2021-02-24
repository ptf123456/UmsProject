package cn.ekgc.car.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * redis 测试.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@RestController("redisDemo")
@RequestMapping("/redis")
public class RedisDemo {
	@Autowired
	private StringRedisTemplate redisTemplate;

	@RequestMapping("/save/{name}")
	public boolean save(@PathVariable("name") String name) throws Exception{
		// 使用StringRedisTemplate 操作 redis
		redisTemplate.opsForValue().set("name",name);
		return true;
	}

	@RequestMapping("/get/{key}")
	public String get(@PathVariable String key) throws Exception {
		// 使用StringRedisTemplate 获取 redis 的key
		String value = redisTemplate.opsForValue().get(key);
		return value;
	}
}
