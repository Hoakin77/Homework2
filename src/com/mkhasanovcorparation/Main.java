package com.mkhasanovcorparation;

public class Main {

    public static void main(String[] args) { //задание 5
       // int[] arr = {2, 6, 8};
      //  int min = arr[0], max = arr[0], indMax = 0, indMin = 0;
      //  for (int i = 0; i < arr.length; i++) {
       //     if (arr[i] > max) {
       //         max = arr[i];
        //        indMax = i;
       //     }
       //     if (arr[i] < min) {
       //         min = arr[i];
        //        indMin = i;
            }
    //    }
       // System.out.println("Максимальный элемент находится в массиве под индексом " + indMax + " со значением  = " + max);
      //  System.out.println("Минимальный элемент находится в массиве под индексом " + indMin + " со значением  = " + min);
    //}// задание 6
   // private static boolean checkBalance(int[] arr2) {
   //     int lSum, rSum;

     //   for (int i = 0; i < arr2.length + 1; i++) {
     //       lSum = 0;
     //       rSum = 0;

       //     for (int j = 0; j < i; j++) {
       //         lSum += arr2[j];
         //   }

        //    for (int j = i; j < arr2.length; j++) {
        //        rSum += arr2[j];
      //      }

         //   if (lSum == rSum) return true;
    //    }
     //   return false;
  //  }
    // задание 7
   // private static void shiftOfNumbers(int[] arrParam, int n) {
        //посмотрим матрицу до сдвмга
   //     for (int i : arrParam) System.out.print(i + " ");
    //    System.out.println("\r\n");

   //     if (n > 0) {
    //        for (int x = 0; x < n; x++) {
    //            int buf = arrParam[arrParam.length - 1];
    //            if (arrParam.length - 1 >= 0) System.arraycopy(arrParam, 0, arrParam, 1, arrParam.length - 1);
    //            arrParam[0] = buf;
                //смотрим матрицу после каждого сдвига
    //            for (int i : arrParam) System.out.print(i + " ");
    //            System.out.println();
      //      }
     //   }
    //    if (n < 0) {
    //        for (int x = 0; x > n; x--) {
    //            int buf = arrParam[0];
    //            System.arraycopy(arrParam, 1, arrParam, 0, arrParam.length - 1);
    //            arrParam[arrParam.length - 1] = buf;
                //смотрим матрицу после каждого сдвига
    //            for (int i : arrParam) System.out.print(i + " ");
    //            System.out.print("\r\n");
          //  }
     //   }
   // }
}
