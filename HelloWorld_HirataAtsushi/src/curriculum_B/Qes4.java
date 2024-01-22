package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		// 左辺iに1から９の数字を代入
		for (int i = 1; i <= 9; i++) {
			//右辺ｊに1から９の数字を代入
			for (int j = 1; j <= 9; j++) {
				//iとjを0埋めで２桁表記し、代入したi×ｊの計算をする。
				 System.out.printf("%02d * %02d = %02d || ", i, j, i * j);
			}
			//右辺が9になったら改行する
			System.out.println(); 
		}
	}
}
