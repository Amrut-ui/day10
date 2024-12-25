package OOps;
	class Student {
		
		    private String name;
		    private int age;
		    private int subject1Marks;
		    private int subject2Marks;
		    private int subject3Marks;

		    
		    public void getPersonalInfo(String name, int age) {
		        this.name = name;
		        this.age = age;
		    }

		   
		    public void getMarks(int subject1Marks, int subject2Marks, int subject3Marks) {
		        this.subject1Marks = subject1Marks;
		        this.subject2Marks = subject2Marks;
		        this.subject3Marks = subject3Marks;
		    }

		   
		    public double calculateAverage() {
		        return (subject1Marks + subject2Marks + subject3Marks) / 3.0; 
		    }

		    
		    public void displayInfo() {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("Average Marks: " + calculateAverage());
		    }
		}

		public class AverageofStd {
		    public static void main(String[] args) {
		        Student student = new Student();

		        
		        student.getPersonalInfo("Amrut desale", 24);

		        
		        student.getMarks(85, 90, 78);

		        
		        student.displayInfo();
		    }
		}