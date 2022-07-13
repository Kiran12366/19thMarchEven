package Programs;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int count=0;
    System.out.println("enter the num");
    int num=sc.nextInt();
    for(int i=2;i<num;i++) {
    	if(num%i==0) {
    		count++;
    		break;
    	}
    }
    if(count==1) {
    	System.out.println("not prime");
    }
    else{
    	System.out.println("prime");
    	
    }
	}

}
