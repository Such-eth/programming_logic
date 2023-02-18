/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            System.out.println(fib0(a,b,c,d));
        }
	}
	public static int fib0(int a,int b,int c,int d){
	    if(d==1){return a;}
	    if(d==2){return b;}
	    if(d==3){return c;}
	    return fib0(a,b,c,d-1)+fib0(a,b,c,d-2)+fib0(a,b,c,d-3);
	}
}