package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.user.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class UserGetRequest implements TopRequest {

	/** 需要返回的用户字段列表 */
	private String fields;

	/** 用户昵称 */
	private String nick;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getApiName() {
		return "taobao.user.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("nick", this.nick);

		return params;
	}

}