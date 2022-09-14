package locator;

import java.util.Scanner;

public class length {

	private static String nstr;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		char ch;
		nstr = " ";
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string input");
	      String z=input.next();
		
		for(int b=0;b<z.length();b++)
		{ ch=z.charAt(b);
		nstr = ch+nstr;
			System.out.print("Reverse word:"+nstr);
		
		
		
		}

	}

}
