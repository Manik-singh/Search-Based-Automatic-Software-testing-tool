package tryproj;

import java.io.*;
import java.util.*;

public class hill {
	int flow=1;

programH1 p1 = new programH1();

public int neighbor1(int a, int b, int c){

		 int neigh1 = (a+1);
		 
		 System.out.print("First neighbour is : ");
		 System.out.print(neigh1);
		 System.out.print(";");
		 System.out.print(b);
		 System.out.print(";");
		 System.out.println(c);
		 
		 int k = p1.cal(neigh1, b, c);
		 int j = p1.Approxvalue;
	     
	   	 Fitness2 fit = new Fitness2();   	
	   	 int f2 =fit.Fitness(k, j);
	 
return f2;
}

public int neighbor2(int a, int b, int c){

	 int neigh2 = (a-1);
	 
	 System.out.println("Second neighbour is : ");
	 System.out.print(neigh2);
	 System.out.print(";");
	 System.out.print(b);
	 System.out.print(";");
	 System.out.println(c);
	 
	 int k = p1.cal(neigh2, b, c);
	 int j = p1.Approxvalue;
    
  	 Fitness2 fit = new Fitness2();   	
  	 int f1 =fit.Fitness(k, j);

return f1;
}

public int neighbor3(int a, int b, int c){

	 int neigh3 = (b-1);
	 
	 System.out.println("Third neighbour is : ");
	 System.out.print(a);
	 System.out.print(";");
	 System.out.print(neigh3);
	 System.out.print(";");
	 System.out.println(c);
	 
	 int k = p1.cal(a, neigh3, c);
	 int j = p1.Approxvalue;
   
 	 Fitness2 fit = new Fitness2();   	
 	 int f3 =fit.Fitness(k, j);

return f3;
}

public int neighbor4(int a, int b, int c){

	 int neigh4 = (b+1);
	 
	 System.out.println("Fourth neighbour is : ");
	 System.out.print(a);
	 System.out.print(";");
	 System.out.print(neigh4);
	 System.out.print(";");
	 System.out.println(c);
	 
	 int k = p1.cal(a, neigh4, c);
	 int j = p1.Approxvalue;
  
	 Fitness2 fit = new Fitness2();   	
	 int f4 =fit.Fitness(k, j);

return f4;
}

public int neighbor5(int a, int b, int c){

	 int neigh5 = (c-1);
	 
	 System.out.println("Fifth neighbour is : ");
	 System.out.print(a);
	 System.out.print(";");
	 System.out.print(b);
	 System.out.print(";");
	 System.out.println(neigh5);
	 
	 int k = p1.cal(a, b, neigh5);
	 int j = p1.Approxvalue;
  
	 Fitness2 fit = new Fitness2();   	
	 int f5 =fit.Fitness(k, j);

return f5;
}

public int neighbor6(int a, int b, int c){
flow++;
	 int neigh6 = (c+1);
	 
	 System.out.println("Sixth neighbour is : ");
	 System.out.print(a);
	 System.out.print(";");
	 System.out.print(b);
	 System.out.print(";");
	 System.out.println(neigh6);
	 
	 int k = p1.cal(a, b, neigh6);
	 int j = p1.Approxvalue;
  
	 Fitness2 fit = new Fitness2();   	
	 int f6 =fit.Fitness(k, j);

return f6;
}



public void hill(int a, int b, int c)
{
	int n=0; int[] fi=new int[100]; int count=0; int flag=0; int min=0;
	
	for (int i=0; i<1; i++){
	
		fi[i]= neighbor1(a,b,c);
		fi[i+1]= neighbor2(a,b,c);
		fi[i+2]= neighbor3(a,b,c);
		fi[i+3]= neighbor4(a,b,c);
		fi[i+4]= neighbor5(a,b,c);
		fi[i+5]= neighbor6(a,b,c);
	
	}
	
	for (int i =0; i<6; i++){
		
		if(fi[i]==0)
		{		
			System.out.println("Solution found at neighbor");
			System.out.print(i+1);
			flag =1;
			break;
		}
	}	
	
	if (flag==0){
		
	
		for (int i=0; i<6; i++){
		
				 min = fi[i];
				 ++count ;
				 
				for (int j=i+1; j<6; j++){
					
						if (min < fi[j]){
							
							System.out.println("check");
							if(j==5){
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
			 	System.out.println("Selected neighbor is");
				System.out.print(i+1);
		 
				if(i==0){
					a=a+(1*count);
					if (a<-10 || a>25)
					{
						continue;
					}
				hill(a,b,c);
				break;
			}
				if (i==1){
					a=a-(1*count);
					if (a<-10 || a>25)
					{
						continue;
					}
				hill(a,b,c);
				break;
			}
				if(i==2){
					b=b-(1*count);
					if (b<-10 || b>25)
					{
						continue;
					}
				hill(a,b,c);
				break;
			}
			
				if(i==3){
					b=b+(1*count);
					if (b<-10 || b>25)
					{
						continue;
					}
				hill(a,b,c);
				break;
			}
			
				if(i==4){
					c=c-(1*count);
					if (c<-10 || c>25)
					{
						continue;
					}
				hill(a,b,c);
				break;
			}

				if(i==5){
					c=c+(1*count);
					if (c<-10 || c>25)
					{
						continue;
					}
				hill(a,b,c);
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