package Day5;

import java.util.Scanner;

public class Check_Vovel_Consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		//char a,e,i,o,u;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Charector");
		ch = sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		   System.out.println("Given Charector is  Vovel");
		else
		   System.out.println("Given Charector is  Consonent");

	}

}
