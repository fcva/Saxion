package week3;

public class Student {
	private String name;
	private int participatedNumber;
	private int totalQuizScore;
	
	public Student(String studentName) {
		this.name = studentName;
		this.participatedNumber = 0;
		this.totalQuizScore = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addQuiz(int score) {
		this.participatedNumber = this.participatedNumber + 1;
		this.totalQuizScore = this.totalQuizScore + score;
	}
	
	public int getTotalScore() {
		return this.totalQuizScore;
	}
	
	public int getAverageScore() {
		return this.totalQuizScore / this.participatedNumber;
	}
}
