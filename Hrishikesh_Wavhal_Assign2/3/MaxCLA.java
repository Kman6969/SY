//Write a Java program to find maximum of three numbers. (Use command line argument).

import java.util.Scanner;
class MaxCLA{
	public static void main(String args[]){
		int x,y,z;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		z=Integer.parseInt(args[2]);
		if((x!=y)&&(x!=z)&&(y!=z)){
			if(x>y && x>z)
				System.out.print("\nX is the greatest number");
			else if(x<y && y<z)
				System.out.print("\nZ is the greatest number");
			else 
				System.out.print("\nY is the greatest number");
		
		}
	}
} 
		
