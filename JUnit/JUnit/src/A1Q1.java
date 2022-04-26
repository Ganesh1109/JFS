

public class A1Q1 {
	public int max(int [] arr) {
	      int max = 0;
	     
	      for(int i=0; i<arr.length; i++ ) {
	         if(arr[i]>max) {
	            max = arr[i];
	         }
	      }
	      return max;
	   }
	   public int min(int [] arr) {
	      int min = 99999;
	     
	      for(int i=0; i<arr.length; i++ ) {
	         if(arr[i]<min) {
	            min = arr[i];
	         }
	      }
	      return min;
	   }
	   
}