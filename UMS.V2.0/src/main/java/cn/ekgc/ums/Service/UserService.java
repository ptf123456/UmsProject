package cn.ekgc.ums.Service;

import cn.ekgc.ums.pojo.entity.User;
import java.util.List;

/**
 *
 */

public interface UserService {

	List<User> findUserListQuery(User query)throws Exception;
	boolean saveUser(User user)throws Exception;
	boolean updateUser(User user)throws Exception;
	boolean deleteUser(User user)throws Exception;
}
