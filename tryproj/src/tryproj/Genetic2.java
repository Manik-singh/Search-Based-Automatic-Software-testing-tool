/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryproj;



import java.util.Random;
import java.util.Arrays;


/**
 *
 * @author GobindPreet
 */
public class Genetic2 {
    
    final static int ELITISM_K = 1;
    final static int POP_SIZE = 2 + ELITISM_K;  // population size
    final static int MAX_ITER = 1000;             // max number of iterations
    final static double MUTATION_RATE = 0.1;     // probability of mutation
    final static double CROSSOVER_RATE = 0.9;     // probability of crossover

    private static Random m_rand = new Random();  // random-number generator
    private Individual2[] m_population;
    private double Fitness[]= new double[POP_SIZE];
    private double totalFitness;
    int count1=0,count2=0;
 static int w[]=new int[MAX_ITER*POP_SIZE];

    public Genetic2() {
        m_population = new Individual2[POP_SIZE];

        // init population
        for (int i = 0; i < POP_SIZE; i++) {
            m_population[i] = new Individual2();
            m_population[i].randGenes();
        
       //totalFitness=this.evaluate();
        // evaluate current population
       Fitness[i]= m_population[i].evaluate();
       
            System.out.println("Initial Fitnes of Individual:"+(i+1)+"\t"+Fitness[i]);

            
    }
    }
     public void setPopulation(Individual2[] newPop) {
        // this.m_population = newPop;
        System.arraycopy(newPop, 0, this.m_population, 0, POP_SIZE);
    }

    public Individual2[] getPopulation() {
        return this.m_population;
    }
    //public double evaluate() {
      //  this.totalFitness = 0.0;
        //for (int i = 0; i < POP_SIZE; i++) {
          //  this.totalFitness += m_population[i].evaluate();
        //}
        //return this.totalFitness;
    //}
    public int findindex(int fit){
        int a = 0;
        for(int i=0;i<POP_SIZE;i++){
        if(m_population[i].getFitnessValue()==fit){
            a=i;
        break;
  
        }
        }
        return a;
    }
    public Individual2 rouletteWheelSelection() {
        for(int i=0;i<POP_SIZE;i++){
        totalFitness+=(m_population[i].evaluate());
        }int a[]=new int[POP_SIZE];
        for(int i=0;i<POP_SIZE;i++){
        a[i]=m_population[i].getFitnessValue();
        }
        Arrays.sort(a);
        int max=a[POP_SIZE-1];
        int min=a[0];
        int t=max+min;
        double randNum = m_rand.nextDouble() * this.totalFitness;
        int idx = 0;
        try{
        for (idx=0; idx<POP_SIZE && randNum>0; ++idx) {
            randNum -= (t-m_population[idx].getFitnessInv());
        }
        }
        catch(Exception e)
        {
        }
                return m_population[idx-1];

    }

      public Individual2 findBestIndividual() {
        int idxMax = 0, idxMin = 0;
        double currentMax = 0.0;
        double currentMin = 1.0;
        double currentVal;

        for (int idx=0; idx<POP_SIZE; ++idx) {
            currentVal = m_population[idx].getFitnessValue();
            if (currentMax < currentMin) {
                currentMax = currentMin = currentVal;
                idxMax = idxMin = idx;
            }
            if (currentVal > currentMax) {
                currentMax = currentVal;
                idxMax = idx;
            }
            if (currentVal < currentMin) {
                currentMin = currentVal;
                idxMin = idx;
            }
        }

        return m_population[idxMin];      // minimization
       // return m_population[idxMax];        // maximization
    }
         public static Individual2[] crossover(Individual2 indiv1,Individual2 indiv2) {
        Individual2[] newIndiv = new Individual2[2];
        newIndiv[0] = new Individual2();
        newIndiv[1] = new Individual2();

        int randPoint = m_rand.nextInt(Individual2.SIZE);
        int i;
        for (i=0; i<randPoint; ++i) {
            newIndiv[0].setGene1(i, indiv1.getGene1(i));
            newIndiv[1].setGene1(i, indiv2.getGene1(i));
           // newIndiv[0].setGene2(i, indiv1.getGene2(i));
           // newIndiv[1].setGene2(i, indiv2.getGene2(i));
           // newIndiv[0].setGene3(i, indiv1.getGene3(i));
           // newIndiv[1].setGene3(i, indiv2.getGene3(i));
        }
        for (; i<Individual2.SIZE; ++i) {
            newIndiv[0].setGene1(i, indiv2.getGene1(i));
            newIndiv[1].setGene1(i, indiv1.getGene1(i));
           // newIndiv[0].setGene2(i, indiv2.getGene2(i));
           // newIndiv[1].setGene2(i, indiv1.getGene2(i));
           // newIndiv[0].setGene3(i, indiv2.getGene3(i));
           // newIndiv[1].setGene3(i, indiv1.getGene3(i));
        }

        return newIndiv;
    }
         
         
         
        public  void cal() {
        //Genetic1 pop = new Genetic1();
        Individual2[] newPop = new Individual2[POP_SIZE];
        Individual2[] indiv = new Individual2[2];

        // current population
      //  System.out.print("Total Fitness = " + pop.totalFitness);
       System.out.println("  Best Fitness = " + 
           this.findBestIndividual().getFitnessValue());

        // main loop
        int count;
        Long Time_one = System.currentTimeMillis();
        for (int iter = 0; iter < MAX_ITER; iter++) {
            //System.out.println(iter);
            count = 0;

            // Elitism
            for (int i=0; i<ELITISM_K; ++i) {
                newPop[count] = this.findBestIndividual();
                count++;
            }
         //   System.out.println(newPop[0].getFitnessValue());

            // build new Population
            while (count < POP_SIZE) {
                // Selection
                indiv[0] = this.rouletteWheelSelection();
            //  System.out.println(count+"Selection: a \t"+indiv[0].getValue1());
                indiv[1] = this.rouletteWheelSelection();
//System.out.println(count+"Selection: b\t"+indiv[1].getValue1());
                // Crossover
                if ( m_rand.nextDouble() < CROSSOVER_RATE ) {
                    indiv = crossover(indiv[0], indiv[1]);
                        // System.out.println("cross"+indiv[0].getValue1()+","+indiv[0].getValue2()+","+indiv[0].getValue3());
//System.out.println("count"+"b:"+indiv[1].getValue1()+","+indiv[1].getValue2()+","+indiv[1].getValue3());

                }

                // Mutation
                if ( m_rand.nextDouble() < MUTATION_RATE ) {
                    indiv[0].mutate();
                   // System.out.println(count+"a:"+indiv[0].getValue1()+","+indiv[0].getValue2()+","+indiv[0].getValue3());
                }
                if ( m_rand.nextDouble() < MUTATION_RATE ) {
                    indiv[1].mutate();
                }

                // add to new population
                newPop[count] = indiv[0];
                newPop[count+1] = indiv[1];
                count += 2;
            }
            for(int f=0;f<POP_SIZE;f++){
                newPop[f].evaluate();
          // System.out.println(newPop[f].getFitnessValue());
            
           }
            this.setPopulation(newPop);
            for(int i=0;i<POP_SIZE;i++){
            //System.out.println(newPop[i].getFitnessValue());
           
           if(this.m_population[i].getFitnessValue()==0){
           this.count1++;
           w[this.count2++]=iter;
              // System.out.println(pop.count1+": Solution at Iteration \t"+iter);//pop.m_population[i].getValue1());
           
           }
            }
                //System.out.println(newPop[i].getValue1()+","+newPop[i].getValue2()+","+newPop[i].getValue3());
            
            // reevaluate current population
           
    //        System.out.print("Total Fitness = " + pop.totalFitness);
           // System.out.println(" ; Best Fitness = " +
            //    pop.findBestIndividual().getFitnessValue()); 
            
        }
Long Time_two = System.currentTimeMillis();
		
		Long Time_three = Time_two - Time_one;
		
		System.out.println("Time elapsed is : ");
		System.out.print(Time_three);
		System.out.print("ms");

        // best indiv
        Individual2 bestIndiv = this.findBestIndividual();
        System.out.println("Solution Found at Iteration: \t"+this.w[0]);
        System.out.println("Best Individual is:"+bestIndiv.getValue1());
        System.out.println(" Fitness of Best Individual is ="+bestIndiv.getFitnessValue());
    }
        
        
        
        
    }
    


    

