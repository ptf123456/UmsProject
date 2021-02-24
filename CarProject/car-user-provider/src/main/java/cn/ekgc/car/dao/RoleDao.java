package cn.ekgc.car.dao;

import cn.ekgc.car.pojo.entity.Role;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 角色数据持久层接口.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@Repository
public interface RoleDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Role> findListByQuery(Role query) throws Exception;

	/**
	 * <b>保存对象信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(Role entity) throws Exception;

	/**
	 * <b>修改对象信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(Role entity) throws Exception;
}
