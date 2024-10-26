package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * Ʒ?
 * 
 * @author SatanKiss
 * @email 2036736521@qq.com
 * @date 2024-06-01 20:02:47
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Ʒ??id
	 */
	@TableId
	private Long brandId;
	/**
	 * Ʒ???
	 */
	@NotBlank(message = "品牌名必须提交")
	private String name;
	/**
	 * Ʒ??logo??ַ
	 */
	@URL(message = "logo必须是一个合法的url地址")
	@NotEmpty
	private String logo;
	/**
	 * ???
	 */
	private String descript;
	/**
	 * ??ʾ״̬[0-????ʾ??1-??ʾ]
	 */
	@TableLogic(value = "1",delval = "0")
	private Integer showStatus;
	/**
	 * ????????ĸ
	 */
	@Pattern(regexp = "/^[a-zA-z]$/",message = "检索首字母必须是一个字母")
	private String firstLetter;
	/**
	 * ???
	 */
	@Min(value = 0,message = "排序必须大于等于0")
	@NotNull
	private Integer sort;

}
