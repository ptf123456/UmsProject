package cn.ekgc.car.controller;

import cn.ekgc.car.base.controller.BaseController;
import cn.ekgc.car.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 部门信息功能控制层.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@Controller("departmentController")
@RequestMapping("/user")
public class DepartmentController extends BaseController {

	@Resource(name = "departmentService")
	private DepartmentService departmentService;


}
