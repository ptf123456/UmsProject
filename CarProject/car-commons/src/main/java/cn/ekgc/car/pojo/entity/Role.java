package cn.ekgc.car.pojo.entity;

import cn.ekgc.car.base.pojo.entity.BaseEntity;

import java.util.List;


/**
 * 角色实体信息.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public class Role extends BaseEntity {
	private static final long serialVersionUID = -4154994503048416225L;
	private String id;                  // 角色主键
	private String name;                // 角色名称
	private List<Menu> menuList;        // 该角色所拥有的菜单
	private String code;                // 角色编码

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
