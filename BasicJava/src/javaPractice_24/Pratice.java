package javaPractice_24;

import java.util.ArrayList;

public class Pratice {

	public static void main(String[] args) {
		int a = 100 ;
		for(int i=1; i<=a ;i++) {
		  if (i%2!=0) {
			  System.out.println("Odd Number" + i);
		  }	
		  else {
			  System.out.println( "Even Number" + i);
		  }
		  
		}
		
		Pratice p = new Pratice();
		p.arrayList();
	
		

	}
	
	public void arrayList() {
		ArrayList<Integer> oddnumbers = new ArrayList<>();
		ArrayList<Integer> evenumbers = new ArrayList<>();
		int b = 100;
		for (int i = 1 ; i<=b ; i++ ) 
		{
			if(i%2==0) {
                   evenumbers.add(i);
				
			} 
			else {
				oddnumbers.add(i);
			}
		}
		
		System.out.println("Odd Numbers " + oddnumbers);
		System.out.println("Even Numbers " + evenumbers);
	}

}
