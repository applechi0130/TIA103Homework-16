package Hw1;

public class Hw02_2 {
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
		char a = 'A';
		for (int  x= 0; x < 6; x++) { //A-F有六個值
			for (int y = 0; y <= x; y++) { //第幾列等於該值
				System.out.print((char) (a + x)); //顯示值及個別數量
			}
			System.out.println();
		}
	}
}
