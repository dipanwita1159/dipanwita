package locator;


public class Array {

	public static void main(String[] args) {
		Integer a[]= {1,2,3,4,5,6,7,8,9};
		
		int small=a[0];
		int large=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>large) {large=a[i];}
			else if(a[i]<small) {small=a[i];}
			System.out.println("largest number is:"+large);
		System.out.println("small number is:"+small);
		
			

	}

	

	
	}

}
