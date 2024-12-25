package OOps;
class Employee{
	
	     double basicSalary;
	     double bonus;
	     public double printbasicsalary() {
	    	 System.out.println(this.basicSalary);
	    	 return basicSalary;
	     }
	     public double printbonus() {
	    	 System.out.println(this.bonus);
	    	 return bonus;
	     }

	    public double getGrossSalary() {
	        double bonusAmount = bonus * 0.5; // Calculate 50% of bonus
	        return basicSalary + bonusAmount;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Employee emp = new Employee(); 
	        
	        emp.basicSalary = 1000;
	        emp.bonus = 300;
	        double grossSalary = emp.getGrossSalary();
	        System.out.println("Gross Salary: " + grossSalary); 
	    }
	}