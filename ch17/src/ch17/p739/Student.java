package ch17.p739;

public class Student {
	
private String name;
private int score;
private double eyes;

public double getEyes() {
	return eyes;
}
public void setEyes(double eyes) {
	this.eyes = eyes;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}

public Student(String name, int score, double eyes) {
	
	this.name = name;
	this.score = score;
	this.eyes = eyes;
}

}
