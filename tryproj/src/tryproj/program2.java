/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryproj;


import java.util.ArrayList;

public class program2 {
	
	public int Approxvalue;
	public int BranchDist;
	
   public int cal(int n) {
       
	   int k;
		 BranchDist=0;
		 Approxvalue=0;
		 
		 if(n<0){
	    	   System.out.println("Wrong Input");
	    	   
	    	   k=(0-n);
	    	   BranchDist=k;
	    	   Approxvalue=2;
	    	   return BranchDist ;
	       		}
		 
		 else if (n == 0) {
           //System.out.println("0");
           
           k=(n-0);
           BranchDist=k;
           Approxvalue=1;
           
           return BranchDist ;			  } 
	   
		 else if (n == 1) {
           //System.out.println("0 1");
           		
	           BranchDist=0;
	           Approxvalue=0;
	           return BranchDist ;			  } 
       
	          
	   else {
           //System.out.println("01 ");
           int a = 0;
           int b = 1;
           k=(n-1);
          	BranchDist=k;
          	Approxvalue=0;

           
           for (int i = 1; i < n; i++) {
               int nextNumber = a + b;
              // System.out.print(nextNumber + " ");
               a = b;
               b = nextNumber;
           								}
           return BranchDist ;
           
       		}
   }
}

