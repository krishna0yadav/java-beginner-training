package class2206;
import java.io.*;
public class Test {

	public static void main(String[] args) {
		File f=new File("");
		//boolean b=f.mkdir();//for making a folder
		//boolean b=f.createNewFile();//for making a file
		//boolean b=f.delete();//for deleting a file or folder
		String a[]=f.list();//stores all filenames to the array
		for(String b:a) {
			System.out.println(b);
		}
	}

}
/*
public class Test {

	public static void main(String[] args) throws IOException {
		String home="F:/PC_Data/College_Work/PBLApp/garbage/";
		BufferedReader br1=new BufferedReader(new FileReader(home+"File1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader(home+"File2.txt"));
		PrintWriter fr1=new PrintWriter(home+"File3.txt");
		String temp1,temp2;
		temp1=br1.readLine();
		temp2=br2.readLine();
		while(temp1!=null|temp2!=null) {
			if(temp1!=null) {
				fr1.println(temp1);
				temp1=br1.readLine();
			}
			if(temp2!=null) {
				fr1.println(temp2);
				temp2=br2.readLine();
			}
		}
		fr1.close();
		br2.close();
		br1.close();
		System.out.println("Done");
	}

}
*/
