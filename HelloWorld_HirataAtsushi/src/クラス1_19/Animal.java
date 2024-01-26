package クラス1_19;
//SimpleDateFormatクラスをインポート。
import java.text.SimpleDateFormat;
//Dateクラスをインポート
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		//Dogインスタンスの生成
		Dog dogname = new Dog();
		//インスタンス変数に定義した動物の名前を出力。
		System.out.println(dogname.AnimalName);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		//Dogインスタンス（オーバーロード）の生成。
		Dog dogcount = new Dog(3);
		//インスタンス変数に定義した動物の数を出力。
		System.out.println(dogcount.AnimalCount);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		//現在の日時取得 
		Date currentDate = new Date();

		//yyyy-MM-dd H:m:s形式を変数にセットしている。
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
	    //上記を現在の日付に適応する。
	    String formattedDate = dateFormat.format(currentDate);

	    // コンソールに出力
	    System.out.println( formattedDate);
	}
}