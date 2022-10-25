import java.util.*;
import java.lang.*;
import java.io.*;

class sortarraysof0s1s2s {
	public static void main (String[] args) {
		//code
		int[] a = {0,1,2,0,0,2,1,1,2};
		int countlow,countmid,counthigh;
		counthigh=0;countmid=0;countlow=0;
		for(int i = 0;i < a.length;i++){
		    if(a[i]==0){
		        countlow++;
		    }
		    if(a[i]==1){
		        countmid++;
		    }
		    if(a[i]==2){
		        counthigh++;
		    }
		    
		}
		for(int j = 0;j<countlow;j++){
		    a[j]=0;
		}
		for(int j = countlow;j<(countmid+countlow);j++){
		    a[j] = 1;
		}
		for(int j=countmid+countlow;j<(counthigh+countmid+countlow);j++){
		    a[j] =2;
		}
		for(int k = 0;k<a.length;k++){
		    System.out.print(a[k]+" ");
		}
		sortarraysof0s1s2s.dutchnationalflagproblem(a);
		
	}
	
	public static void dutchnationalflagproblem(int[] a){
	    int low,mid,high;
	    low=mid=0;
	    high = a.length-1;
	    while(mid<=high){
	        switch(a[mid]){
	            case 0:
	                if(a[low] != a[mid]){
	                    int t = a[low];
	                    a[low] = a[mid];
	                    a[mid] = t;
	                }
	                mid++;low++;
	                break;
	              case 1:
	                  mid++;
	                  break;
	               case 2:
	                   if(a[mid]!=a[high]){
	                       int t = a[mid];
	                       a[mid] = a[high];
	                       a[high] = t;
	                   }
	                   high--;
	        }
	    }
	    System.out.println("---------");
	    for(int i = 0;i<a.length;i++){
	        System.out.print(a[i]+" ");
	    }
	}
	
	
	
	
	

}