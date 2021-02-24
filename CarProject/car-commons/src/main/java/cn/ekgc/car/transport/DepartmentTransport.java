package cn.ekgc.car.transport;

import cn.ekgc.car.base.pojo.VO.PageVO;
import cn.ekgc.car.base.pojo.VO.QueryVO;
import cn.ekgc.car.pojo.entity.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 部门传输层接口.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@FeignClient(name = "car-user-provider")
@RequestMapping("/department/transport")
public interface DepartmentTransport {
	/**
	 * <b>根据查询对象分页查询</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<Department>  getPageVOByQuery(@RequestBody QueryVO<Department> queryVO)throws Exception;


	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	List<Department> getListByQuery(@RequestBody Department query)throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	Department getById(@RequestParam String id)throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody Department entity)throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody Department entity)throws Exception;
}
