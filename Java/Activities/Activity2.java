package activities;

public class Activity2 {
	
	static int sum;

	public static void main(String[] args) {
		System.out.println(result());
	}
	
	public static boolean result() {
		sum =0;
		int[] numbers = {10, 77, 10, 54, -11, 10};
		for (int no: numbers) {
			if(no == 10) {
				sum = sum+ no ;
			}
		}
		return sum == 30;
		
	}
}