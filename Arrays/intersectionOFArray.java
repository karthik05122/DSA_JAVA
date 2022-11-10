import java.util.*;
import java.lang.*;
import java.io.*;

class intersectionOFArray {
	public static void main (String[] args) {
		//code
	int[] arr1 = {1,1,2,4,5};
	int[] arr2 = {2,3,4,6};
	List<Integer> finall = new ArrayList<>();
	int i,j;
	i=j=0;
	while(i < arr1.length && j < arr2.length){
	    while((i < arr1.length -1) && (arr1[i]==arr1[i+1])){
	        i++;
	    }
	    
	    while((j < arr2.length -1) && (arr2[j]==arr2[j+1])){
	        j++;
	    }
	  if(arr1[i] > arr2[j]){
	      j++;
	  }
	  else if (arr1[i] < arr2[j]){
	      i++;
	}
	else{ finall.add(arr1[i]);i++;j++;
	}
	
}
	    System.out.println(finall);
	}}