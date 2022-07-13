package Programs;

public class RevesreNumber {

	public static void main(String[] args) {
		int a=443556;
		int rev=0;
		int rem=0;
		for(int i=0;i<=a;i++) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println(rev);
		
	}

}
