package arrays;

public class TernaryOperatorArray {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {5,6,5,8};
		
		
		int len1=a.length;
		int len2=b.length;
	int	small= len1<len2? len1: len2; // ternary operator
	int	big= len1>len2? len1: len2;
		int c[]=new int[big];
		
   for(int i=0;i<small;i++) {
	   c[i]= a[i] * b[i];
   }
      // c[3]=b[3];
       
   for(int i=0;i<c.length;i++) {
	   System.out.println(c[i]);
   }
	}
}
