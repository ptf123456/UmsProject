package cn.ekgc.car.service.impl;

import cn.ekgc.car.base.pojo.VO.PageVO;
import cn.ekgc.car.dao.RoleDao;
import cn.ekgc.car.dao.UserDao;
import cn.ekgc.car.pojo.entity.Role;
import cn.ekgc.car.pojo.entity.User;
import cn.ekgc.car.service.UserService;
import cn.ekgc.car.util.IdGeneratory;
import cn.ekgc.car.util.PageUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户业务层接口实现类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
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
	public PageVO<User> getPageVOByQuery(User query, PageVO<User> pageVO) throws Exception {
		// 打开pageHelper分页过滤器
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		// 进行列表查询
		List<User> list = dao.findListByQuery(query);
		// 创建分页对象 PageUtil
		PageUtil<User> pageUtil = new PageUtil<User>();
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
	public List<User> getListByQuery(User query) throws Exception {

		return dao.findListByQuery(query);
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public User getById(String id) throws Exception {
		// 创建查询对象
		User query = new User();
		query.setId(id);

		// 进行列表查询
		List<User> list = dao.findListByQuery(query);
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
	public boolean save(User entity) throws Exception {
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
	public boolean update(User entity) throws Exception {
		if (dao.update(entity) > 0) {
			return true;
		}
		return false;
	}
}
