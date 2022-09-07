package Topics2;
import java.util.Scanner;
public class SwitchCaseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number ");
int i=sc.nextInt();
switch(i){
	case 1:
		System.out.println("The number is  "+i);
		break;
	case 2:
		System.out.println("The number is  "+i);
		break;
	case 3:
		System.out.println("The number is  "+i);
	case 4:
		System.out.println("The number is  "+i);
		default:
			System.out.println(i+ " : The number is not exist  ");
}

	}

}
