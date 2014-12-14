package tryproj;

import java.util.ArrayList;

public  class Fitness2 {


public int Fitness(int BranchDist, int Approxvalue){
	
	int decide = BranchDist + Approxvalue;
	
	System.out.println("THE FITNESS  VALUE IS : ");
	System.out.println(decide);
	
	return decide;
}


}