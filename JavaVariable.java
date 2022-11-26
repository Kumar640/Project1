package JavaConcept;

public class JavaVariable {

	int i = 9;
	static String str = "Pappu";

	int multiply(int x, int y) {
		return x * y;
	}
	void display() {
		System.out.println("Hi How are you");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaVariable obj = new JavaVariable();
		System.out.println(obj.i);
		System.out.println(obj.multiply(4, 6));
		System.out.println(str);
		//System.out.println(obj.display());

	}

}
