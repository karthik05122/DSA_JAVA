import java.util.*;
import java.lang.*;
import java.io.*;

class reverseString {
	public static void main (String[] args) {
	    
		String s = "Coding Simplified Class";
		String tempstr = "";
		String finalstr = "";
		for(int i = 0; i<s.length();i++){
		    char c = s.charAt(i);
		    if(c == ' '){
		        finalstr = " "+tempstr + finalstr;
		        tempstr = "";
		    }
		    else{
		        tempstr = tempstr + c;
		    }
		}
		finalstr = tempstr+finalstr;
	System.out.println(finalstr);
	String s1 = reversewordStringBuilder(s);
	System.out.println(s1);
	}
	public static String reversewordStringBuilder(String str){
	    StringBuilder finalstr1 = new StringBuilder();
	    	    StringBuilder tempstr1 = new StringBuilder();
	    	    for(int i = 0 ; i < str.length();i++){
	    	        char c = str.charAt(i);
	    	        if(c == ' '){
	    	            finalstr1.insert(0,tempstr1).insert(0," ");
	    	            tempstr1.setLength(0);
	    	        }
	    	        else{
	    	            tempstr1.append(c);
	    	        }
	    	    }
	    	    finalstr1.insert(0,tempstr1);
	    	    return finalstr1.toString();
	}

}