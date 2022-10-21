import java.util.*;
import java.lang.*;
import java.io.*;

class Longestsubstringlengthwithnorepeatingcharacters {
	public static void main (String[] args) {
		//code
	String str = "babccbaced";
	int start =0;int end =0;int max_length=0;
	Map<Character,Integer> map = new HashMap<>();
	
	char charStart = str.charAt(start);
	while(end < str.length()){
	char charEnd = str.charAt(end);
	if(map.containsKey(charEnd)){
	    start = Math.max(start,map.get(charEnd)+1);
	}
	map.put(charEnd,end);
	max_length = Math.max(end-start+1,max_length);
	end++;
	}
	System.out.println(max_length);
	}
	

}