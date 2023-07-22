package com.deltavoid.objectBased;


public class StudentInfo {
	
	String Name;
	int identiNum;
	String major;
	int score1,score2;
	
	
	public void setStudentName(String str){
		Name = str ;
	}
	
	public void setIdentificationNumber(int x){
		identiNum = x ;
	}
	
	public void setMajor(String str){
		major = str ;
	}
	
	public void setTwoScores(int s1,int s2){
		score1 = s1 ;
		score2 = s2 ;
	}
	
	public int getAverageScore(){
		return (score1 + score2) / 2 ;
	}

}
