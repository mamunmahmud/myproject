package eightClass;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
	
	int [] studentID=new int[100];
	
	Random random=new Random(100);
	for(int i=0;i<studentID.length;i++) {
	studentID[i]= random.nextInt(50);
	}
		
		  for(int i=0;i<studentID.length;i++) { System.out.println(studentID[i]);
		  
		  }
		 
	
	}

}
