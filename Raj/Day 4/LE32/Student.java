package student;

public class Student  {
     private int studentId,age;
     private String name,degree;
     private double TotalMarks,percentage;
     public Student(int studentId, int age, String name, String degree, double totalMarks, double percentage) {
 		super();
 		this.studentId = studentId;
 		this.age = age;
 		this.name = name;
 		this.degree = degree;
 		TotalMarks = totalMarks;
 		this.percentage = percentage;
 	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", age=" + age + ", name=" + name + ", degree=" + degree
				+ ", Total Marks=" + TotalMarks + ", percentage=" + percentage + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public double getTotalMarks() {
		return TotalMarks;
	}
	public void setTotalMarks(double totalMarks) {
		TotalMarks = totalMarks;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
}
