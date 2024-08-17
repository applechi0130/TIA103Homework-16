package Hw1;

public class Hw04_6 {
	public static void main(String[] args) {
//			班上有8位同學,他們進行了6次考試結果如下:請算出每位同學考最高分的次數(提示:二維陣列)
		System.out.println("第六題===============");
//			8位同學考了6次試
		int numStudents = 8;
		int numExams = 6;
//			二微陣列存儲每位同學的6次考試成績
		int[][] scores = { { 10, 37, 100, 77, 98, 90 }, { 35, 75, 70, 95, 70, 80 }, { 40, 77, 79, 70, 89, 100 },
				{ 100, 89, 90, 89, 90, 75 }, { 90, 64, 75, 60, 75, 50 }, { 85, 75, 70, 75, 90, 20 },
				{ 75, 70, 79, 85, 89, 99 }, { 70, 95, 90, 89, 90, 75 } };
//			一維陣列存儲每位同學在6次考試中考取最高分的分數
		int[] maxScoreCount = new int[numStudents];
//			迴圈遍歷每個學生
		for (int i = 0; i < numStudents; i++) {
			int maxScore = Integer.MIN_VALUE;
//			找出每位學生的最高分
			for (int j = 0; j < numExams; j++) {
				if (scores[i][j] > maxScore) {
					maxScore = scores[i][j];
				}
			}
//			計算每位同學最高分的次數
			int count = 0;
			for (int j = 0; j < numExams; j++) {
				if (scores[i][j] == maxScore) {
					count++;
				}
			}
			maxScoreCount[i] = count;
		}
//		輸出每位同學在6次考試中考取最高分的次數
		for (int i = 0; i < numStudents; i++) {
			System.out.println("學生 " + (i + 1) + "在6次考試中考去最高分的次數" + maxScoreCount[i]);
		}
	}
}
