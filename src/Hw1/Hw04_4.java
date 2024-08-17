package Hw1;

import java.util.Scanner;

public class Hw04_4 {
	public static void main(String[] args) {
//			請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數:
//			例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」(提示:Scanner,二維陣列)
		System.out.println("第四題===============");
		String[] id = {"25","32","8","19","27"};
		int [] money = {2500,800,500,1000,1200};
//		建立Scanner物件來讀取使用者輸入
		Scanner s = new Scanner(System.in);
//		讓使用者輸入欲借金額
		System.out.println("輸入欲借金額");
		int need = s.nextInt();
//		查找可以借出金額的員工
		System.out.print("有錢可借的員工編號 : ");
		int count = 0;
//		遍歷所有員工
		for(int i = 0; i < id.length; i++) {
			if(money[i] >= need) {
				System.out.print(id[i]+" ");
				count++;
			}
		}
//		顯示可以借出金額的總人數		
		System.out.println("共 "+ count +" 人");
		s.close();
	}
}
