package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		// コンソールからユーザー名を入力
		Scanner scanner = new Scanner(System.in);
		// ユーザー名が正しいかのフラグ
		boolean error = false;
		//do-whileループを使用し,正しいユーザー名を入力するまで入力を繰り返す
		do {
			String userName = scanner.nextLine();
			// 条件をユーザー名が０文字以下もしくはnullの場合に指定。
			if (userName == null || userName.trim().isEmpty()) {
				//条件が真の場合、名前を入力してくださいと表示。
				System.out.println("名前を入力してください");
			}
			// 入力を半角英数に設定する。
			else if (!userName.matches("[a-zA-Z0-9]+")) {
				// 半角英数以外が含まれる場合、半角英数字のみで名前を入力してくださいと表示。
				System.out.println("半角英数字のみで名前を入力してください");
			}
			// ユーザー名を１０文字以下に設定
			else if (userName.length() > 10) {
				// ユーザー名が１０文字を超える場合名前を10文字以内にしてくださいと表示。
				System.out.println("名前を10文字以内にしてください");
			}
			// 
			else {
				// 条件式がすべて偽の場合ユーザー名○○を登録しましたと表示。
				System.out.println("ユーザー名「" + userName + "」を登録しました");
				//勝つまでの回数を計算する。
				int totalAttempts = playRockPaperScissors(userName);
				//勝つまでにかかった合計回数を表示。
				System.out.println("勝つまでにかかった合計回数は" + totalAttempts + "回です");
				//正しいユーザー名が入力されるまでループする。
				error = true;
			}
		} while (!error);
		//scannnerを閉じる。
		scanner.close();
	}

	private static int playRockPaperScissors(String userName) {
		//合計回数を初期化する。
		int totalAttempts = 1;
		Scanner scanner = new Scanner(System.in);

		do {
			//ユーザーのじゃんけんの手を取得。
			int userChoice = getUserChoice(scanner, userName);
			//コンピュータの手をランダムに取得。
			int computerChoice = (int) (Math.random() * 3); // 0: Rock, 1: Paper, 2: Scissors
			//ユーザーの手を表示。。
			System.out.println(userName + "の手は「" + getHandName(userChoice) + "」");
			//コンピュータの手を表示
			System.out.println("相手の手は「" + getHandName(computerChoice) + "」");
			//勝敗の判定をする。
			int result = determineWinner(userChoice, computerChoice);
			//条件をあいこに指定する。
			if (result == 0) {
				//あいこの場合のメッセージを表示させる。
				System.out.println("DRAW あいこ もう一回しましょう！");
				//条件式が偽でありユーザーが勝利した場合のメッセージを表示。
			} else if (result == 2) {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				//ユーザーが勝利したらループから抜けるよう設定。
				break;
				//どちらの条件式も偽の場合負けた手に対応するメッセージを表示。
			} else {
				System.out.println(getLoseMessage(computerChoice));

			}
			//ユーザーが勝利するまでループさせる。
			totalAttempts++;
		} while (totalAttempts == 0 || totalAttempts > 0);

		scanner.close();
		//勝利するまでにかかった回数を表示
		return totalAttempts;
	}

	//じゃんけんの手を選択を定義する
	private static int getUserChoice(Scanner scanner, String userName) {
		//ユーザーの手の変数。
		int userChoice;
		do {
			//ユーザーの手を入力
			while (!scanner.hasNextInt()) {
				scanner.next();
			}
			//ユーザーの手が0，1，2の入力されるまで繰り返す。
			userChoice = scanner.nextInt();
		} while (userChoice < 0 || userChoice > 2);
		//入力した手を返却する。
		return userChoice;
	}

	//入力したユーザーの手と相手の手を返却する。
	private static String getHandName(int choice) {
		//手に応じた結果を返却する。
		switch (choice) {
		//0が入力された場合グーを返却。
		case 0:
			return "グー";
		//1が入力された場合チョキを返却。
		case 1:
			return "チョキ";
		//2が入力された場合パーを返却。
		case 2:
			return "パー";
		//0.1.2以外の入力をした場合、何も表示しない
		default:
			return "Unknown";
		}
	}

	//勝敗判定の計算をする。
	private static int determineWinner(int userChoice, int computerChoice) {
		return (userChoice - computerChoice + 3) % 3;
	}

	private static String getLoseMessage(int computerChoice) {
		switch (computerChoice) {
		//コンピュータがグーで勝った場合のメッセージを表示。
		case 0:
			return "俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！";
		//コンピュータがチョキで勝った場合のメッセージを表示。
		case 1:
			return "俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ";
		//コンピュータがパーで勝った場合のメッセージを表示。
		case 2:
			return "俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです";
		//コンピュータが勝利していない場合何も表示しない。
		default:
			return "Unknown";
		}

	}

}
