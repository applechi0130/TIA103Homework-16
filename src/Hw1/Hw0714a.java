package Hw1;

public class Hw0714a {
	public static void main(String[] args) {
		// 請設計一隻Java程式,輸出結果為以下:
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		System.out.println("第六題===============");
		int rows = 10; // 倒直角三角形的行數
		for (int i = rows; i >= 1; i++) { // 外層迴圈控制行數
			for (int j = i; j >= 1; j++) { // 內層迴圈打印數字，從當前行數到1
				System.out.print(j + " ");
			}
			System.out.println();   // 換行
		}
	}
}

//
//		// 請設計一隻Java程式,輸出結果為以下:
//		// A
//		// BB
//		// CCC
//		// DDDD
//		// EEEEE
//		// FFFFFF
//		System.out.println("第七題===============");
//
//	}}