import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * Test MergeSort implementation.
 */
class SortTests  {
  
  @Test
  void mergeStepShouldCorrectlyMergeNonemptyIntArrays() {
    int[] tmpArray = new int[] {0, 0, 0, 0, 0, 0};
    int[] arrayToMerge = new int[] {1, 2, 4, 3, 4, 5};
    int[] resultingArray = new int[] {1, 2, 3, 4, 4, 5};
    MergeSort.merge(arrayToMerge, tmpArray, 0, 2, 5);
    assertArrayEquals(arrayToMerge, resultingArray);
  }

  @Test
  void mergeSortShouldCorrectlySortEmptyIntArray() {
    int[] emptyArray = new int[0];
    int[] resultingArray = new int[0];
    MergeSort.sort(emptyArray);
    assertArrayEquals(emptyArray, resultingArray);
  }

  @Test
  void mergeSortShouldCorrectlySortNonemptyIntArray() {
    int[] arrayToSort = new int[] {4, 1, 2, 5, 4};
    int[] resultingArray = new int[] {1, 2, 4, 4, 5};
    MergeSort.sort(arrayToSort);
    assertArrayEquals(arrayToSort, resultingArray);
  }

}
