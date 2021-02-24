package cn.ekgc.car.util;

import cn.ekgc.car.base.pojo.VO.PageVO;
import cn.ekgc.car.pojo.entity.Department;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 分页工具类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public class PageUtil<E> {
	public  void parseFromPageInfoToPageVO(List<E> list, PageVO<E> pageVO){
		// 创建 pageInfo 对象
		PageInfo<E> pageInfo = new PageInfo<E>(list);
		// 从 pageInfo 中提取数据
		pageVO.setList(pageInfo.getList());
		pageVO.setTotalCount(pageInfo.getTotal());
		pageVO.setTotalPage(pageInfo.getPages());
	}
}
