package arrays;

public class MultiplyArray1 {
	public static void main(String[]args) {
		int a[]= {1,2,3,9,5,45,65};
		int b[]= {5,6,2,5,4,6,5,6,5,6,7};
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
   if(a.length>b.length) {
	   for(int i=small;i<c.length;i++) {
		   c[i]= a[i];
   }
   }
	   else if(b.length>a.length) {
		   for(int i=small;i<c.length;i++) {
			   c[i]=b[i];
	   }
	   }
       
   for(int i=0;i<c.length;i++) {
	   System.out.println(c[i]);
   }
	}


	}

