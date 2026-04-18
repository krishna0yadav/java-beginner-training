package class1606;

interface Employee{
	int id=101;
	void show();
}

public class C implements Employee {
	public void show() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		C c=new C();
		c.show();
		System.out.println(id);
	}
}
