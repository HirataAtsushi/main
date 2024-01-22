package curriculum_B;

public class Qes5 {public static void main(String[] args) {
	// 左辺iに1から９の数字を代入
	for (int i = 1; i <= 9; i++) {
		//右辺ｊに1から20の数字を代入
		for (int j = 1; j <= 20; j++) {
			//iとjを0埋めで３桁表記し、代入したi×ｊの計算をする。
			 System.out.printf("%03d * %03d = %03d || ", j,i, i * j);
		}
		//左辺が20になったら改行する
		System.out.println(); // 改行
	}
}
}
