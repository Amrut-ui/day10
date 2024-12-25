package OOps;
class Clanguage{
	
	public void printLangs() {
		System.out.println("Hello from languages the languages are");
	}
}
	
	class Cpp{
		String lang1;
		public String printlang1() {
			System.out.println(this.lang1);
			return lang1;
		}
	}
	
	class Java{
		String lang2;
		public String printlang2() {
			System.out.println(this.lang2);
			return lang2;
		}
	
	
	
	}
	
	
	

public class Language {

	public static void main(String[] args) {
	Clanguage sc = new Clanguage();
	Cpp aj =new Cpp();
	Java ja = new Java();
	aj.lang1 = "clanguage";
	ja.lang2 = "java language";
	sc.printLangs();
	aj.printlang1();
	ja.printlang2();
	
	

	}

}

