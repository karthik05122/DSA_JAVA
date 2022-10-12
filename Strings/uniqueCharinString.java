import java.util.HashSet;
import java.util.Set;


class StringProblems{
    
    public static int uniqueCharinString(String s){
        Set<Character> st = new HashSet<>();
        for(int i = 0; i<s.length();i++){
            st.add(s.charAt(i));
        }
        return st.size();
    }
    
    
    public static void main(String[] args){
        String s = "aabcddeffs";
        System.out.println(StringProblems.uniqueCharinString(s));
    }
}