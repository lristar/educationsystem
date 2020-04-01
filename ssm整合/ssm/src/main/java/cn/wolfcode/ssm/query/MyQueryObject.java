package cn.wolfcode.ssm.query;
/**
 * 条件查询 参数
 * @author 红烛
 *
 */

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
public class MyQueryObject extends QueryObject{
	/**
	 * 条件查询名称
	 */
	private String str;
}
