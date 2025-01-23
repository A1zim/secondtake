import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner newArr = new Scanner(System.in);
        System.out.println("How many elements: ");
        int q = newArr.nextInt();
        int[] myArr = new int[q];
        System.out.println("Total "+q+" elements");
        for (int i=0; i<q; i++){
            System.out.println("Number: "+(i+1));
            myArr[i] = newArr.nextInt();
        }
        System.out.println("The sum is: "+sumOfArr(myArr));
        System.out.println("The average is: "+avgOfArr(myArr));
        maxOfArr(myArr);
        minOfArr(myArr);
    }

    public static int sumOfArr(int[] array){
        int total = 0;
        for (int i:array){
            total += i;
        }
        return total;
    }
    public static double avgOfArr(int[] array){
        int theSum = 0;
        for (int i:array){
            theSum += i;
        }
        return (double) theSum/array.length;
    }
    public static int maxOfArr(int[] array) {
        int maxNum = array[0];
        double second = Double.NEGATIVE_INFINITY;
        for (int i=0; i<array.length; i++){
            if (array[i]>maxNum)
                maxNum = array[i];
            for (int j=0; j<i; j++){
                if (array[j]>second&&array[j]!=maxNum)
                    second = array[j];
            }
        }
        System.out.println("Max number is: "+maxNum+"\nSecond max is: "+second);
        return 0;
    }
    public static int minOfArr(int[] array){
        double second = Double.POSITIVE_INFINITY;
        int minNum = array[0];
        for (int i=0; i<array.length; i++){
            if (array[i]<minNum)
                minNum = array[i];
            for (int j=0; j<i; j++){
                if (array[j]<second&&array[j]!=minNum)
                    second = array[j];
            }
        }
        System.out.println("Min number is: "+minNum+"\nSecond min is: "+second);
        return 0;
    }
}