package cn.ekgc.car.pojo.entity;

import cn.ekgc.car.base.pojo.entity.BaseEntity;



/**
 * 用户实体类信息.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public class User extends BaseEntity {
	private static final long serialVersionUID = -8003986094537159487L;
	private String id;                  // 用户主键
	private String name;                // 用户名称
	private String cellphone;           // 用户手机号
	private String password;            // 登录密码
	private Role role;                  // 用户角色
	private String email;               // 电子邮箱
	private Department department;      // 用户所在部门
	private String avatar;              // 用户照片


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}



}
