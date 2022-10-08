/*package whatever //do not write package name here */

import java.io.*;

class TrimStringfromEnd {
	public static void main (String[] args) {
		String s = "   Hello   World    ";
		char a[] = s.toCharArray();
		int start = 0,end = a.length -1, count;
		for(int i = 0; i < end;i++){
		    if(a[i] != ' '){
		        start = i;break;
		    }
		}
		for(int i = a.length-1;i>start-1;i--){
		    if(a[i] != ' '){
		        end = i;break;
		    }
		}
		count = end - start + 1;
		String s1 = new String(a,start,count);
		System.out.println(s1+"!");
	}
}