class Solution
{
    //Function to find the median of the two arrays when they get merged.
    public static int findMedian(int a[], int n, int b[], int m)
    {
       if (n > m)
			return findMedian(b,m,a,
						n); // Swapping to make A smaller

		int start = 0;
		int end = n;

		while (start <= end) {
			int i1 = (start + end) / 2;
			int i2 = (n+m+1)/2 - i1;
			int max1
				= (i1 == 0)
					? Integer
							.MIN_VALUE
					: a[i1 - 1];  
			int max2 = (i2 == 0) ?  Integer.MIN_VALUE
										:b[i2 - 1];
			int min1 = (i1 ==n)
							? Integer.MAX_VALUE
							: a[i1];
			int min2 = (i2 == m)
							? Integer.MAX_VALUE
							: b[i2];

		 
			if (max1 <= min2 && max2 <= min1) {
				if ((m + n) % 2 == 0)
					return ((int)Math.max(max1, max2)
							+ (int)Math.min(min1, min2))
						/ 2;
				return (int)Math.max(max1, max2);
			}
			else if (max1 > min2) {
				end = i1 - 1;
			}
			else
				start = i1 + 1;
		}
		return 0;
    }
}
