import java.util.*;
import java.lang.*;
import java.io.*;

class Sorting_selection {
	public static void main (String[] args) {
		//code
		int[] a = {15,8,1,3,9};
	Sorting_selection obj = new Sorting_selection();
	obj.selectionSort(a);
	for(int i =0;i<a.length;i++){
	    System.out.print(a[i]+" ");
	}
	}
	public void selectionSort(int[] a){
	    if(a.length<=1){
	        return;
	    }
	    
	    for(int i = 0;i<a.length-1;i++){
	        int min_index = i;
	    for(int j =i+1;j<a.length;j++){
	        if(a[min_index]>a[j]){
	            min_index = j;
	        }}
	        if(min_index !=i){
	            int t = a[min_index];
	            a[min_index] = a[i];
	            a[i] = t;
	        }
	    
	    }
	    
	}
	    
	    
	
	    
	

}