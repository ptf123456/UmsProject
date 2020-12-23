package cn.ekgc.ums.Service.impl;

import cn.ekgc.ums.Service.UserService;
import cn.ekgc.ums.dao.UserDao;
import cn.ekgc.ums.pojo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findUserListQuery(User query) throws Exception {

		return null;
	}

	@Override
	public boolean saveUser(User user) throws Exception {
		int count = userDao.saveUser(user);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUser(User user) throws Exception {
		int count = userDao.updateUser(user);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUser(User user) throws Exception {
		int count = userDao.deleteUser(user);
		if (count>0){
			return true;
		}
		return false;
	}
}
