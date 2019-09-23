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
        	
        double PAPER_LENGTH = 11;
        
	double PAPER_WIDTH = 8.5;	
	        
	double IN_TO_MM = 25.4;

	double areaOfPaper;
        
	areaOfPaper = PAPER_LENGTH*PAPER_WIDTH*Math.pow(IN_TO_MM,2);
	  
    	System.out.println("\n");
        
	System.out.printf("%,.2f",areaOfPaper);
        
	System.out.println(" square millimeters.");
	        
	
        /*
         * Exercise 2.
         * 
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        
	double PERIMETER_IN = 2*PAPER_LENGTH + 2*PAPER_WIDTH;
	
	double IN_TO_CM = 2.54;
	
	double PERIMETER_CM = IN_TO_CM * PERIMETER_IN;
	
	System.out.println("\n");
	
	System.out.printf("%,.2f",PERIMETER_CM);
	
	System.out.println(" centimeters.");
	   
        
        /*
         * Exercise 3.
         * 
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
        	
	double diagonalLength = Math.sqrt(Math.pow(PAPER_LENGTH,2)+Math.pow(PAPER_WIDTH,2));
	
	System.out.println("\n");
	
	System.out.printf("%,.2f",diagonalLength);
	
	System.out.println(" inches.");	
	

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
        
	double HW_WEIGHT = 0.15;
	
	double QZ_WEIGHT = 0.35;
	
	double TEST_WEIGHT = 0.50;
        
        double avgHW = (homework1 + homework2 + homework3)/3.00;

	double avgQuiz = (quiz1 + quiz2 + quiz3)/3.00;
	
	double avgTest = (test1 + test2 + test3)/3.00;

	double mpGrade = (avgHW*HW_WEIGHT) + (avgQuiz*QZ_WEIGHT) + (avgTest*TEST_WEIGHT);
	
	System.out.println("\n");
	
	System.out.printf("%.2f", mpGrade);
	
	System.out.println("%.");
	
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

	double HOURLY_WAGE = 12.50;

	double totalEarned = (monHours+tuesHours+wedHours+thurHours+friHours+satHours+sunHours)*HOURLY_WAGE;

	System.out.println("\n");
	
	System.out.printf("$%.2f",totalEarned);
	
	System.out.println("."); 
	
	

	/*
         * Exercise 6.
         * 
         * What is my take-home pay each check?
         */
        
        
	
	
	double SALARY = 117000;
        
	double FED_TAX = 24.0;

	double STATE_TAX = 6.37;

	double YOUR_401K = 7.0;

	double TAKE_HOME_CHECK = ((SALARY/24)*(1-(YOUR_401K/100))*(1-(STATE_TAX/100))*(1-(FED_TAX/100))); 
        
	System.out.println("\n");

	System.out.printf("$%,.2f", TAKE_HOME_CHECK);
        
	System.out.println(".");
 
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
        
        int NO_OF_STUDENTS = 273;
	
	int NO_OF_TEACHERS= 28;

	int BUS_CAPACITY = 54;
	
	int buses = (int) Math.ceil((double)(NO_OF_STUDENTS+NO_OF_TEACHERS)/BUS_CAPACITY);
	
	int onLastBus = (int) (NO_OF_STUDENTS+NO_OF_TEACHERS)%BUS_CAPACITY;

	System.out.println("\n");
	
	System.out.println(buses+" buses are needed, with "+onLastBus+" passengers on the last bus.");
	
        
        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */
        
	double LENGTH_CORN_BRD = 48;

	double WIDTH_CORN_BRD = 24;

	double DIAMETER = 6;

	double surfaceArea = LENGTH_CORN_BRD*WIDTH_CORN_BRD - Math.PI*Math.pow((DIAMETER/2),2);
        
	System.out.println("\n");

	System.out.printf("%,.2f", surfaceArea);
	
	System.out.println(" square inches.");
        
        /*
         * Exercise 9.
         * 
         * Are the years 2020, 2100, and 2400 leap years?
         */
        
	System.out.println("\n");

        int year;
	
	year = 2020;

	boolean leapYear = year%4 == 0 && (year%100 != 0 || year%400 == 0);

	System.out.println(year+" is a leap year..."+leapYear+".");
	
	year = 2100;

	leapYear = year%4 == 0 && (year%100 != 0 || year%400 == 0);
	
	System.out.println(year+" is a leap year..."+leapYear+".");
	
	year = 2400;

	leapYear = year%4 == 0 && (year%100 != 0 || year%400 == 0);
	
	System.out.println(year+" is a leap year..."+leapYear+".");
	
        
        /*
         * Exercise 10.
         * 
         * What is the wind chill?
         */
        
        double TEMPERATURE = 38;

	double WIND_SPEED = 14;
	
	double windChill = 35.74 + 0.6215*TEMPERATURE + (0.4275*TEMPERATURE - 35.75)*Math.pow(WIND_SPEED,0.16);
	
	System.out.println("\n");
	
	System.out.printf("%,.1f", windChill);

	System.out.println(" degrees.");
	
	System.out.println("\n");

    }
}
