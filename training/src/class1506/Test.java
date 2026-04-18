package class1506;
import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		ArrayList<String> que = new ArrayList<>();
		que.add("What is java");
		que.add("What is python");
		que.add("What is C");
		que.add("What is C++");
		ArrayList<String> opt = new ArrayList<>();
		opt.add("PL,SL,Both,None");
		opt.add("PL,SL,Both,None");
		opt.add("PL,SL,Both,None");
		opt.add("PL,SL,Both,None");
		ArrayList<String> corr = new ArrayList<>();
		corr.add("PL");
		corr.add("Both");
		corr.add("PL");
		corr.add("PL");
		Scanner sc = new Scanner(System.in);
		String c1="";
		int count=0;
		for(int i=0;i<que.size();i++)
		{
			String q=que.get(i);
			System.out.println(q);
			String o=opt.get(i);
			{
				String[] s1 = o.split(",");
				for(String s:s1)
				{
					System.out.println(s);
				}
			}
			String c=corr.get(i);
			{
				c1 = c;
			}
			System.out.println("Your option: ");
			String yr = sc.nextLine();
			if(yr.equalsIgnoreCase(c1))
			{
				count++;
			}
		}
		System.out.println("Marks:"+count);
		sc.close();
	}
}
