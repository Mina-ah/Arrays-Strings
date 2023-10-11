/******************************************************************************
start the pointer with j=0 and another with i=1
if the values are similar then increase the i pointer if both are not similar 
increase j pointer and make the value at j as i value;
return the value of j+1

*******************************************************************************/

public class Main
{
    public static int duplicate(int[] arr){
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }
	public static void main(String[] args) {
	    int[] arr={1,1,2,2,2,3,4,4,5,5,5};
	    int ans=duplicate(arr);
		System.out.println(ans);
	}
}
