package cn.ekgc.car.service;

import cn.ekgc.car.base.pojo.VO.PageVO;
import cn.ekgc.car.pojo.entity.Role;
import java.util.List;

/**
 * 角色业务层接口.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public interface RoleService {
	/**
	 * <b>根据查询对象进行分页查询</b>
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	PageVO<Role> getPageVOByQuery(Role query, PageVO<Role> pageVO)throws Exception;

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Role> getListByQuery(Role query)throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Role getById(String id)throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean save(Role entity)throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean update(Role entity)throws Exception;
}
