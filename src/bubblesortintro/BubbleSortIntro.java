/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesortintro;


public class BubbleSortIntro {
  public static void main(String[] args) {
    int nums[] = {22, 30, 15, 1, 7, 87, 65, 24, 22, 0};

    //print out unsorted list
    for (int count = 0; count < nums.length; count++) {
      System.out.print(nums[count] + " ");
    }
    System.out.println("\n---------------------------------");
    bubbleSort(nums);

    //print out sorted list
    System.out.println("After sorting using the Bubble Sort,"
      + " the array is:");
    for (int count = 0; count < nums.length; count++) {
      System.out.print(nums[count] + " ");
    }
  }

  public static void bubbleSort(int data[]) {
    int counter;
    //Loop to control number of passes
    for (int pass = 1; pass < data.length; pass++) {
      //Loop to control # of comparisons for length of array-1
      for (int element=0;element<data.length-1;element++) {
        //compare side-by-side elements and swap them if
        //first element is greater than second element
        if (data[element] > data[element + 1]) {
          swap(data, element, element + 1);  //call swap method
        }
      }
    }
  }

  public static void swap(int array2[], int first, int second) {
    int hold = array2[first];
    array2[first] = array2[second];
    array2[second] = hold;
  }
}
