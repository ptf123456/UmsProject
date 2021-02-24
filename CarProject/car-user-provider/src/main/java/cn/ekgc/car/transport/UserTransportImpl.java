package cn.ekgc.car.transport;

import cn.ekgc.car.base.pojo.VO.PageVO;
import cn.ekgc.car.base.pojo.VO.QueryVO;
import cn.ekgc.car.pojo.entity.Role;
import cn.ekgc.car.pojo.entity.User;
import cn.ekgc.car.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户传输层接口实现类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@RestController("userTransport")
@RequestMapping("/user/transport")
public class UserTransportImpl implements UserTransport{

	@Autowired
	private UserService Service;

	/**
	 * <b>根据查询对象分页查询</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	@Override
	public PageVO<User> getPageVOByQuery(@RequestBody QueryVO<User> queryVO) throws Exception {
		// 从查询视图中获得分页视图和查询对象
		User query = queryVO.getQuery();
		PageVO<User> pageVO = queryVO.getPageVO();
		return Service.getPageVOByQuery(query,pageVO);
	}

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	@Override
	public List<User> getListByQuery(@RequestBody User query) throws Exception {
		return Service.getListByQuery(query);
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	@Override
	public User getById(@RequestParam String id) throws Exception {
		return Service.getById(id);
	}

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	@Override
	public boolean save(@RequestBody User entity) throws Exception {
		return Service.save(entity);
	}

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	@Override
	public boolean update(@RequestBody User entity) throws Exception {
		return Service.update(entity);
	}
}
