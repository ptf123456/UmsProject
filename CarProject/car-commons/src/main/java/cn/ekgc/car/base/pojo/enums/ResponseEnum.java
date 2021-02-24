package cn.ekgc.car.base.pojo.enums;

/**
 * <b>响应枚举信息</b>.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public enum ResponseEnum {
	RESPONSE_SUCCESS(EnumConstant.RESPONSE_SUCCESS,"系统响应成功"),
	RESPONSE_ERROR(EnumConstant.RESPONSE_ERROR,"响应失败"),
	RESPONSE_EXCEPTION(EnumConstant.RESPONSE_EXCEPTION,"响应异常");


	private  Integer code;          // 编码
	private  String remark;         // 说明

	private ResponseEnum(Integer code,String remark){
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
