package Eva01;

import java.util.Random;

public class Lottery {
	
	private int lotteryNum;
	
	
	
	//コンストラクタ
	public Lottery() {
		super();
		Random rand = new Random();
		lotteryNum = rand.nextInt(2);
//		System.out.println("lotterNum : " + lotteryNum);
	}
	
	
	
	
	//getter, setter
	public int getLotteryNum() {
		return lotteryNum;
	}


	public void setLotteryNum(int lotteryNum) {
		this.lotteryNum = lotteryNum;
	}

}
