package class1906;
/*
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1=new Integer(100);
		System.out.println(i1);
		Integer i2=100;		//WC=primitive
		System.out.println(i2);
		int a=300;
		Integer i3=new Integer(a);	
		System.out.println(i3);
		int b= new Integer(400);	//primitive=WC
		System.out.println(b);
		Integer i4=new Integer(a);
		int c=i4.intValue();	//primitive=primitive
		System.out.println(c);
		Integer i5=new Integer(300);
		int d=i5.byteValue();	//-128 to 127 = 256
		// 300 - 256 = 44
		System.out.println(d);
	}

}


public class Test {

	public static void main(String[] args) {
		Byte i2=new Byte((byte) (50));
		System.out.println(i2.MAX_VALUE);
		System.out.println(i2.MIN_VALUE);
		Short i6=new Short((short) 100);
		System.out.println(i6.MAX_VALUE);
		System.out.println(i6.MIN_VALUE);
		Integer i1=new Integer(100);
		System.out.println(i1.MAX_VALUE);
		System.out.println(i1.MIN_VALUE);
		Long i3=new Long(100);
		System.out.println(i3.MAX_VALUE);
		System.out.println(i3.MIN_VALUE);
		Float i4=new Float(100);
		System.out.println(i4.MAX_VALUE);
		System.out.println(i4.MIN_VALUE);
		Double i5=new Double(100);
		System.out.println(i5.MAX_VALUE);
		System.out.println(i5.MIN_VALUE);
	}
}


public class Test {
	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}
}
*/

public class Test {
	public static void main(String[] args) {
		String a=null;
		//int i1=Integer.parseInt(a);//NumberFormatException
		Integer i2=Integer.valueOf(a);
		//System.out.println(i1);
		System.out.println(i2);
	}
}