
class Employee {
	String empName;
	int empId;
	int empAge;
	String empdesgn;
	String empLocation;
	int	empExpInYrs;

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	public Employee(String empName, int empId, int empAge) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
	}

	public Employee(String empName, int empId, String empdesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
	}

	public Employee(String empName, int empId, int empAge, String empLocation) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empLocation = empLocation;
	}

	public Employee(String empName, int empId, int empAge, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empId, String empdesgn, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empId, String empdesgn, String empLocation, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empId, int empAge, String empdesgn, String empLocation, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpdesgn() {
		return empdesgn;
	}

	public void setEmpdesgn(String empdesgn) {
		this.empdesgn = empdesgn;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public int getEmpExpInYrs() {
		return empExpInYrs;
	}

	public void setEmpExpInYrs(int empExpInYrs) {
		this.empExpInYrs = empExpInYrs;
	}
    public void print()
    {
    	System.out.println("-------->\n");
    	System.out.println("\nEmployee Details");
    	System.out.println(getEmpName());
    	System.out.println(getEmpId());
    	System.out.println(getEmpAge());
    	System.out.println(getEmpdesgn());
    	System.out.println(getEmpLocation());
    	System.out.println(getEmpExpInYrs());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee emp1=new Employee("Raj");
       Employee emp2=new Employee("Raj", 100);
       Employee emp3=new Employee("Raj", 102, 25);
       Employee emp4=new Employee("Raj", 103, "TSE");
       Employee emp5=new Employee("Raj", 105, 25, 1);
       Employee emp6=new Employee("Raj", 106, 25, "Pune");
       Employee emp7=new Employee("Raj", 107, "TSE", 1);
       Employee emp8=new Employee("Raj", 108, "TSE", "Pune", 1);
       Employee emp9=new Employee("Raj", 109, 25, "TSE", "Pune", 1);
       emp1.print();
       emp2.print();
       emp3.print();
       emp4.print();
       emp5.print();
       emp6.print();
       emp7.print();
       emp8.print();
       emp9.print();
	}

}
