package Sort;

import java.util.Arrays;

public class IntersectionOfTwoArrayII {
  public static void main(String[] args) {

  }

  static int[] process(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int[] result = {};
    int l1 = nums1.length;
    int l2 = nums2.length;

    int index1 = 0;
    int index2 = 0;
    int index = 0;
    while (index1 < l1 && index2 < l2) {
      if (nums1[index1] < nums2[index2]) {
        index1++;
      } else if (nums1[index1] > nums2[index2]) {
        index2++;
      } else {
        index1++;
        index2++;
        result[index] =nums1[index1];
      }
    }

    return Arrays.copyOfRange(result,0,index);
  }
}
