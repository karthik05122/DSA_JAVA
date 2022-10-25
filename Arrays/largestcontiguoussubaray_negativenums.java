import java.util.*;
import java.lang.*;
import java.io.*;

class largestcontiguoussubaray_negativenums {
	public static void main (String[] args) {
		//quick sort
	int[]	a = {-1,4,-4,6,-4,1};
	
	int current_max,max_so_far;
	current_max=max_so_far=a[0];
	for(int i = 0;i<a.length;i++){
	    current_max = Math.max(current_max+a[i],a[i]);
	    max_so_far = Math.max(current_max,max_so_far);
	}
	System.out.println(max_so_far);
	
	}}
