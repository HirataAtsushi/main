package curriculum_New_question;

import java.util.ArrayList;

public class Curriculum_New_question {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	//文字列型と整数型の引数を受け取る。
	public static void Q1(String i, int y) {
		//受け取った引数を結合してコンソールに出力。
		System.out.println(i + y);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	//整数型の引数を受け取る。
	public static void Q2(int i, int y) {
		//受け取った引数を乗算しコンソールに出力する。
		System.out.println(i * y);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	//整数の配列を受け取る。
	public static void Q3(int[] i) {
		//初期値0に設定して配列の数だけ処理を繰り返す。
		for (int x = 0; x < i.length; x++) {
			//受け取った値を順番にコンソールに出力。
			System.out.println(i[x]);
		}

	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	//小数型の変数を受け取る。
	//※メソッド名Q2が2つあるが引数が違い、オーバーロードしているためエラーは起きない。
	public static void Q2(double i, double y) {
		//受け取った値を和算しコンソールに出力。
		System.out.println(i + y);
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	//整数型の引数を受け取る。
	//戻り値が配列型のため、Q5メソッドのデータ型は配列型にする。
	public static ArrayList<Integer> Q5(int i) {
		//動的配列を宣言。
		ArrayList<Integer> Result = new ArrayList<>();
		//初期値を1に設定し、引数の数だけ処理を繰り返す。
		for (int x = 1; x <= i; x++) {
			//1から100をランダムに変数に代入。
			int Random = (int) (Math.random() * 100) + 1;
			//配列にランダムな数を追加。
			Result.add(Random);
			//ランダムな数を表示。
			System.out.println(Random);
		}
		//格納した値を呼び出し元に返す。
		return Result;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	//配列型の引数を受け取る。
	//戻り値が小数型のため、Q6メソッドのデータ型は小数型にする。
	public static double Q6(ArrayList<Integer> i) {
		//配列の中の合計値を代入する変数を宣言。
		int Total = 0;
		//初期値を0に設定し、配列の要素数の数だけ処理を繰り返す。
		for (int x = 0; x < i.size(); x++) {
			//変数Totalに配列の合計値を代入する。
			Total += i.get(x);
		}
		//受け取った配列の要素の平均値を変数に代入。
		double Ave = Total / i.size();
		//平均値をコンソールに出力。
		System.out.println(Ave);
		//格納した値を呼び出し元に返す。
		return Ave;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static void Q7(double i) {
		//条件式を受け取った値が50以上に設定。
		if (i >= 50) {
			//条件式が真の場合trueを表示。
			System.out.println(true);
		//条件式が偽の場合の処理を設定。
		} else {
			//条件式が偽の場合falseを表示。
			System.out.println(false);
		}

	}

	public static void main(String[] args) {

		// 作成したメソッドをここで呼び出してください
		//第一引数に文字列型、第二引数に整数型をいれてQ1メソッドを呼び出す。
		Q1("Hello JavaSE ", 11);
		//引数に整数型をいれてQ2メソッドを呼び出す。
		Q2(2, 5);
		//配列を作成し初期化。
		int a[] = { 1, 2, 3, 4, 5 };
		//整数の配列をいれてQ3メソッドを呼び出す。
		Q3(a);
		//引数に小数型をいれてQ4のQ2メソッドを呼び出す。
		Q2(2.0, 5.0);
		//整数の配列を作成。
		ArrayList<Integer> Res = new ArrayList<>();
		//Q5メソッドの戻り値を配列に代入
		Res = Q5(10);
		//Q6メソッドの戻り値を小数型の変数に代入。
		double AveAve = Q6(Res);
		//引数にQ6メソッドの戻り値をいれてQ7メソッドを呼び出す。
		Q7(AveAve);

	}
}
