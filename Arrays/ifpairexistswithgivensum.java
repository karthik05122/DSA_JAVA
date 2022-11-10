import java.util.*;
import java.lang.*;
import java.io.*;

class ifpairexistswithgivensum {
	public static void main (String[] args) {
	int[] arr = {9,10,3,5,1};
	System.out.println(ifpairexistswithgivensum.usingHashing(arr,7));
	}
	
	public static boolean usingHashing(int[] a, int s)
	{
	    Set<Integer> set = new HashSet<Integer>();
	   for(int i =0;i<a.length;i++){
	       if(set.contains(s - a[i])){
	           return true;
	       }
	   else
	   set.add(a[i]);
	}
	return false;
}}