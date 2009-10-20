package com.taobao.top.mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * JSON属性注解。
 * 
 * @author carver.gu
 * @since 1.0, Sep 19, 2009
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.FIELD })
public @interface JsonProperty {

	/** JSON属性映射名称 **/
	public String value() default "";

}