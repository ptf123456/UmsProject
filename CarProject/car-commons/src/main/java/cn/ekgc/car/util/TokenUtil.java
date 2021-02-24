package cn.ekgc.car.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统Token工具类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public class TokenUtil {
	private static Algorithm algorithm = Algorithm.HMAC256(ConstantUtil.SECURITY_KEY);


	/**
	 * <b>使用主键生成 Token 信息</b>
	 * @param id
	 * @return
	 */
	public static String createToken(String id) {
		try {
			// 设置头部信息
			Map<String , Object> headerMap = new HashMap<String , Object>();
			headerMap.put("Type","jwt");
			headerMap.put("alg","HMAC256");

			// 获得过期时间
			Integer expireMinute = ConstantUtil.EXPIRE_MINUTE;
			// 根据过期时间，计算过期的 Date 类型
			Date expireDate = new Date(new Date().getTime() + expireMinute * 60 * 1000);

			// 设置生成的 Token 信息
			return JWT.create()
					.withHeader(headerMap)
					.withClaim("id",id)
					.withExpiresAt(expireDate)
					.sign(algorithm);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * <b>检验 token 是否正确，并且获得对应的用户 id （解析秘钥）</b>
	 * @param token
	 * @return
	 */
	public static String verifyToken(String token) {
		try {
			JWTVerifier verifier = JWT.require(algorithm).build();
			DecodedJWT jwt = verifier.verify(token);
			return jwt.getClaim("id").asString();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(createToken("彭腾飞"));
	}
}
