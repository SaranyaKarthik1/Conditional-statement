package Basicsofjava;

import java.util.Scanner;

//import java.util.Scanner;
public class NestedIfLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);


System.out.println("Enter your age ");
int age=sc.nextInt();
if(age<18) {
	System.out.println("You are not Eligible to work");
	
}
else if(age>=18){ 
	System.out.println("You are Eligible to work");
	//System.out.println("You are too old to work as per the Government rules");
	
}//else if(age<60) {
	//System.out.println("You are too old to work as per the Government rules");
//}
else {
	System.out.println("Unable to work as per the Government rules");
}
	}
}




