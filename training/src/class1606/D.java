package class1606;

public class D {
	public static void main(String[] args) {
		if(args.length>0){
			int[] arr=new int[args.length];
			int size=0;
			for(int i=0;i<args.length;i++) {
				int n=Integer.parseInt(args[i]);
				if(!find(n,arr,size)) {
					arr[size]=n;
					size++;
				}
			}
		}
	}
	static boolean find(int n,int[] arr,int size) {
		boolean flag=false;
		for(int i=0;i<size;i++) {
			if(n==arr[i]) {
				flag=true;
				break;
			}
		}
		return flag;
	}
}
