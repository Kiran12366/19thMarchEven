package Programs;

public class Splitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str="i love my india";
     
      String ar[] =str.split(" ");
      for(int i=0;i<ar.length-1;i++) {
    	  System.out.println(ar[i]);
      }
      
	}

}
