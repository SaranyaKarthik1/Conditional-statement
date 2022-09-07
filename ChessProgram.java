package Basicsofjava;

import java.math.BigInteger;

public class ChessProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger value=new BigInteger("64");
		//int number=2;
		for(int i=1;i<=64;i++) {
			value=value.multiply(BigInteger.valueOf(2));
			
		}
		System.out.println(value);
		
	
	}

}
