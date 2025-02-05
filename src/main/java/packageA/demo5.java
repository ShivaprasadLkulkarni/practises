package packageA;

import java.util.Scanner;

public class demo5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//     int a =20;
     System.out.println("Enter a num : ");
     int a = sc.nextInt();
     if(a>=21 ) {
    	 System.out.println("pass");
     }
  
     else if(a==25){
    	 System.out.println("wait");
     }
     else if(a==35){
    	 System.out.println("wait");
     }
     else {
    	 System.out.println("try once");
     }
     sc.close();
	
	}}

