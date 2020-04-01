package cn.wolfcode.ssm.query;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author 红烛
 *
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class QueryObject {
	/**
	 * 默认当前页
	 */
	private int currentPage=1;
	/**
	 * 每页显示的数据条数
	 */
	private int pageSize=3;
	/**
	 * 当前页第一条数据的索引
	 * @return
	 */
	public int getBeginIndex(){
		return (this.currentPage-1)*this.pageSize;
		
	}
}
