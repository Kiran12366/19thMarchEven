package Programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
String str="i Love My India";

		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("original string "+str);
		System.out.println("reverse string"+rev);
	}

}
