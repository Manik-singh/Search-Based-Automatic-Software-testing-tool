package tryproj;

import java.util.ArrayList;

public class programH1 {
	
	
	public int Approxvalue;
	public int BranchDist;
	
	public int cal(int f, int g, int h) {
		
	int a =f,b=g,c=h;
	ArrayList A = new ArrayList();	
	boolean CondPass;
	int k;
	 BranchDist=0;
	 Approxvalue=0;
	
	if(a<b){ 
		
		k= (b-a);
		BranchDist= Math.abs(k);
		CondPass=true;
		Approxvalue=1;
		
		if(c<b){
		
			BranchDist=0;
			Approxvalue=0;
	    	CondPass=true;
	    	System.out.print("B is greatest");
	    	System.out.println("Target is achieved");
			return BranchDist;
		}
		
		k = (c-b);
		BranchDist= Math.abs(k);
    	CondPass=false;
    	Approxvalue = 0;
    	//A.add(CondPass);

	}	

	else{
		
		k= (a-b);
		BranchDist=Math.abs(k);
    	CondPass=false;
    	Approxvalue=1;
    	//A.add(CondPass);

		if(c<a){
			k= (a-c);
			BranchDist=Math.abs(k);
	    	CondPass=true;
	    	Approxvalue = 1;
	    	//A.add(CondPass);
			//System.out.print("A is greatest");
			return BranchDist;
		}
		
		k= (c-a);
		BranchDist=Math.abs(k);
    	CondPass=false;
    	Approxvalue=1;
    	//A.add(CondPass);

	}
	
	
	return BranchDist ; }
	
}
