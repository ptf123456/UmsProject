package cn.ekgc.car.service.impl;

import cn.ekgc.car.base.pojo.VO.PageVO;
import cn.ekgc.car.dao.DepartmentDao;
import cn.ekgc.car.pojo.entity.Department;
import cn.ekgc.car.service.DepartmentService;
import cn.ekgc.car.util.IdGeneratory;
import cn.ekgc.car.util.PageUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;

/**
 * 部门业务层接口实现类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao dao;
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
	public PageVO<Department> getPageVOByQuery(Department query, PageVO<Department> pageVO) throws Exception {
		// 打开pageHelper分页过滤器
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		// 进行列表查询
		List<Department> list = dao.findListByQuery(query);
		// 创建分页对象 PageUtil
		PageUtil<Department> pageUtil = new PageUtil<Department>();
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
	public List<Department> getListByQuery(Department query) throws Exception {
		return dao.findListByQuery(query);
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public Department getById(String id) throws Exception {
		// 创建查询对象
		Department query = new Department();
		query.setId(id);

		// 进行列表查询
		List<Department> list = dao.findListByQuery(query);
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
	public boolean save(Department entity) throws Exception {
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
	public boolean update(Department entity) throws Exception {
		if (dao.update(entity) > 0) {
			return true;
		}
		return false;
	}
}
