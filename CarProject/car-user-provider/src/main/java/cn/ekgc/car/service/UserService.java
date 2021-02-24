package cn.ekgc.car.service;

import cn.ekgc.car.base.pojo.VO.PageVO;
import cn.ekgc.car.pojo.entity.Role;
import cn.ekgc.car.pojo.entity.User;

import java.util.List;

/**
 * 用户业务层接口实现类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public interface UserService {
	/**
	 * <b>根据查询对象进行分页查询</b>
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	PageVO<User> getPageVOByQuery(User query, PageVO<User> pageVO)throws Exception;

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<User> getListByQuery(User query)throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	User getById(String id)throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean save(User entity)throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean update(User entity)throws Exception;
}
