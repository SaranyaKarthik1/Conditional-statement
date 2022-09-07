package Topics2;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
for(int i=1;i<=5;i++) {
	System.out.println("The values are "+i);
	if(a==b) {//if(a!=b)
		System.out.println("The continue statement");
		continue;//skip the statement,if the condition is false.
	}
	System.out.println("Outside statement");
}


}
}