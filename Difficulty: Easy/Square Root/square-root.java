class Solution {
    int floorSqrt(int x) {
        // code here
    if (x == 1)
      return 1;
    long left = 0,
        mid = x / 2,
        right = x;
    while (left < mid) {
      if (mid * mid > x)
        right = mid;
      else
        left = mid;
      mid = (right + left) / 2;
    }
    return (int) left;
   }
}