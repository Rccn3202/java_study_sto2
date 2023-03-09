package ch17.p723;

public class Student {
private String name;
private int scores;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getScores() {
	return scores;
}
public void setScores(int scores) {
	this.scores = scores;
}
public Student(String name, int scores) {
	super();
	this.name = name;
	this.scores = scores;
}



}
