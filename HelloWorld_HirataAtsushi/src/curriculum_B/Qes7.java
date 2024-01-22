package curriculum_B;

import java.util.ArrayList;
import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
		//英語の点数初期値を0に設定。
		double ScoreEng = 0;
		//数学の点数初期値を0に設定。
		double ScoreMath = 0;
		//理科の点数初期値を0に設定。
		double ScoreScience = 0;
		//社会の点数初期値を0に設定。
		double ScoreSocial = 0;
		//英語の合計点数初期値を0に設定。
		double TotalEng = 0;
		//数学の合計点数初期値を0に設定。
		double TotalMath = 0;
		//理科の合計点数初期値を0に設定。
		double TotalScience = 0;
		//社会の合計点数初期値を0に設定。
		double TotalSocial = 0;
		//一人の生徒のすべての教科の合計点数初期値を0に設定。
		double TotalScore = 0;
		//全生徒の平均点数初期値を0に設定。
		double AveAve=0;
		//動的配列を作成。
		ArrayList<Double> Ave = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		//生徒の人数を入力してください（2以上）：を表示
		System.out.print("生徒の人数を入力してください（2以上）：");
		//生徒の人数を入力できるようにする。
		String Student = scanner.nextLine();
		
		//String型のStudentをint型に変換
		int StudentCount = Integer.parseInt(Student);
		//入力した生徒の人数分処理を繰り返す。
		for (int i = 1; i <= StudentCount; i++) {
			System.out.print(i + "人目の『英語』の点数を入力してください：");
			ScoreEng = scanner.nextInt();
			//各生徒の英語の点数を加算していく
			TotalEng = TotalEng + ScoreEng;
			System.out.print(i + "人目の『数学』の点数を入力してください：");
			ScoreMath = scanner.nextInt();
			//各生徒の数学の点数を加算していく
			TotalMath = TotalMath + ScoreMath;
			System.out.print(i + "人目の『理科』の点数を入力してください：");
			ScoreScience = scanner.nextInt();
			//各生徒の理科の点数を加算していく
			TotalScience = TotalScience + ScoreScience;
			System.out.print(i + "人目の『社会』の点数を入力してください：");
			ScoreSocial = scanner.nextInt();
			//各生徒の社会の点数を加算していく
			TotalSocial = TotalSocial + ScoreSocial;
			System.out.print("\n");
			//一人の生徒の合計点数を格納。
			TotalScore = (ScoreEng + ScoreMath + ScoreScience + ScoreSocial);
			//一人の平均点を配列に追加。
			Ave.add(TotalScore/4);
		}
		//生徒の数だけ処理を繰り返す。
		for (int i = 0; i < StudentCount; i++) {
			//小数点第二位まで平均点を表示
			System.out.println(i + 1 + "人目の平均点は" + String.format("%.2f", Ave.get(i)));
			//一人一人の平均点を全体の平均点の変数に代入。
			AveAve += Ave.get(i);
		}
		System.out.println();
		//英語の平均点を表示
		System.out.println("英語の平均点は" + String.format("%.2f",TotalEng / StudentCount) + "点です");
		//数学の平均点を表示
		System.out.println("数学の平均点は" + String.format("%.2f",TotalMath / StudentCount) + "点です");
		//理科の平均点を表示
		System.out.println("理科の平均点は" + String.format("%.2f",TotalScience / StudentCount) + "点です");
		//社会の平均点を表示
		System.out.println("社会の平均点は" + String.format("%.2f",TotalSocial / StudentCount) + "点です");
		//全体の平均点を表示
		System.out.println("全体の平均点は" + String.format("%.2f",AveAve / StudentCount) + "点です");

	}
}
