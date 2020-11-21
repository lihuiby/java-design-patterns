package com.iluwatar.chain2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @author: li
 * @Date: Created in 2020/11/21
 */
public class KingCommand extends TOrderHandler {

	public KingCommand(TOrderHandler next) {
		super(next);
	}

	@Override
	public void handlerOrder(TOrder order) {
		logger.info("--> {}, {}", order.getOrderType(), order.getDescript());
		super.handlerOrder(order);
	}

}
