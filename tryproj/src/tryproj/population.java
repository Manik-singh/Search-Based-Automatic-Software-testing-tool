package tryproj;

import java.util.Random;




public class population {

programH1 p1=new programH1();
programH2 p2=new programH2();
programH3 p5=new programH3();
Fitness2 f2;


public population(int populationSize, int initialise) {

int q=initialise;

		if (q==1) {
            // Loop and create individuals
                 	
            	Random r = new Random();
      		  int Low = -10;
      		  int High = 25;
      		  int gene = r.nextInt(High-Low) + Low;
              int gene1 = r.nextInt(High-Low) + Low;
              int gene2 = r.nextInt(High-Low) + Low;
              
              System.out.println("Initial A-value generated is : ");
              System.out.println(gene);
              System.out.println("Initial B-value generated is : ");
              System.out.println(gene1);
              System.out.println("Initial C-value generated is : ");
              System.out.println(gene2);
              
              int k = p1.cal(gene, gene1, gene2);
           
           	System.out.println("Branch Distance is : "); 
           	System.out.print(k);
           	int j = p1.Approxvalue;
           	System.out.println("Approx value: ");
         	System.out.print(j);
          	Fitness2 f1 = new Fitness2();
          	int h=f1.Fitness(k, j);         	
            
          	if (h==0){
          		System.out.println("Solution found at initial place");
          	}
          	
          	else{
          	hill h1=new hill();
          	h1.hill(gene, gene1, gene2);
            }
            
	}




		else if(q==2){
			
			Random r = new Random();
    		  int Low = 0;
    		  int High = 25;
    		  int gene = r.nextInt(High-Low) + Low;
                        
            System.out.println(gene);
            
            int k = p2.program2(gene);
         
         	System.out.print("Branch Distance is :"); 
         	System.out.print(k);
         	int j = p1.Approxvalue;
         	System.out.println("Approx value: ");
       	System.out.println(j);
        
       	Fitness2 f1 = new Fitness2();
        	int h=f1.Fitness(k, j);         	
          
        	if (h==0){
        		System.out.println("Solution found at initial place");
        	}
        	
        	else{
        	hill2 h1=new hill2();
        	h1.hill2(gene);
          }
			  
			  
		}
		
		else if (q==3) {
            // Loop and create individuals
                 	
            	Random r = new Random();
      		  int Low = 0;
      		  int High = 255;
      		  int gene = r.nextInt(High-Low) + Low;
                          
              System.out.println(gene);
              
              int k = p5.cal(gene);
           
           	System.out.print("The value in Array is  :"); 
           	System.out.println(k);
           	
           	//System.out.println("Approx value: ");
         	//System.out.println(j);
          	Fitness3 f1 = new Fitness3();
          	int h=f1.Fitness(k);
            
          	if (h==0){
          		System.out.println("Solution found at initial place");
          	}
          	
          	else{
          	hill3 h1=new hill3();
          	h1.hill2(k);
            }
            
	}
		
}
}