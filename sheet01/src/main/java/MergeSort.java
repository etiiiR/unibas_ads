/** 
 * Top-down-mergesort for int arrays.
 */
public class MergeSort {

  /** Mergesort algorithm for int arrays (top-down variant). **/
  public static void sort(int[] array) {
    int b[] = new int[array.length - 0];
    sort(array, b, 0, array.length);
  }
  
  /** 
   * Sorts the array between the poistions lo and (including) hi.
   **/
  private static void sort(int[] array, int[] tmp, int lo, int hi) {
      if (hi - lo > 1) {
        int m = (hi + lo) >>> 1;
        sort(array, tmp, lo, m);
        sort(array, tmp, m, hi);
        merge(array, tmp, lo, m, hi);
      }
    // TODO exercise 1.2 b
  }

  /** 
   * This method combines two neighboring areas of the input array that are 
   * already sorted to a sorted sequence.
   * We assume that array[lo] up to array[mid] and array[mid+1] up to array[hi]
   * is sorted already. Upon return the sorted sequence is located between
   * array[lo] and array[hi].
   **/
  static void merge(int[] array, int[] tmp, int lo, int mid, int hi) {
    int i = 0;
    int j = lo;
    int k = mid;
    while (j < mid || k < hi) {
      if (j < mid && (k == hi || array[j] < array[k])) {
        tmp[i++] = array[j++];
      } else {
        tmp[i++] = array[k++];
      }
    }
    for (int l = 0; l < i; l++) {
      array[lo + l] = tmp[l];
    }
    // TODO exercise 1.2 a
  }
  
}
