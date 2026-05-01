package q01_basic.question07;

import java.io.IOException;

public class SystemMain07 {

	public static void main(String[] args) {

		NumberList numberList = new NumberList();
		ConspleReader cr = new ConspleReader();
		 
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;
		//TODO ここから実装する
		try {
			limit = cr.inputNumber();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		numberList.addFromOneTo(limit);
		System.out.println(numberList.getNumbers());
	
		System.out.println("****************");
		System.out.println("Listの合計を計算します");
		int sum = 0;
		//合計取得
		sum = numberList.calcSumOfList();

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");
		// 2倍にする
		numberList.doubleListEachValue();

		// 表示
		System.out.println(numberList.getNumbers());
		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		// 前半削除
		numberList.removeIndexOfFirstHalf();

	}

}
