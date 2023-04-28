package arrays;

public class MultiplyArray {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {20,30,75};
		int c[]=new int[a.length];
		
		for(int i=0;i<c.length;i++) {
			c[i]=a[i]*b[i];
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}
