package com.deltavoid.objectBased;

public class DisplayStudentInfo {
	
	public static void displayStudentInfo(StudentInfo stu){
		System.out.println(stu.Name);
		System.out.println(stu.identiNum);
		System.out.println(stu.major);
		System.out.println(stu.score1);
		System.out.println(stu.score2);
		System.out.println(stu.getAverageScore());
		System.out.println();
	}

	// public static void main(String[] args) 
    public static void main() {
		// TODO Auto-generated method stub
		StudentInfo stu1 = new StudentInfo();
        stu1.setIdentificationNumber(1);
        stu1.setStudentName("stu1");
        stu1.setTwoScores(90, 100);

		displayStudentInfo(stu1);


		StudentInfo stu2 = new StudentInfo();
		StudentInfo stu3 = new StudentInfo();

		displayStudentInfo(stu2);
		displayStudentInfo(stu3);

	}

}

