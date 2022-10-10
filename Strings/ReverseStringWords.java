/*package whatever //do not write package name here */

import java.io.*; 
import java.util.*; 
class ReverseStringWords {
	public static void main (String[] args) {
	    String s = "Coding Simplified Youtube";
	    String tempstr = "";String finalstr = "";
	    for(int i = 0; i < s.length();i++){
	        if(s.charAt(i) == ' '){
	            finalstr = finalstr + tempstr + " ";
	            tempstr = "";
	           
	        }
	        else{
	             tempstr = s.charAt(i) + tempstr;
	        }
	    }
	    	        finalstr = finalstr + tempstr;

    System.out.println(finalstr);	
    reversestringwordstack(s);}
    public static void reversestringwordstack(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length();i++){
            char c = str.charAt(i);
            
            if(c==' '){
                while(!st.isEmpty()){
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
            else{
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}