import java.util.*;
class MaxCLA{
	public static void main(String args[]){
		String x,y,z;
		x=args[0];
		y=args[1];
		z=args[2];
		
		int i,j;
		
		String t;
		
		for(i=0;i<3-1;i++){
			for(j=0;j<3-i-1;j++){
				if(args[j].length > args[j+1].length){
					t=args[j];
					args[j]=args[j+1];
					args[j+1]=t;
				}
			}
		}
		System.out.println("names after sorting are");
		for(int k=0;k<3;k++)
			System.out.println(args[k]);
	}
}
 
		
