import java.sql.Date;

public class Employee {
	private String name;
	private int salary;
	private int workHours; 
	private int hireYear;
	public Employee() {
		super();
	}
	public Employee(String name, int salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
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
	public int getHireYear() {
		return hireYear;
	}
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	
	
	
	public float tax() {
		if(salary<1000) {
			return 0;
		}
		else
		{
			return salary*3/100;
		}
	}
	
	
	public float bonus() {
		int bonus=0;
		if(workHours>40) {
			for(int i=40;i<workHours;i++) {
				bonus+=30;
			}
			return bonus;
		}
		else
		{
			return bonus;
		}
	}
	
	public float raiseSalary() {
		if(hireYear+19<2021) {
			return salary*15/100;
		}
		else if(hireYear+9<2021 && hireYear+20>2021) {
			return salary*10/100;
		}
		else if(hireYear+10>2021) {
			return salary*5/100;
		}
		else
			return 0;
	}
	public void tostring() {
		System.out.println("Adı : "+name);
		System.out.println("Maaşı : "+salary);
		System.out.println("çalışma saati : "+workHours);
		System.out.println("Başlangıç yılı : "+hireYear);
		System.out.println("Vergi : "+tax());
		System.out.println("Bonus : "+bonus());
		System.out.println("Maaş artışı : "+raiseSalary());
		 float vbMaas=salary-tax()+bonus();
		System.out.println("Vergiler ve Bnouslar ile birlikte maaş : "+vbMaas);
		vbMaas=salary-tax()+bonus()+raiseSalary();
		System.out.println("Toplam Maaş : "+vbMaas);
	}
}
