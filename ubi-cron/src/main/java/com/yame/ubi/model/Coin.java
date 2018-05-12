package com.yame.ubi.model;

import java.io.Serializable;

public class Coin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mobile; 
	private int coin;
	private String memo; 
	private String identification;
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
}
