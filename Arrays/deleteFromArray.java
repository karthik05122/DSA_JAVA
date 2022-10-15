import java.util.*;
import java.lang.*;
import java.io.*;

class deleteFromArray {
    static int count = 7;
	public static void main (String[] args) {
	int[] a = {10,20,30,40,50,60,70};
	deleteFromArray obj = new deleteFromArray();
	obj.print(a);
//	obj.deleteEnd(a);
	//obj.deletePosition(a,1);
	
    obj.deleteElement(a,60);
    obj.print(a);
	}
	
	public void deleteElement(int[] a, int val){
	    int i;
	    for(i =0;i<count;i++){
	        if(val==a[i]){
	            break;
	        }}
	      if(i==count){
	          System.out.println("no such value");
	      }
	      for(int j = i;j<count-1;j++){
	          a[j] = a[j+1];
	      }
	      count--;
	}
	
	public void deletePosition(int[] a,int pos){
	    if(pos > count||pos <= 0){
	        return;
	    }
	    for(int i = pos-1;i<count-1;i++){
	        a[i] = a[i+1];
	    }
	    count--;
	}
	
	public void deleteEnd(int a[]){
	    if(a.length <= 0){
	        return;
	    }
	    count--;
	}
    public void print(int a[]){
        for(int i = 0;i<count;i++){
            System.out.print(a[i]+" ");
    }
    System.out.println();
    }
}