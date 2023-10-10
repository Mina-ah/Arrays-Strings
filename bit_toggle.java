/******************************************************************************

BEUTIFUL STRING :
we are saying that the string should be in alternative form of 0 and 1 and we have to find the minimum Number
of flips required to do so.
there are two possiblities for every String to be alternative that it will either start with 0 or either with 1
for starting with 0 we will have a condition if i from loop modulo 2 is 0 then assign 0 else assign 1
that means start with 0 and store it in a var and if current is not equal to var increase the zero counter else start it
with 1 and follow same process and increase counter value if it not equal to current.

*******************************************************************************/

public class Main
{
     public static int countFlipsToMakeAlternate(String binaryString) {
        int flipsStartingWithZero = 0;
        int flipsStartingWithOne = 0;

        // Initialize counters for both starting options
        for (int i = 0; i < binaryString.length(); i++) {
            char currentChar = binaryString.charAt(i);

            // Start with '0' as the first character
            char expectedCharZero = (i % 2 == 0) ? '0' : '1';
            if (currentChar != expectedCharZero) {
                flipsStartingWithZero++;
            }

            // Start with '1' as the first character
            char expectedCharOne = (i % 2 == 0) ? '1' : '0';
            if (currentChar != expectedCharOne) {
                flipsStartingWithOne++;
            }
        }

        // Return the minimum of the two flip counts
        return Math.min(flipsStartingWithZero, flipsStartingWithOne);
    }
	public static void main(String[] args) {
	  String binaryString = "1101"; // Input binary string
        int flips = countFlipsToMakeAlternate(binaryString);
        System.out.println("Minimum flips to make it alternate: " + flips);
	}
}
