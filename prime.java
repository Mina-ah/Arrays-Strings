/******************************************************************************
PRIME OF NOT :
if it is multiple of 1 and itself
*******************************************************************************/

public class Main
{
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for (int i=2;i<n/2;i++){
            if(n%i==0) return false;
        }
           
        return true;
    }
	public static void main(String[] args) {
	    int n=13;
	    boolean ans=isPrime(n);
	    if(ans==true)
	    System.out.println("prime Number");
	    else System.out.println(" not a prime Number");
	}
}

