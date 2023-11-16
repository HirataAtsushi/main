package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
// 問題1
		// バイト型ローカル変数として宣言。
		byte by;

		// 短整数型ローカル変数として宣言。
		short sh;

		// 整数型ローカル変数として宣言。
		int in;

		// 長整数型ローカル変数として宣言。
		long lo;

		// 単精度浮動小数点数型ローカル変数として宣言。
		float fl;

		// 倍精度浮動小数点数型ローカル変数として宣言。
		double dou;

		// 文字型ローカル変数として宣言。
		char ch;

		// 文字列型ローカル変数として宣言。
		String st;

		// ブーリアン型ローカル変数として宣言。
		boolean bo;
// 問題2
		// バイト型の初期値を代入。
		by = 0;

		// 短整数型の初期値を代入。
		sh = 0;

		// 整数型の初期値を代入。
		in = 0;

		// 長整数型の初期値を代入。
		lo = 0L;

		// 単精度浮動小数点数型の初期値を代入。
		fl = 0.0f;

		// 倍精度浮動小数点数型の初期値を代入。
		dou = 0.0d;

		// 文字型の初期値を代入。
		ch = '\u0000';

		// 文字列型の初期値を代入。)
		st = null;

		// ブーリアン型の初期値を代入。
		bo = false;
// 問題3
		// 初期化をしたバイト型に10を代入。
		by = 10;
		// 初期化をした短整数型に100を代入。
		sh = 100;
		// 初期化をした整数型に1000を代入。
		in = 1000;
		// 初期化をした長整数型に10000を代入。
		lo = 10000L;
		// 初期化をした単精度浮動小数点型に9.5を代入。
		fl = 9.5f;
		// 初期化をした倍精度浮動小数点型に10.5を代入。
		dou = 10.5;
		// 初期化をした文字型にaを代入。
		ch = 'a';
		// 初期化をした文字列型にハローを代入。
		st = "ハロー";
		// 初期化をしたブーリアン型にtrueを代入。
		bo = true;
// 問題4
		// 11110をコンソールに出力させる。
		System.out.println(by + sh + in + lo);
		// 20をコンソールに出力させる。
		System.out.println(by * 2);
		// a ハロー trueをコンソールに出力させる。
		System.out.println(ch + st + bo);
		// 数字を全て足して11130をコンソールに出力させる。
		System.out.println(by + sh + in + lo + fl + dou);
		// 小数点以外の数字を全てかけて10000000000をコンソールに出力させる。
		System.out.println(by * sh * in * lo);
		// 10.5割る100をして0.105をコンソールに出力させる。
		System.out.println(dou / sh);
		// 10引く100をして-90をコンソールに出力させる。
		System.out.println(by - sh);
// 問題5
		// String num="20"を整数型で宣言するように修正しハローJAVA43と表示させる。
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
// 問題6		
		// ローカル変数に山田太郎を代入。
		String name = "山田太郎";
		// ローカル変数に18歳を代入。
		int age = 18;
		// ローカル変数に170.5cmを代入。
		double height = 170.5;
		// ローカル変数に62.2kgを代入。
		double weight = 62.2;
		// ローカル変数に寿司を代入。
		String food = "寿司";
		// 代入したものを○○に入れる。
		//「初めまして○○です」
		System.out.println("初めまして" + name + "です");
		//「年齢は○○歳です」
		System.out.println("年齢は" + age + "歳です");
		//「身長は○○cmです」
		System.out.println("身長は" + height + "㎝です");
		//「体重は○○kgです」
		System.out.println("体重は" + weight + "㎏です");
		//「好きな食べ物は○○です」
		System.out.println("好きな食べ物は" + food + "です");
// 問題7		
		// BMIは○○です
		double bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMIは" + ((double)Math.round(bmi*10))/10 + "です");
// 問題8		
		// 名前を鈴木一郎に宣言
		name = "鈴木一郎";
		// 年齢を24歳に宣言
		age = 24;
		// 身長を168.5に宣言
		height = 168.5;
		// 体重を64.2に宣言
		weight = 64.2;
		// 好きな食べ物をオムライスに宣言
		food = "オムライス";
		// BMIを22.6に宣言
		// 身長をメートル表記で宣言
		bmi = weight / ((height/100) * (height/100));
		//「初めまして○○です」
		System.out.println("初めまして" + name + "です");
		//「年齢は○○歳です」
		System.out.println("年齢は" + age + "歳です");
		//「身長は○○cmです」
		System.out.println("身長は" + height + "㎝です");
		//「体重は○○kgです」
		System.out.println("体重は" + weight + "㎏です");
		//「好きな食べ物は○○です」
		System.out.println("好きな食べ物は" + food + "です");
		// BMIは○○です
		System.out.println("BMIは" + ((double)Math.round(bmi*10))/10  + "です");
// 問題9
		//「初めまして○○です」
		System.out.println("初めまして" + name + "です");
		// 年齢は48歳です
		age += age;
		System.out.println("年齢は" + age + "歳です");
		//「身長は337.0cmです」
		height += height;
		System.out.println("身長は" + height + "cmです");
		//「体重は128.4kgです」
		weight += weight;
		System.out.println("体重は" + weight + "㎏です");
		//「好きな食べ物はオムライスです」
		System.out.println("好きな食べ物は" + food + "です");
		// BMIは11.31です
		bmi /= 2;
		System.out.println("BMIは" + ((double)Math.round(bmi*100))/100  + "です");
// 問題10		
		// 25歳以上の場合trueを表示させる。
		boolean result = age >= 25 ;
		System.out.println(result);
// 問題11		
		// 年齢を文字列に変換
		String ageStr = Integer.toString(age);
		// 身長を文字列に変換
		String heightStr = Double.toString(height);
		// 体重を文字列に変換
		String weightStr = Double.toString(weight);
		// 文字列を連結して出力
		String personInfo = ageStr + heightStr + weightStr;
		System.out.println(personInfo);
// 問題12
		// 年齢を整数に変換
		int ageInt = (int) age;
		// 身長を整数に変換
		int heightInt = (int) height;
		// 整数型に変換した身長と体重を出力
		System.out.println("身長: " + heightInt + "cm、年齢: " + ageInt + "歳");
// 問題13		
		// 年齢が25以上もしくは身長が160以上であればtrueを出力
		boolean result2 = age >= 25 || height >= 160;
		System.out.println(result2);
	}
}
