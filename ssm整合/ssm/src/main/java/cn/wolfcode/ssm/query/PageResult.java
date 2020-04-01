package cn.wolfcode.ssm.query;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import cn.wolfcode.ssm.domain.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 分页数据信息集合
 * @author 红烛
 *
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class PageResult {
	/**
	 * 默认当前页
	 */
	private int currentPage=1;
	/**
	 * 每页显示的数据条数
	 */
	private int pageSize=3;
	/**
	 * 当前页所有用户信息
	 */
	private List<Employee> listDate;
	/**
	 * 数据总条数
	 */
	private int totalCount;
	/**
	 * 前一页
	 */
	private int prevPage;
	/**
	 * 下一页
	 */
	private int nextPage;
	/**
	 * 总页数
	 */
	private int totalPage;
	/**
	 * 当无数据时
	 */
	@Getter
	private static final PageResult EMPTY_PAGE=new PageResult(1,1,Collections.emptyList(),0);
	
/*	public PageResult(int currentPage, int pageSize) {
		this(currentPage, pageSize, new ArrayList<Employee>(), 0);
	}*/
	
	
	
	
	public PageResult(int currentPage, int pageSize, List<Employee> listDate, int totalCount) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.listDate = listDate;
		this.totalCount = totalCount;
		if(totalCount<=pageSize){
			this.nextPage=1;
			this.prevPage=1;
			this.totalPage=1;
		}
		this.totalPage=this.totalCount % this.pageSize ==0 ? this.totalCount/this.pageSize : this.totalCount/this.pageSize+1;
		this.prevPage=this.currentPage-1>1 ? this.currentPage-1 : 1;
		this.nextPage=this.currentPage+1>this.totalPage ? this.totalPage : this.currentPage+1;
	}
	
	
}
