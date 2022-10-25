import java.sql.Date;

public class Employee {
	private String Name;
	private int salary;
	private int workHours; 
	private Date hireYear;
	public Employee() {
		super();
	}
	public Employee(String name, int salary, int workHours, Date hireYear) {
		super();
		Name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	public Date getHireYear() {
		return hireYear;
	}
	public void setHireYear(Date hireYear) {
		this.hireYear = hireYear;
	}
	
	
	
	public float tax() {
		if(salary<1000) {
			return salary;
		}
		else
		{
			salary+=salary*3/100;
			return salary;
		}
	}
	
	
	public void bonus() {
		if(workHours>40) {
			return salary;
		}
		else
		{
			return salary;
		}
	}
	
	public void raiseSalary() {
		
	}
}
