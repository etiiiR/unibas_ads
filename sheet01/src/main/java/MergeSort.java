/** 
 * Top-down-mergesort for int arrays.
 */
public class MergeSort {

  /** Mergesort algorithm for int arrays (top-down variant). **/
  public static void sort(int[] array) {
    int[] tmp = new int[array.length];
    sort(array, tmp, 0, array.length);
  }

  /** 
   * Sorts the array between the poistions lo and (including) hi.
   **/
  private static void sort(int[] array, int[] tmp, int lo, int hi) {
    if (hi - lo > 1) {
      // since java has integer operations (binary system) bitwise shifting which means >>> 1 --> /2
      int mid = (hi + lo) >>> 1;
      sort(array, tmp, lo, mid);
      sort(array, tmp, mid, hi);
      merge(array, tmp, lo, mid - 1, hi - 1);
    }
  }

  /** 
   * This method combines two neighboring areas of the input array that are 
   * already sorted to a sorted sequence.
   * We assume that array[lo] up to array[mid] and array[mid+1] up to array[hi]
   * is sorted already. Upon return the sorted sequence is located between
   * array[lo] and array[hi].
   **/
  static void merge(int[] array, int[] tmp, int lo, int mid, int hi) {
    int count = 0;
    int left = lo;
    int right = mid + 1;
    while (left <= mid || right <= hi) {
      if (left <= mid && (right > hi || array[left] < array[right])) {
        tmp[count++] = array[left++];
      } else {
        tmp[count++] = array[right++];
      }
    }
    for (int idx = 0; idx < count; idx++) {
      array[lo + idx] = tmp[idx];
    }
  }

}
