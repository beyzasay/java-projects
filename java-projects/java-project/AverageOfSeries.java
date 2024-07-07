package javaProjects;

public class AverageOfSeries {

	public static void main(String[] args) {
		 int [] list = {13, 7, 12, 7,9,3};
		 double sum = 0.0;
		 
		 for(int i=0; i<list.length; i++) {
		sum += list[i];
		 
		
	}
	
	double avarage = sum / list.length;
	 System.out.println(avarage);
	}


}