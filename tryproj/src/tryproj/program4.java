package tryproj;

import java.util.ArrayList;

public class program4 {
	
	public int Approxvalue;
public int BranchDist;



public int cal(int a)    {
  
   String grade;
   
   int k;
BranchDist=0;
Approxvalue=0;
      
   
   if(a>=90){
       
   	k=(a-90);
   	BranchDist=k;
   	Approxvalue=2;
   	
       if (a>=95){
           grade="A1";
           
       	return BranchDist;
       }
       else {
           grade="A";
           
       	return BranchDist;
       	}
   }
          
   else if(a>=80){
       
   	k=(a-80);
   	BranchDist=k;
   	Approxvalue=1;
       

   	
   	if (a>=85){
           grade="B1";
           
           return BranchDist;
       }
       else {
           grade="B";
   	
       return BranchDist;
       	}
   }
   else if(a>=70){
       
   	
   	k=(a-70);
   	BranchDist=k;
   	Approxvalue=0;

   	
   	if(a>=75){	
           grade="C";
           return BranchDist;
       }
       else{
           grade="c1";
           return BranchDist;
       }
   }
   
   else {
   	grade="D";	//target
   	
   	BranchDist=0;
        Approxvalue=0;
        return BranchDist;
   	
   }
          
          
}
}
