package com.yame.ubi.model;

import java.io.Serializable;
import java.util.Date;

public class ObdImmediate implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long sessionId;
	private String terminalId;// 终端ID
	private Double enginTemplate;// 温度
	private Date createTime;// 数据上报时间
	private Integer status;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSessionId() {
		return sessionId;
	}
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public Double getEnginTemplate() {
		return enginTemplate;
	}
	public void setEnginTemplate(Double enginTemplate) {
		this.enginTemplate = enginTemplate;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

}
