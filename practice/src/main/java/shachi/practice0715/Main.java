package shachi.practice0715;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		int array[][] = new int[][] {{1,2},{2,3,4}};
//		int total = 0;
//		for(int i = 0; i < array.length; i++) {
//			for(int j = i; j < array[i].length; j++) {
//				total += array[i][j];
//			}
//		}
//		System.out.print(total);
		
//		int array[][] = new int[][] {{1,2},{2,3,4,5}};
//		System.out.println(array[0][0]);
//		System.out.println(array[0][1]);
//		System.out.println(array[1][1]);
//		System.out.println(array[0][3]);
		
//		String[] array = {"A","B"};
//		for(String a : array) {
//			for(String b : array) {
//				if("B".equals(b))
//					break;
//				System.out.print(b);
//			}
//		}
		
		int total = 0;
		a: for(int i = 0;i < 5; i++) {
			b: for(int j = 0; j < 5; j++) {
				if(i % 2 == 0) continue a;
				if(3 < j) break b;
				total += j;
			}
		}
		System.out.println(total);
	}
}
