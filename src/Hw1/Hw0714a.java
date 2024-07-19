package Hw1;

public class Hw0714a {
	public static void main(String[] args) {

		// 請設計一隻Java程式,輸出結果為以下
		System.out.println("第六題===============");
		int rows = 10; // 倒直角三角形的行數
		for (int i = rows; i >= 1; --i) { // 外層迴圈控制行數，從10到1遞減
			for (int j = 1; j <= i; ++j) { // 內層迴圈打印數字，從1到當前行數
				System.out.print(j + " ");
			}
			System.out.println(); // 換行
		}

		// 請設計一隻Java程式,輸出結果為以下:
		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF
		
		System.out.println("第七題===============");
	}
}
