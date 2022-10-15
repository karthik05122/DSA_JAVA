import java.util.*;
import java.lang.*;
import java.io.*;

class insertToArray {
	public static void main (String[] args) {
		//code
	int a[] = new int[5];
	for(int i = 0;i<a.length;i++){
	    a[i] = i*3;
	}
	for(int i = 0;i<a.length;i++){
	   System.out.print(a[i]+" ");
	}
	System.out.println(" ");
	inserStart(a,200);
	insertEnd(a,100);
	insertPosition(a,3,300);
	}
	public static void insertEnd(int[] a,int val){
	    int x = a.length-1;
	    a[x] = val;
	    
	for(int i = 0;i<a.length;i++){
	    System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
    public static void inserStart(int[] a,int val){
        for(int i =a.length-1; i > 0;i--){
            a[i] = a[i-1];
        }
        a[0] = val;
        	for(int i = 0;i<a.length;i++){
	    System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
    public static void insertPosition(int[] a,int pos,int val){
        
        for(int i=a.length-1;i>pos;i--){
            a[i] = a[i-1];
        }
        a[pos] = val;
        for(int i = 0;i<a.length;i++){
	    System.out.print(a[i]+" ");
        }
    }
}