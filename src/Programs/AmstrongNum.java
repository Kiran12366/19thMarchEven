package Programs;

public class AmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num=2;
 int sum=0;
 int rem=0;
 int fnum=num;
 while(num>0) {
	 rem=num%10;
	 sum=sum+(rem*rem*rem);
	 num=num/10;
	 
 }
 if(fnum==sum) {
	 System.out.println("amstrong is "+sum);
 }
 else {
	 System.out.println(" not amstrong "+sum);
 }
	}

}
