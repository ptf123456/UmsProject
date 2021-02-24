package cn.ekgc.car.dao;

import cn.ekgc.car.pojo.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 部门数据持久层接口.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@Repository
public interface DepartmentDao {

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Department> findListByQuery(Department query) throws Exception;

	/**
	 * <b>保存对象信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(Department entity) throws Exception;

	/**
	 * <b>修改对象信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(Department entity) throws Exception;


}
