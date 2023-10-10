/******************************************************************************
FIBONACCI SERIES :
0 1 1 2 3 5 8....n
*******************************************************************************/

public class Main
{
    public static void fibbo(int n){
        int count=0;
        int n1=0;
        int n2=1;
        while(count<n){
            System.out.print( " " + n1);
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            count=count+1;
        }
    }
	public static void main(String[] args) {
	 fibbo(10);
	}
}

// USING RECURSION

 public class Main{
     public static int fibbo(int n){
         if(n<=1){
             return n;
         }
         return fibbo(n-1)+fibbo(n-2);
     }
     public static void main(String[] args){
         int n=10;
         for(int i=0;i<n;i++){
             System.out.print(fibbo(i) + " ");
         }
     }
 }
