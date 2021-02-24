package cn.ekgc.car.pojo.entity;

import cn.ekgc.car.base.pojo.entity.BaseEntity;
import java.util.List;
/**
 * 菜单实体信息.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public class Menu extends BaseEntity {
	private static final long serialVersionUID = -9023579104631355450L;
	private String id;                  // 角色主键
	private String text;                // 菜单文本
	private String code;                // 菜单编码
	private String url;                 // 链接地址
	private String icon;                // 菜单图标
	private Menu parent;                // 上级菜单
	private List<Menu> children;        // 下级菜单列表
	private List<Role> roleList;        // 拥有该菜单角色列表

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Menu getParent() {
		return parent;
	}

	public void setParent(Menu parent) {
		this.parent = parent;
	}

	public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
}
