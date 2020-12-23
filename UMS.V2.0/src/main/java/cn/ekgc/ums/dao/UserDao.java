package cn.ekgc.ums.dao;

import cn.ekgc.ums.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

	List<User> findUserListQuery(User query) throws Exception;

	int updateUser(User user)throws Exception;

	int saveUser(User user)throws Exception;

	int deleteUser(User user)throws Exception;

}
