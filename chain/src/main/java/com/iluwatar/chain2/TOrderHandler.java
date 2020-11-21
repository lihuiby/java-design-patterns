package com.iluwatar.chain2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @author: li
 * @Date: Created in 2020/11/21
 */
public class TOrderHandler {

	protected Logger logger = LoggerFactory.getLogger(TOrderHandler.class);

	private TOrderHandler next;

	public TOrderHandler(TOrderHandler next) {
		this.next = next;
	}

	public void handlerOrder(TOrder order) {
		if(next != null) {
			next.handlerOrder(order);
		}
//		logger.info("处理: {} : {}", order.getOrderType(), order.getDescript());
		order.makeHandler();
	}
}
