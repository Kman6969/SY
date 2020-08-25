import java.util.*;
class MaxCLA{
	public static void main(String args[]){
		String x,y,z;
		x=args[0];
		y=args[1];
		z=args[2];
		
		int i,j;
		
		String t;
		
		for(i=0;i<3;i++){
			for(j=i+1;j<3;j++){
				if(args[i].compareto(args[j])>0){
					t=args[i];
					args[i]=args[j];
					args[j]=t;
				}
			}
		}
		System.out.println("names after sorting are");
		for(int k=0;k<3;k++)
			System.out.println(args[k]);
	}
}
 
		
