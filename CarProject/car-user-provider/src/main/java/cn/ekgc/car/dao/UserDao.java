package cn.ekgc.car.dao;
import cn.ekgc.car.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户数据持久层接口.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@Repository
public interface UserDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<User> findListByQuery(User query) throws Exception;

	/**
	 * <b>保存对象信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(User entity) throws Exception;

	/**
	 * <b>修改对象信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(User entity) throws Exception;
}
