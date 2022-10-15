import java.util.*;


class bubblesort {
    static int count = 7;
	public static void main (String[] args) {
	int[] a = {90,80,70,40,50,60,-1};
    for(int i = 0;i<a.length-1;i++){
        for(int j=0; j<a.length-1-i;j++){
            if(a[j]>a[j+1]){
                int x = a[j+1];
                a[j+1] = a[j];
                a[j] = x;
        }
    }
}
for(int i =0;i<a.length;i++){
System.out.print(a[i]+" ");}}}