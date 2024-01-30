package class1_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	//インスタンス変数定義。
	String AnimalName;
	// Q2：フィールドに動物の数の変数を定義してください。
	//インスタンス変数定義。
	int AnimalCount;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	//コンストラクタの定義。
	public Dog() {
	//AnimalNameに犬を代入。
		this.AnimalName = "犬";
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	//コンストラクタ（オーバーロード）の定義。
	public Dog(int AnimalCount) {
		//AnimalCounntに引数を代入。
		//thisを使いインスタンス変数と引数を区別。
		this.AnimalCount = AnimalCount;
	}
}
