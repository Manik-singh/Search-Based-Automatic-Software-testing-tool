package tryproj;
import java.util.Scanner;
import java.io.*;

public class main {
	static programH1 p2= new programH1();

public static void main(String[] args) {
   String x;
	// Create an initial population
	

System.out.println("Choose the program you want to test?");
System.out.println("1. Greatest No");
System.out.println("2. Fibonacci Series");
System.out.println("3. Comparing Algorithms");
System.out.println("4. Grading System");


Scanner sc = new Scanner(System.in);
int i = sc.nextInt();


	
	
if (i==1)
	{	
		System.out.println("Do you want to apply 1. GA  2. Hill Climbing");
	
		int j = sc.nextInt();
	
		if(j==1){
			Genetic1 g1=new Genetic1();
	        g1.fun2();
		}
		
		else{
		Long Time_one = System.currentTimeMillis();
		
		population myPop1 = new population(1, 1);
	
		Long Time_two = System.currentTimeMillis();
		
		Long Time_three = Time_two - Time_one;
		
		System.out.println("Time elapsed is : ");
		System.out.print(Time_three);
		System.out.print("ms");
		}
	}

else if(i==2) {
	
	System.out.println("Do you want to apply 1. GA  2. Hill Climbing");
	
	int j = sc.nextInt();

	if(j==1){
		Genetic2 g2=new Genetic2();
        g2.cal();
	}
	else{
		
	
	System.out.println("We will be checking for N == 1 in Fibonacci Series.");
	
	Long Time_one = System.currentTimeMillis();
	
	population myPop1 = new population(1, 2);

	Long Time_two = System.currentTimeMillis();
	
	Long Time_three = Time_two - Time_one;
	
	System.out.println("Time elapsed is : ");
	System.out.print(Time_three);
	System.out.print("ms");
	
				}
}

else if(i==3){

	System.out.println("Do you want to apply 1. GA  2. Hill Climbing");
	
	int j = sc.nextInt();

	if(j==1){
		Genetic3 g3=new Genetic3();
        g3.fun2();
	}
	else
	{
	
	System.out.println("Comparing Hill And GA");
	
	Long Time_one = System.currentTimeMillis();
	
	population myPop1 = new population(1, 3);

	Long Time_two = System.currentTimeMillis();
	
	Long Time_three = Time_two - Time_one;
	
	System.out.println("Time elapsed is : ");
	System.out.print(Time_three);
	System.out.print("ms");
	
				}

	
}
else if(i==4){
System.out.println("Do you want to apply 1. GA  2. Hill Climbing");
	
	int j = sc.nextInt();

	if(j==1){
		Genetic4 g4=new Genetic4();
        g4.grade();
	}
	else
	{
	
	//System.out.println("Comparing Hill And GA");
	
	Long Time_one = System.currentTimeMillis();
	
	population myPop1 = new population(1, 3);

	Long Time_two = System.currentTimeMillis();
	
	Long Time_three = Time_two - Time_one;
	
	System.out.println("Time elapsed is : ");
	System.out.print(Time_three);
	System.out.print("ms");
	
				}

	
}
}

}
	

	
    
   
