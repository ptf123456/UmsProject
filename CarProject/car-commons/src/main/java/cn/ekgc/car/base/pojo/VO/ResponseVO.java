package cn.ekgc.car.base.pojo.VO;

import cn.ekgc.car.base.pojo.enums.ResponseEnum;

import java.io.Serializable;

/**
 * 响应视图信息.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = -2091711220291029670L;

	private Integer code;       // 系统响应编码
	private E data;             // 响应数据

	private ResponseVO(Integer code) {
		this.code = code;
	}

	private ResponseVO(Integer code, E data) {
		this.code = code;
		this.data = data;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	/**
	 * <b>获得系统响应成功信息</b>
	 * @return
	 */
	public static  ResponseVO successResponseVO(){
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS.getCode());
	}

	/**
	 * <b>获得系统响应成功信息</b>
	 * @param data
	 * @return
	 */
	public static  ResponseVO successResponseVO(Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS.getCode(),data);
	}

	/**
	 *<b>获得系统响应失败信息</b>
	 * @param data
	 * @return
	 */
	public static  ResponseVO errorResponseVO(Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_ERROR.getCode(),data);
	}

	/**
	 *<b>获得系统响应异常信息</b>
	 * @param data
	 * @return
	 */
	public static  ResponseVO exceptionResponseVO(Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_EXCEPTION.getCode(),data);
	}

}
