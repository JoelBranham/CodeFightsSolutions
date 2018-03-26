/*
You are climbing a staircase that has n steps. You can take the steps either 1 or 2 at a time. Calculate how many distinct ways you can climb to the top of the staircase.
*/

public class ClimbingStairs{
	
	public static void main(String[] args){
		System.out.println(climbingStairs(100));
	}
	
	public static int climbingStairs(int n) {
		int[] arr = new int[n];
		arr[0] = 1;
		if (n > 1){
			arr[1] = 2;  
		}
		for (int i = 2; i < n; i++){
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n-1];
	}

}