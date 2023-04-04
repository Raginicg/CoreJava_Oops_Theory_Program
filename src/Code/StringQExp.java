package Code;

public class StringQExp {

	public static void main(String[] args) {
	      String str1="23";
	      String str2 ="";
	      //Comparing two Strings
	      int res = str1.compareTo(str2);
	      System.out.println(res);
	      if(res==0) {
	         System.out.println("Both Strings are null or equal");
	      }else if(res<0){
	         System.out.println(""+str1+" preceeds "+str2+"");
	      }else if(res>0){
	         System.out.println(""+str2+" preceeds "+str1+"");
	      }
		
	}

}
