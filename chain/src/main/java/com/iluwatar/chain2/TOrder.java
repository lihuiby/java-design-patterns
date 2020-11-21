package com.iluwatar.chain2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @author: li
 * @Date: Created in 2020/11/21
 */
public class TOrder {

	private Logger logger = LoggerFactory.getLogger(TOrder.class);

	private TOrderType orderType;
	private String descript;
	private boolean handler;

	public TOrder(TOrderType orderType, String descript) {
		this.orderType = orderType;
		this.descript = descript;
	}

	public TOrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(TOrderType orderType) {
		this.orderType = orderType;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public boolean isHandler() {
		return handler;
	}

	public void setHandler(boolean handler) {
		this.handler = handler;
	}

	public void makeHandler() {
		this.handler = Boolean.TRUE;
	}

}
