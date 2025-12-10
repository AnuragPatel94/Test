public class mathemeticallogic  {
        public static void main(String[] args) {
		
//Swap 2 number using third variable
		int a=100, b=200;
		System.out.println("Before swap..."+a+"  "+b);
		int t=a;
		    a=b;
		    b=t;
	    System.out.println("After swap..."+a+"  "+b);  

//Reverse Number using stringbuilder class

	      StringBuilder sbl=new StringBuilder();
	      sbl.append(123456789);
	      StringBuilder rev =sbl.reverse();
	      System.out.println("Reverse String is:"+rev);
	
	
	}}

