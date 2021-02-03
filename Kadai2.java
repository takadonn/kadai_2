import java.util.Random;

public class Kadai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("同じカードが出力されたらもう一回");
		System.out.println("ロイヤルフラッシュ\r\n"
				+ "（ロイヤルストレートフラッシュ）\r\n"
				+ "同じスートで 10,J,Q,K,A\r\n"
				+ "例）5 枚ともスペードのスートで 10,J,Q,K,A\r\n"
				+ "ストレートフラッシュ 連続した数字。K の続きは A となる。スートは問わない。\r\n"
				+ "例）5 枚ともスペードのスートで Q,K,A,2,3\r\n"
				+ "フォーカード 同じ数字が 4 つ。残り 1 枚の数字は問わない。スートは問わない。\r\n"
				+ "例）A が 4 枚と任意の 1 枚\r\n"
				+ "フルハウス 同じ数字が 3 つと別の同じ数字が 2 つ。スートは問わない。\r\n"
				+ "例）K が 3 枚と 5 が 2 枚\r\n"
				+ "フラッシュ 5 つとも同じスート。数字は問わない。\r\n"
				+ "例）5 枚ともハートのスート\r\n"
				+ "ストレート 連続した数字。K の続きは A となる。スートは問わない。\r\n"
				+ "例）数字が 3,4,5,6,7\r\n"
				+ "スリーカード 同じ数字が 3 つ。残りの数字は問わない。スートは問わない。\r\n"
				+ "例）7 が 3 枚\r\n"
				+ "ツーペア 同じ数字 2 つが 2 組。残りの数字は問わない。スートは問わない。\r\n"
				+ "例）5 が 2 枚\r\n"
				+ "ワンペア 同じ数字が 2 つ。残りの数字は問わない。スートは問わない。\r\n"
				+ "例）9 が 2 枚\r\n"
				+ "上記以外はブタ");


Random toranpu = new Random();
 for(int i = 0; i < 5 ; i ++ ) {


int kigou = toranpu.nextInt(4);
switch(kigou) {
case 0:
System.out.print("♠");
break;

case 1:
	System.out.print("♣");
break;
case 2:

	System.out.print("♥");
break;
case 3:

	System.out.print("♦");
break;
}


int kazu = toranpu.nextInt(3);
	if (kazu == 0) {


		int arufabetto = toranpu.nextInt(4);
		switch(arufabetto) {
		case 0:
		System.out.println("A");
		break;

		case 1:
			System.out.println("J");
		break;
		case 2:

			System.out.println("Q");
		break;
		case 3:

			System.out.println("K");
		break;
		}


	}else {

		int suuji = toranpu.nextInt(9);
		switch(suuji) {
		case 0:
		System.out.print("2");
		break;

		case 1:
			System.out.print("3");
		break;
		case 2:

			System.out.print("4");
		break;
		case 3:

			System.out.print("5");
		break;
		case 4:
			System.out.print("6");
			break;

			case 5:
				System.out.print("7");
			break;
			case 6:

				System.out.print("8");
			break;
			case 7:

				System.out.print("9");
			break;
			case 8:
			System.out.print("10");
		break;

		}
	}


	}













	}

}
