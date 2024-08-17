package Hw1;

public class Hw04_3 {
	public static void mail(String[] args) {
		// 定義八大行星的字串陣列
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		// 初始化母音計數器
		int vowelCount = 0;

		// 遍歷字串陣列中的每一個字串
		for (String planet : planets) {
			// 遍歷字串中的每一個字元
			for (int i = 0; i < planet.length(); i++) {
				char ch = planet.charAt(i);
				// 如果字元是母音，則計數器加一
				if (isVowel(ch)) {
					vowelCount++;
				}
			}
		}
		// 輸出結果
		System.out.println("母音的總數量是: " + vowelCount);
	}

	// 判斷字元是否為母音的方法
	public static boolean isVowel(char ch) {
//		將字元轉為小寫
		ch = Character.toLowerCase(ch);
//		檢查字元是否在母音列表中
		return ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch'u';
	}
}