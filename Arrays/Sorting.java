import java.util.*;
import java.lang.*;
import java.io.*;

class Sorting {
	public static void main (String[] args) {
		//quick sort
		
		int[] a = {5,8,1,10,9};
        Sorting.quicksort(a,0,a.length-1);	
         System.out.print("Output: ");
    for (int k = 0; k < a.length; k++) {
      System.out.print(a[k] + " ");
	}}
	public static void quicksort(int[] a,int start,int end){
	    int pivot,temp,i,j;
	     if (start < end) {
      pivot = start;
      i = start;
      j = end;
      while(i<j){
	    while(i<j && a[i]<=a[pivot])
	        i++;
	    
	    while(j>=0 && a[j]>a[pivot])
	        j--;
	    
	    if(i<j){
	        temp = a[i];
	        a[i]=a[j];
	        a[j]=temp;
	    }
	    temp = a[pivot];
	    a[pivot] = a[j];
	    a[j] = temp;
	    quicksort(a,start,j-1);
	    quicksort(a,j+1,end);}
	   
            }}}
	

	
