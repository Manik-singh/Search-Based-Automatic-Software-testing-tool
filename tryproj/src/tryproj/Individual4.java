/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryproj;

import static java.lang.Math.pow;
import java.util.Random;

/**
 *
 * @author GobindPreet
 */
public class Individual4 {
    public static final int SIZE = 8;
    private int[] genes1 = new int[SIZE];
        private int[] genes2 = new int[SIZE];
    private int[] genes3 = new int[SIZE];
program4 p1=new program4();
    private int fitnessValue;
    public int fitnessinv;

    public Individual4() {}

    public int getFitnessValue() {
        return fitnessValue;
    }
     public int getFitnessInv() {
        return fitnessinv;
    }

    public void setFitnessValue(int fitnessValue) {
        this.fitnessValue = fitnessValue;
    }
    
    

    public int getGene1(int index) {
        return genes1[index];
    }
    public int getGene2(int index) {
        return genes2[index];
    }public int getGene3(int index) {
        return genes3[index];
    }
 public int getValue1() {
     int  b=SIZE-1;
      int n1 = 0;
        for(int n=0;n<8;n++)
                {
                n1+=(int) pow(2, b--)*genes1[n];
                }
        //System.out.print(n1+",");
        return n1;
    }
 public int getValue2() {
     int  b=SIZE-1;
      int n1 = 0;
        for(int n=0;n<8;n++)
                {
                n1+=(int) pow(2, b--)*genes2[n];
                }
        //System.out.print(n1+",");
        return n1;
    }
 public int getValue3() {
     int  b=SIZE-1;
      int n1 = 0;
        for(int n=0;n<8;n++)
                {
                n1+=(int) pow(2, b--)*genes3[n];
                }
        //System.out.print(n1+",");
        return n1;
    }
    public void setGene1(int index, int gene) {
        this.genes1[index] = gene;
    }
    public void setGene2(int index, int gene) {
        this.genes2[index] = gene;
    }
    public void setGene3(int index, int gene) {
        this.genes3[index] = gene;
    }

    public void randGenes() {
        Random rand = new Random();
        for(int i=0; i<SIZE; ++i) {
            this.setGene1(i, rand.nextInt(2));
                        this.setGene2(i, rand.nextInt(2));
            this.setGene3(i, rand.nextInt(2));

        }
    }

    public void mutate() {
        Random rand = new Random();
        int index = rand.nextInt(SIZE);
        this.setGene1(index, 1-this.getGene1(index));  
        this.setGene2(index, 1-this.getGene2(index)); 
this.setGene3(index, 1-this.getGene3(index)); // flip
    }

    public int evaluate() {
       //call manik function
      int  b=SIZE-1;
      int n1 = 0,n2 = 0,n3 = 0;
        for(int n=0;n<8;n++)
                {
                n1+=(int) pow(2, b--)*genes1[n];
                }
        //System.out.print(n1+",");
       
        
        int k = p1.cal(n1);
           
           	
           	int j = p1.Approxvalue;
           	
         Fitness f1=new Fitness(k,j);
         fitnessValue=f1.decide;
//         fitnessinv=1/fitnessValue;
         return f1.decide;
               // Random rand = new Random();

       // return rand.nextInt(7);
    }
}