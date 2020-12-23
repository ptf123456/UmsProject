package cn.ekgc.ums.controller;

import cn.ekgc.ums.Service.UserService;
import cn.ekgc.ums.controller.base.BaseController;
import cn.ekgc.ums.pojo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

/**
 * <b>用户功能控制层</b>
 * @author ptf
 * @version 2.0.0
 */

@Controller("userController")
@RequestMapping("/user")
public class UserController extends BaseController{
	@Resource(name = "userService")
	private UserService userService;
	/**
	 * <b>转发到添加页面</b>
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/save",method = RequestMethod.GET)
	public String forwardAddPage()throws Exception{
		return "user_save";
	}



	/**
	 * <b>保存用户信息</b>
	 * @param  user
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "save",method = RequestMethod.POST)
	@ResponseBody
	public boolean saveUser(User user) throws Exception {
		return userService.saveUser(user);
	}

	/**
	 * <b>修改用户信息</b>
	 * @param  user
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "update",method = RequestMethod.POST)
	@ResponseBody
	public boolean updateUser(User user) throws Exception {
		return userService.updateUser(user);
	}

	/**
	 * <b>删除用户信息</b>
	 * @param  user
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "delete",method = RequestMethod.POST)
	@ResponseBody
	public boolean deleteUser(User user) throws Exception {
		return userService.deleteUser(user);
	}

}
