/**
 * Problem Set 1.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 * 
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {
    
    public static void main(String[] args) {
        
        /*
         * Exercise 1.
         * 
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
        	
        double lengthPaper = 11;
        
	double widthPaper= 8.5;	
        
	double cfIn2Mm2 = 645.16;
        
	double area = lengthPaper*widthPaper*cfIn2Mm2;
  
    	System.out.println("\n");
        
	System.out.printf("%,.2f",area);
        
	System.out.println(" square millimeters.");
        
	System.out.println("\n");

        /*
         * Exercise 2.
         * 
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        
	double prmtrIn = 2*lengthPaper + 2*widthPaper;
	
	double cfInCm = 2.54;
	
	double prmtrCm = cfInCm * prmtrIn;
	
	System.out.println("\n");
	
	System.out.printf("%,.2f",prmtrCm);
	
	System.out.println(" cenitimeters.");
	
	System.out.println("\n");        
        
        /*
         * Exercise 3.
         * 
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
        	
	double diagonalLength = Math.sqrt(Math.pow(lengthPaper,2)+Math.pow(widthPaper,2));
	
	System.out.println("\n");
	
	System.out.printf("%,.2f",diagonalLength);
	
	System.out.println(" inches.");	
	
	System.out.println("\n");

        /*
         * Exercise 4.
         * 
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */
        
        int homework1 = 88;

        int homework2 = 91;
        
	int homework3 = 0;
        
	int quiz1 = 84;
        
	int quiz2 = 89;
        
	int quiz3 = 93;
        
	int test1 = 74;
        
	int test2 = 87;
        
	int test3 = 82;
        
	double hwWeight = 0.15;
	
	double quizWeight = 0.35;
	
	double testWeight = 0.50;
        
        double avgHW = (homework1 + homework2 + homework3)/3.00;

	double avgQuiz = (quiz1 + quiz2 + quiz3)/3.00;
	
	double avgTest = (test1 + test2 + test3)/3.00;

	double mpGrade = (avgHW*hwWeight) + (avgQuiz*quizWeight) + (avgTest*testWeight);
	
	System.out.println("\n");
	
	System.out.printf("%.2f", mpGrade);
	
	System.out.println("%.");
	
	System.out.println("\n");

        /*
         * Exercise 5.
         * 
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

        double monHours = 7.50;

	double tuesHours = 8.00;
	
	double wedHours = 10.50;        
        
	double thurHours = 9.50;
	
	double friHours = 6.00;

	double satHours = 11.50;

	double sunHours = 0.00;

	double hourlyWage = 12.50;

	double totalEarned = (monHours+tuesHours+wedHours+thurHours+friHours+satHours+sunHours)*hourlyWage;

	System.out.println("\n");
	
	System.out.printf("$%.2f",totalEarned);
	
	System.out.println("."); 
	
	System.out.println("\n");

	/*
         * Exercise 6.
         * 
         * What is my take-home pay each check?
         */
        
        
        
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
        
        
        
        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */
        
        
        
        /*
         * Exercise 9.
         * 
         * Are the years 2020, 2100, and 2400 leap years?
         */
        
        
        
        /*
         * Exercise 10.
         * 
         * What is the wind chill?
         */
        
        
        
    }
}
