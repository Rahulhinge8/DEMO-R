package Day5;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int P;
		int T;
		int R;
		int A;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Principle Ammount");
		P=sc.nextInt();
		System.out.println("Enter the time");
		T=sc.nextInt();
		System.out.println("Enter the Rate in %");
		R=sc.nextInt();
		A=(P*R*T)/100;
		System.out.println("Simple Interest on Ammount is RS "+A);
		

	}

}
