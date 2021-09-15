package DSA_Assignment1;

public class Question_4 {
    // Function to return
// gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }
    // Function to calculate how many numbers
// from 1 to num are divisible by a or b
    static int divTermCount(int a, int b,
                            int l, int k)
    {
        // calculate number of terms
        // divisible by a and by b then,
        // remove the terms which is are
        // divisible by both a and b
        return k / a + k / b - k / l;
    }
    // Binary search to find the
// nth term divisible by a or b
    static int findNthTerm(int a, int b, int n)
    {
        // set low to 1 and high to max(a, b)*n,
        // here we have taken high as 10^18
        int low = 1, high = Integer.MAX_VALUE, mid;
        int lcm = (a * b) / gcd(a, b);

        while (low < high)
        {
            mid = low + (high - low) / 2;

            // if the current term is less
            // than n then we need to increase
            // low to mid + 1
            if (divTermCount(a, b, lcm, mid) < n)
                low = mid + 1;
                // if current term is greater
                // than equal to n then high = mid
            else
                high = mid;
        }
        return low;
    }
    // Driver code
    public static void main (String[] args)
    {
        int a = 3, b = 5, n = 1;
        System.out.println(findNthTerm(a, b, n));
    }
}

