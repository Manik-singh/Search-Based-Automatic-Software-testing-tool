package tryproj;

import java.io.*;
import java.util.*;

public class hill2 {
int flow=1;
programH2 p1 = new programH2();

public int neighbor1(int a){

		 int neigh1 = (a+1);
		 System.out.println("First neighbour is : ");
		 System.out.println(neigh1);
		 
		 
		 int k = p1.program2(neigh1);
		 int j = p1.Approxvalue;
	     
	   	 Fitness2 fit = new Fitness2();   	
	   	 int f2 =fit.Fitness(k, j);
	 
return f2;
}

public int neighbor2(int a){

	 int neigh2 = (a-1);

	 System.out.println("Second neighbour is : ");
	 System.out.println(neigh2);
	 
	 int k = p1.program2(neigh2);
	 int j = p1.Approxvalue;
    
  	 Fitness2 fit = new Fitness2();   	
  	 int f1 =fit.Fitness(k, j);

return f1;
}




public void hill2(int a)
{
	int n=0; int[] fi=new int[100]; int count=0; int flag=0; int min=0;
	
	flow++;
	for (int i=0; i<1; i++){
	
		fi[i]= neighbor1(a);
		fi[i+1]= neighbor2(a);
		
	
	}
	
	for (int i =0; i<2; i++){
		
		if(fi[i]==0)
		{		
			System.out.println("Solution found at neighbor");
			System.out.print(i+1);
			flag =1;
			break;
		}
	}	
	
	if (flag==0){
		
	
		for (int i=0; i<2; i++){
		
				 min = fi[i];
				 ++count ;
				 
				for (int j=i+1; j<2; j++){
					
						if (min < fi[j]){
							
							System.out.println("check");
							if(j==2){
								break;
							}
						}
			
						else{
							min=0;
							break;
							}
				}	
		 
		if (min==fi[i])
		 {
			 	System.out.println("Selected neighbor is:  ");
				System.out.println(i+1);
		 
				if(i==0){
					a=a+(1*count);
					if (a<-50 || a>25)
					{
						continue;
					}
				hill2(a);
				break;
			}
				if (i==1){
					a=a-(1*count);
					if (a<-50 || a>25)
					{
						continue;
					}
				hill2(a);
				break;
			}
						 }
		 
		
 			}
		
 		}
	
	else {
		System.out.println("Thank you");
		//break;
		}

	System.out.println(flow);	}

}