package Hw1;

public class Hw04_1 {
	public static void main(String[] args) {
//	有個一維陣列如下:	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素	(提示:陣列,length屬性)
		System.out.println("第一題===============");
		// 定義一維陣列
		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		// 計算平均值
		double average = calculateAverage(array);
		// 輸出平均值
		System.out.println("平均值:" + average);
		// 輸出大於平均值的元素
		System.out.println("大於平均值的元素");
		printElementGreaterThanAverage(array, average);
	}
	// 計算陣列的平均值
	public static double calculateAverage(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return (double) sum / array.length;
	}
	// 輸出所有大於平均值的元素
	public static void printElementGreaterThanAverage(int[] array, double average) {
		for (int num : array) {
			if (num > average) {
				System.out.println(num);
			}
		}
	}
}