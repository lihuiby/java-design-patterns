package com.iluwatar.chain2;

/**
 * @Description:
 * @author: li
 * @Date: Created in 2020/11/21
 */
public class SoldierCommand extends TOrderHandler {

	public SoldierCommand(TOrderHandler next) {
		super(next);
	}

	@Override
	public void handlerOrder(TOrder order) {
		logger.info("------> {}, {}", order.getOrderType(), order.getDescript());
		super.handlerOrder(order);
	}
}
