import java.util.HashMap;
import java.util.Map;

class longestsubstringK {
	public static void main (String[] args) {
		//code
	String str = "abbbcda";
	int k = 2; //longest substring number of distinct characters 
	longestsubstringK obj = new longestsubstringK();
	obj.longestSubstringLengthWithKDistinctCharacters(str,2);
	
	}
	public void longestSubstringLengthWithKDistinctCharacters(String str,int k){
	    int start=0;int end=0;
	    int maxlength=0;
	    if(k>str.length() || str.length()<=0 || k<=0){
	        return;
	    }
	    Map<Character,Integer> map = new HashMap<>();
	    
	    while(end<str.length()){
	        char charAtEnd = str.charAt(end);
	        map.put(charAtEnd,map.getOrDefault(charAtEnd,0)+1);
	        
	        while(map.size()>k){
	            char charAtStart = str.charAt(start);
	            map.put(charAtStart,map.get(charAtStart)-1);
	            if(map.get(charAtStart)==0){
	                map.remove(charAtStart);
	        }
	        start++;
	    }
	    maxlength = Math.max(end-start+1,maxlength);
	    	end++;

	}
    System.out.println(maxlength);
}}