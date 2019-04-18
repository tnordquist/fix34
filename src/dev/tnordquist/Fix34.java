package dev.tnordquist;

/*
 * Return an array that contains exactly the same numbers as the given array, but rearranged so that
 * every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The
 * array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and
 * a 3 appears in the array before any 4.
 */

public class Fix34 {

  public static int[] fix34(int[] nums) {
    int threeIndex = 0;
    int fourIndex = 0;
    int i;
    int j;

    for (i = threeIndex; i < nums.length - 1; ++i) {

      if (nums[i] != 3) {
        continue;
      }

      for (j = fourIndex; j < nums.length; ++j) {

        if (nums[j] == 4) {
          int temp = nums[j];
          nums[j] = nums[i + 1];
          nums[i + 1] = temp;
          fourIndex = j + 1;
          break;
        }


      }
    }
    return nums;
  }

  public static void main(String[] args) {

    int[] input = {1, 3, 1, 4};

    fix34(input);

  }
}
