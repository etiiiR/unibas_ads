/**
 * Main.main sorts a fixed array with merge sort.
 */
public class Main {

  /**
   * Runs merge sort on a fixed input array and prints
   * the resulting array.
   */
  public static void main(String[] args) {
    int[] array = new int[] {7, 5, 3, 5, 2, 9};
    MergeSort.sort(array);
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      System.out.print(" ");
    }
    System.out.println();
  }
}
