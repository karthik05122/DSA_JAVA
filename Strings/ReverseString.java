/*package whatever //do not write package name here */

import java.io.*;

class ReverseString {
	public static void main (String[] args) {
	    String s = "Coding";
	    char s1[] = s.toCharArray();
	    char s2[] = new char[s1.length];
	    int j = s1.length-1;
	    for(int i = 0; i<s1.length;i++){
	        s2[i] = s1[j];
	        j--;
	    }
	    System.out.println(s2);
//second approach	    
	    String finalstr = "";
	    for(int i = 0;i<s.length();i++){
	        char c = s.charAt(i);
	        finalstr = c + finalstr;
	    }
	    System.out.println(finalstr);
//third approach
        int start=0;int end = s1.length -1;char x;
        for(int i = 0;i<s1.length/2;i++){
            if(start < end){
                x = s1[start];
            s1[start] = s1[end];
            s1[end] = x;
            start++;
            end--;}
        }
        System.out.println(s1);
//******************************************        
	}
}