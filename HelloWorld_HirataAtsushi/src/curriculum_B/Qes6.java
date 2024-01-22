package curriculum_B;

import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		//パソコンの変数宣言をし、１から12の数字をランダムで代入。
		int ItemCount1 = (int) (Math.random() * 12);
		//冷蔵庫の変数宣言をし、１から12の数字をランダムで代入。
		int ItemCount2 = (int) (Math.random() * 12);
		//扇風機の変数宣言をし、１から12の数字をランダムで代入。
		int ItemCount3 = (int) (Math.random() * 12);
		//洗濯機の変数宣言をし、１から12の数字をランダムで代入。
		int ItemCount4 = (int) (Math.random() * 12);
		//加湿器の変数宣言をし、１から12の数字をランダムで代入。
		int ItemCount5 = (int) (Math.random() * 12);
		//テレビの変数宣言をし、１から12の数字をランダムで代入。
		int ItemCount6 = (int) (Math.random() * 12);
		//何度でもコンソールに入力できるようにする。
		while(true) {
			//コンソールからの入力値をItemNameに代入。
			String ItemName = scanner.nextLine();
			//コンソールに○○、○○入力した場合に、で区切って配列に代入。
			String array[] = ItemName.split("、");
			//配列の要素数の分だけ繰り返し処理
			for(String i : array) {
				//ケースごとに表示
				switch (i) {
				//パソコンと入力した場合に設定。
				case "パソコン":
					//ランダムに代入された数値を表示しパソコンの残り台数のメッセージを出力して文末で改行させる。
					System.out.println("パソコンの残り台数は" + ItemCount1 + "台です。\n");
					//パソコンと入力されたときにSwitch文の処理から抜ける。
					break;
					//冷蔵庫と入力した場合に設定。
				case "冷蔵庫":
					//ランダムに代入された数値を表示し冷蔵庫の残り台数のメッセージを出力して文末で改行させる。
					System.out.println("冷蔵庫の残り台数は" + ItemCount2 + "台です。\n");
					//冷蔵庫と入力されたときにSwitch文の処理から抜ける。
					break;
					//扇風機と入力した場合に設定。
				case "扇風機":
					//ランダムに代入された数値を表示し扇風機の残り台数のメッセージを出力して文末で改行させる。
					System.out.println("扇風機の残り台数は" + ItemCount3 + "台です。\n");
					//扇風機と入力されたときにSwitch文の処理から抜ける。
					break;
					//洗濯機と入力した場合に設定。
				case "洗濯機":
					//ランダムに代入された数値を表示し洗濯機の残り台数のメッセージを出力して文末で改行させる。
					System.out.println("洗濯機の残り台数は" + ItemCount4 + "台です。\n");
					//洗濯機と入力されたときにSwitch文の処理から抜ける。
					break;
					//加湿器と入力した場合に設定。
				case "加湿器":
					//ランダムに代入された数値を表示し加湿器の残り台数のメッセージを出力し文末で改行させる。
					System.out.println("加湿器の残り台数は" + ItemCount5 + "台です。\n");
					//加湿器と入力されたときにSwitch文の処理から抜ける。
					break;
					//テレビと入力した場合に設定。
				case "テレビ":
					//ランダムに代入された数値を表示し	テレビの残り台数のメッセージを出力して文末で改行させる。
					System.out.println("テレビの残り台数は" + ItemCount6 + "台です。\n");
					//テレビと入力されたときにSwitch文の処理から抜ける。
					break;
					//ディスプレイと入力した場合に設定。
				case "ディスプレイ":
					//11からテレビの台数を引いた数値を表示しディスプレイの残り台数のメッセージを出力して文末で改行させる。
					System.out.println("ディスプレイの残り台数は" + (11-ItemCount6) + "台です。\n");
					//ディスプレイと入力されたときにSwitch文の処理から抜ける。
					break;
				default:
					//caseにない商品が入力されたときのメッセージを表示。
					System.out.println ("『受け取った値』は指定の商品ではありません。");
				}
			}
		}
	}
}