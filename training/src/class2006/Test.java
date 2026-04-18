package class2006;


public class Test implements Cloneable {

/*
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		if(n<=255&&n>=1) {
			String res="";
			for(int i=7;i>=0;i--) {
				int temp=(int) (n/Math.pow(2, i));
				res+=""+temp;
				n-=temp*Math.pow(2,i);
			}
			System.out.println(res);
		}*///Implementing object cloning
	public static void main(String[] args) throws CloneNotSupportedException {
		Test t1 = new Test(100,"Krishna");
		Test t2 = (Test) t1.clone();
		t2.id=200;
		System.out.println(t1.id+t1.name);
		System.out.println(t2.id+t2.name);
		
	}
	int id;
	String name;
	Test(int id, String name){
		this.id=id;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
