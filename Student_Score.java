package Poject;

import java.util.Scanner;

public class Student_Score {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many subjects :");
		int numSub=sc.nextInt();
		
		int marks[]=new int[numSub];
		int totalMarks=0;
		
		
		for(int i=0;i<numSub;i++) {
			System.out.println("Marks obtained  "+(i+1)+"(out of 100) :");
			marks[i]=sc.nextInt();
			//for checking the input is valid
			while(marks[i]<0||marks[i]>100) {
				System.out.println("Marks enter is invalid.Please input between 0 and 100");
				marks[i]=sc.nextInt();
			}
			totalMarks+=marks[i];
		}
        double averageMarks=(double)totalMarks/numSub;
        double averagepercentage=averageMarks;
        //Grades
        String grade;
        if(averagepercentage>=90) {
        	grade="A+";
	} else if(averagepercentage>=80){
		grade="B+";
} else if(averagepercentage>=70){
	grade="C+";
} else if(averagepercentage>=60){
	grade="D+";
} else {
	grade="F";
}
   
System.out.println("---------------Result-----------------");
System.out.println("TOTAL MARKS OBATAINED OuT OF 100"+totalMarks);
System.out.println("AVERAGE MARKS"+averageMarks);
System.out.println("AVERAGE MARKS PERCENTAGE"+averagepercentage);
System.out.println("GRADES"+grade);



}
	
}	
	
	
	
	
	
	
