/**
	*@author Hrishikesh
	@version 1.0
	@since 03/08/2020

*/
public class MaxOfThree{
	public static void main(String args[]){
		int x,y,z;
		x=69;
		y=420;
		z=60;
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