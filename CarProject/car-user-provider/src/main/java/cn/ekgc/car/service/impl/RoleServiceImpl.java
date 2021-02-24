package cn.ekgc.car.service.impl;

import cn.ekgc.car.base.pojo.VO.PageVO;
import cn.ekgc.car.dao.RoleDao;
import cn.ekgc.car.pojo.entity.Department;
import cn.ekgc.car.pojo.entity.Role;
import cn.ekgc.car.service.RoleService;
import cn.ekgc.car.util.IdGeneratory;
import cn.ekgc.car.util.PageUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 角色信息业务层接口实现类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao dao;
	@Autowired
	private IdGeneratory idGeneratory;

	/**
	 * <b>根据查询对象进行分页查询</b>
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageVO<Role> getPageVOByQuery(Role query, PageVO<Role> pageVO) throws Exception {
		// 打开pageHelper分页过滤器
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		// 进行列表查询
		List<Role> list = dao.findListByQuery(query);
		// 创建分页对象 PageUtil
		PageUtil<Role> pageUtil = new PageUtil<Role>();
		pageUtil.parseFromPageInfoToPageVO(list,pageVO);
		return pageVO;
	}

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Role> getListByQuery(Role query) throws Exception {

		return dao.findListByQuery(query);
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public Role getById(String id) throws Exception {
		// 创建查询对象
		Role query = new Role();
		query.setId(id);

		// 进行列表查询
		List<Role> list = dao.findListByQuery(query);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(Role entity) throws Exception {
		// 设定数据的主键
		entity.setId(idGeneratory.createId());
		// 保存数据
		if (dao.save(entity) > 0) {
			return true;
		}
		return false;
	}

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(Role entity) throws Exception {
		if (dao.update(entity) > 0) {
			return true;
		}
		return false;
	}
}
