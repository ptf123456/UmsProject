package cn.ekgc.car.service;

import cn.ekgc.car.base.pojo.VO.PageVO;
import cn.ekgc.car.pojo.entity.Department;


import java.util.List;

/**
 * 部门业务层接口.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public interface DepartmentService {
	/**
	 * <b>根据查询对象进行分页查询</b>
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	PageVO<Department> getPageVOByQuery(Department query,PageVO<Department> pageVO)throws Exception;

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Department> getListByQuery(Department query)throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Department getById(String id)throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean save(Department entity)throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean update(Department entity)throws Exception;


}
