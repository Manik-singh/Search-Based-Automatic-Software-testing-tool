package tryproj;

import java.util.ArrayList;

public class Fitness {
    int decide;

public ArrayList B = new ArrayList();

public Fitness(int BranchDist, int Approxvalue){
	
	 decide = BranchDist + Approxvalue;
	B.add(decide);
	//System.out.println("THE FITNESS  VALUE IS : ");
	//System.out.println(decide);
	
	
}


}