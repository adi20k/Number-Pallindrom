package Check;

import java.util.Scanner;

public class NumberPallindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,r,rev=0;
		
		if(n<0)
			System.out.println("Invalid Input");
		else {
			while(temp!=0) {
				r=temp%10;
				rev*=10;
				rev+=r;
				temp/=10;
			}
			if(rev==n)
				System.out.println("Pallindrom");
			else
				System.out.println("Not a Pallindrom");
		}
	}

}
