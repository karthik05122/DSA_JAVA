import java.util.*;
import java.lang.*;
import java.io.*;

class binarysearchsortedarray {
	public static void main (String[] args) {
		//code
	int[] a = {1,9,20,60,90,100};
	int index = binarysearchsortedarray.search(a,0,a.length-1,100);
	if(index != -1){
	    System.out.print("target fount at "+index+" "+a[index]);
	}}
	public static int search(int[] a,int start,int end,int target){
	    while(start<=end){
	        int mid = (start+end)/2;
	        if(a[mid]==target){
	           return mid; 
	        }
	        else if(target>a[mid]){
	            start = mid+1;
	    }
	    else {
	        end = mid-1;
	}
	        
	    }
	return -1;
}
}