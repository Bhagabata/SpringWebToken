package arrays;

public class Multiplyjava {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {5,6,5,8};
		int small;
		int big;
		
		int len1=a.length;
		int len2=b.length;
		if(len1<len2) {
			small=len1;
			big=len2;
		}
		else {
			small=len2;
			big=len1;
		}
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
