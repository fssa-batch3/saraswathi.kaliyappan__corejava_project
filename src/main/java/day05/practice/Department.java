package day05.practice;

public class Department {
	String deptName;
    int deptId;
    
    public Department(String deptName, int deptId) {
    	this.deptName = deptName;
    	this.deptId = deptId;
    }
	
    public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
//student class extending department