
class Student {
	int RollNo;
	String StudName;
	double MarksInEng,MarksInMaths, MarksInScience;

	public Student(int rollNo) {
		RollNo = rollNo;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getStudName() {
		return StudName;
	}

	public void setStudName(String studName) {
		StudName = studName;
	}

	public double getMarksInEng() {
		return MarksInEng;
	}

	public void setMarksInEng(double marksInEng) {
		MarksInEng = marksInEng;
	}

	public double getMarksInMaths() {
		return MarksInMaths;
	}

	public void setMarksInMaths(double marksInMaths) {
		MarksInMaths = marksInMaths;
	}

	public double getMarksInScience() {
		return MarksInScience;
	}

	public void setMarksInScience(double marksInScience) {
		MarksInScience = marksInScience;
	}



}
