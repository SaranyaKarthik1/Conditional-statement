package Programs;

import java.util.Scanner;

public class MulitipliesRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number ");
		int n=sc.nextInt();
		System.out.println("Enter the position ");
		int sum2=sc.nextInt();
		int sum=n;
		for(int i=2;i<=sum2;i++) {
			sum=sum+sum;
			//int sum1=sum;
			
		}
		System.out.println(sum);
	}

}
