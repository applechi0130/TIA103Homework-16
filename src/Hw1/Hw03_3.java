package Hw1;

import java.util.Scanner;

public class Hw03_3 {
	public static void main(String[] args) {
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
//		請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數,如圖:
		System.out.println("第三題===============");
		System.out.println("請輸入討厭的數字");
		Scanner no = new Scanner(System.in);
		int a = no.nextInt();
		int num = 0;

		System.out.println("可選擇的數字：");
		for (int i = 1; i <= 49; i++) {
			if (!((i >= 10 && i / 10 == a) || i % 10 == a)) {
				System.out.print(i + "\t");
				num++;
			}
			if ((i % 10 == 0)) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("共有" + num + "個數字可選擇");
		no.close();
		// 在輸入時出現'xxx' is never closed時,只需在末尾加上Scanner後面的變數名即可
	}
}
