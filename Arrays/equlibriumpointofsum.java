import java.util.*;
import java.lang.*;
import java.io.*;

class equlibriumpointofsum {
	public static void main (String[] args) {
		//code
	int[] a = {1,6,7,0,7};
	int sum,sum_so_far,index;
	sum=sum_so_far=index=0;
	for(int i =0;i<a.length;i++){
	    sum=sum+a[i];
	}
	for(int i =0; i< a.length;i++){
	    sum = sum - a[i];
	    if(sum == sum_so_far){
	         index = i;
	    }
	    sum_so_far = sum_so_far + a[i];
	}
	System.out.println("Equilibrium point is "+a[index]);
	
	}
}