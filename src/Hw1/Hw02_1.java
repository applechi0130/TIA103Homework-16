package Hw1;

public class Hw02_1 {
	public static void main(String[] args) {
		// 計算1~1000的偶數和 (2+4+6+8+...+1000)
		System.out.println("第一題===============");
		int sum1 = 0;
		for (int num1 = 1; num1 <= 1000; num1++) {
			if (num1 % 2 == 0) {
				sum1 += num1;
			}
		}
		System.out.println("1~1000的偶數和為" + sum1);

		// 計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		System.out.println("第二題===============");
		int sum2 = 1;
		for (int num2 = 1; num2 <= 10; num2++) {
			sum2 *= num2;
		}
		System.out.println("1~10的連乘積為" + sum2);

		// 計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		System.out.println("第三題===============");
		int sum3 = 1;
		int num3 = 1;
		while (num3 <= 10) {
			sum3 *= num3;
			num3++;
		}
		System.out.println("1~10的連乘積為" + sum3);

		// 請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100
		System.out.println("第四題===============");
		for (int num4 = 1; num4 <= 10; num4++) {
			int square = num4 * num4; // 計算平方值
			System.out.print(square + " ");
		}
		System.out.println();

		// 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
		// 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		System.out.println("第五題===============");
		// 初始化計數器，用來計算符合條件的數字個數
		// 使用雙層迴圈列舉1到49之間的數字
		int count = 0;
		for (int i = 1; i <= 4; i++) { // 十位數
			for (int j = 0; j <= 9; j++) { // 個位數
				int num5 = i * 10 + j; // 構造兩位數的數字 // 再檢查是否包含數字4
				if (num5 % 10 != 4 && num5 / 10 != 4) { // '!=' 是否不等於
					System.out.print(num5 + " ");
					count++;
				}
			}
		}
		System.out.println("\n阿文可以選擇的數字總共有：" + count + " 個");
	}
}