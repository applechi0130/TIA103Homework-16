package Hw1;

public class Hw04_2 {
	public static void main(String[] args) {
//	請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH(提示:String方法,陣列)
		System.out.println("第二題===============");
		// 定義原始字串
		String s = "Hello World";
		// 反轉字串並輸出結果
		String reversed = reversedString(s);
		System.out.println("反轉後的字串:" + reversed);
	}

	// 反轉字串的方法
	public static String reversedString(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

//		System.out.println(new StringBuffer("Hello World!").reverse());
}