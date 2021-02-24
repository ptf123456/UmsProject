package cn.ekgc.car.dao;

import cn.ekgc.car.pojo.entity.Menu;
import cn.ekgc.car.pojo.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 菜单数据持久层接口.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@Repository
public interface MenuDao {
	/**
	 * <b>根据角色和上级菜单查询对应的菜单列表</b>
	 * @param queryMap
	 * @return
	 * @throws Exception
	 */
	List<Menu> findMenuListForIndexByQuery(Map<String, Object> queryMap) throws Exception;


	/**
	 * <b>保存对象信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(Menu entity) throws Exception;

	/**
	 * <b>修改对象信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(Menu entity) throws Exception;
}
