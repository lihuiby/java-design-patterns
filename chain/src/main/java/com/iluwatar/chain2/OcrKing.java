package com.iluwatar.chain2;

/**
 * @Description:
 * @author: li
 * @Date: Created in 2020/11/21
 */
public class OcrKing {

	private TOrderHandler chain;

	public OcrKing() {
		chain = makeKingChain();
	}

	private TOrderHandler makeKingChain() {
		return new KingCommand(new GroupLeaderCommand(new SoldierCommand(null)));
	}

	public void makeDesction(TOrder order) {
		chain.handlerOrder(order);
	}

}
