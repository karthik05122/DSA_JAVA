import java.util.*;
import java.lang.*;
import java.io.*;

class intersectionOFUnsortedArray {
	public static void main (String[] args) {
		//code
		int i,j;
		i=j=0;
	int[] arr1 = {1,1,2,4,5};
	int[] arr2 = {2,3,4,6};

	Set<Integer> un = new HashSet<>();
	 while(i < arr1.length){
	     un.add(arr1[i++]);
	 }
	 while(j < arr2.length){
	     if(un.contains(arr2[j])){
	         System.out.print(arr2[j]+" ");
	     }
	     j++;
	 }
	
}
    
}