package Programs;

public class ReverseMiddleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="i love my india";
  String [] ar= str.split(" ");
  for(int i=0;i<=ar.length-1;i++) {
	  if(i%2==0) {
		 String s=ar[i];
		ar[i]= reverse(s);
	  }
	  
  }
  for(int i=0;i<=ar.length-1;i++)
  {
	  System.out.println(ar[i]);
  }
	}

	public static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}

}
