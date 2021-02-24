package cn.ekgc.car.pojo.entity;

import cn.ekgc.car.base.pojo.entity.BaseEntity;


/**
 * 部门实体信息.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public class Department extends BaseEntity {
	private static final long serialVersionUID = 5518622199046532662L;
	private String id;          // 部门主键
	private String name;        // 部门名称
	private String code;        // 部门编码

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
