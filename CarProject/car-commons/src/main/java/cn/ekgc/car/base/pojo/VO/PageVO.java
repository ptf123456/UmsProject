package cn.ekgc.car.base.pojo.VO;

import cn.ekgc.car.util.ConstantUtil;
import java.io.Serializable;
import java.util.List;

/**
 * 智慧公务车信息平台-分页视图信息类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
public class PageVO<E> implements Serializable {
	private static final long serialVersionUID = -2991090703512876381L;
	private Integer pageNum;            // 当前页数
	private Integer pageSize;           // 每页显示数量
	private Integer draw;               // datatables 分页信息
	private List<E> list;               // 分页列表
	private Long totalCount;            // 总条数
	private Integer totalPage;          // 总页数

	public PageVO() {}

	public PageVO(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum>0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = ConstantUtil.PAGE_NUM;
		}
		if (pageNum!=null&&pageNum>0) {
			this.pageSize = pageSize;
		} else {
			this.pageNum = ConstantUtil.PAGE_SIZE;
		}
	}

	public PageVO(Integer pageNum, Integer pageSize, Integer draw) {
		if (pageNum != null&& pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = ConstantUtil.PAGE_NUM;
		}
		if (pageNum != null && pageNum > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageNum = ConstantUtil.PAGE_SIZE;
		}
		this.draw = draw;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}
	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}
