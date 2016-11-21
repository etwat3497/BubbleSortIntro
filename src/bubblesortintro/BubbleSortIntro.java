/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesortintro;


public class BubbleSortIntro {
  public static void main(String[] args) {
    double nums[] = {22.20, 30.56, 15.56, 1.07, 7.97, 87.76, 65.34, 24.60, 22.21, 0};

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

  public static void bubbleSort(double data[]) {
    int counter;
    //Loop to control number of passes
    for (int pass = 1; pass < data.length; pass++) {
      //Loop to control # of comparisons for length of array-1
      for (int element=0;element<data.length-1;element++) {
        //compare side-by-side elements and swap them if
        //first element is greater than second element
        if (data[element] > data[element + 1]) { //If you want it to go from greatest to least flip to less than symbol
          swap(data, element, element + 1);  //call swap method
        }
      }
    }
  }

  public static void swap(double array2[], int first, int second) {
    double hold = array2[first];
    array2[first] = array2[second];
    array2[second] = hold;
  }
}
