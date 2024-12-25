package OOps;
class Amrut{
	String name;
	int age;
	public String printName() {
		System.out.println(this.name);
		return name;
		
	}
	public int  printage() {
		System.out.println(this.age);
		return age;
	}
}

public class Printingname {

	public static void main(String[] args) {
	Amrut a = new Amrut();
	a.name = "amrut desale";
	a.age = 24;
	a. printName();
	a. printage();

	}

}
