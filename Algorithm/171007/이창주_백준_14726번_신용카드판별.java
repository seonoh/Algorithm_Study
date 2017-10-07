package B_14726;

import java.util.Scanner;

public class Main {

public static void main(String args[]) throws Exception	{
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int test_case = 0; test_case < T; test_case++) {
			
		
			String input=sc.nextLine();
			int n= input.length();
			int[] arr = new int[n+1];
			int sum =0 ;
			
			for(int i=0; i<n; i++) {
				arr[n-i]=Integer.parseInt(String.valueOf(input.charAt(i)));
			}
			
			for(int i=1; i<=n; i++) {
				if(i%2 ==0) {
					if(arr[i]*2 >= 10) {
						arr[i] = (arr[i]*2 / 10) + (arr[i]*2 % 10);
					}else {
						arr[i]=arr[i]*2;
					}
				}
			}
			for(int i=1; i<=n; i++) {
				sum+=arr[i];
			}
			
			System.out.println((sum%10 == 0)? "T":"F");
		}
	}
	
	public static int gcd(int v1, int v2) {
		int x, y;
		if(v1>v2) {
			x=v1;
			y=v2;
			
		}else {
			x=v2;
			y=v1;
		}
		
		while(y>0) {
			int tmp=y;
			y=x%y;
			x=tmp;
		}
		return x;
	}

}
