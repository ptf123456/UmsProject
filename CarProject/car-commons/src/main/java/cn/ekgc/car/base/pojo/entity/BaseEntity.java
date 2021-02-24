package cn.ekgc.car.base.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 智慧公务车信息平台-基础实体信息.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = -7016044733526108568L;
	private Integer status;               // 系统状态：0-禁用 1-启用
	private String createUser;            // 创建人
	private Date createTime;              // 创建时间
	private Date updateTime;              // 修改时间
	private String updateUser;            // 修改人

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
}
