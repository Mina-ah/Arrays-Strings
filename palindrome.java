/******************************************************************************
PALINDROME OF A NUMBER :
if reverse of a number is same as the original number

*******************************************************************************/

public class Main
{
    public static int palindrome(int n){
        int rev=0;
        
        while(n>0){
            rev=10*rev+n%10;
            n=n/10;
        }
        return rev;
    }
	public static void main(String[] args) {
	    int n=123464321;
	    int ans=palindrome(n);
	    if(ans==n) System.out.println("palindrome");
	    else System.out.println("Not palindrome");
	}
}

// USING RECURSION

public class Main
{
    public static int palindrome(int n,int rev){
       if(n==0){
           return rev;
       }
            rev=10*rev+n%10;
            return palindrome(n/10,rev);
        }
    
	public static void main(String[] args) {
	    int n=123464321;
	    int ans=palindrome(n,0);
	    if(ans==n) System.out.println("palindrome");
	    else System.out.println("Not palindrome");
	}
}
