package com.iluwatar.chain2;

import com.iluwatar.chain.OrcKing;

/**
 * @Description:
 * 		王, 组长, 士兵
 * 		进攻, 防御, 吃饭, 睡觉
 * @author: li
 * @Date: Created in 2020/11/21
 */
public class App {

	public static void main(String[] args) {
		var ocrKing = new OcrKing();
		ocrKing.makeDesction(new TOrder(TOrderType.ATTACK, "进攻"));
	}

}
