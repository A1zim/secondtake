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
        System.out.println(maxAndMin(myArr));
        boolean isPal = isPalindrome(myArr);
        if (isPal){
            System.out.println("The array is Palindrome");
        }else{
            System.out.println("The array isn't Palindrome");
        }
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
    public static int maxAndMin(int[] array){
        int maxNum = array[0];
        int minNum = array[0];
        int secMax = array[1];
        int secMin = array[1];
        for (int i=0; i<array.length; i++){
            if (array[i]>maxNum){
                maxNum=array[i];
            }
            if (array[i]<minNum){
                minNum=array[i];
            }
            if (array[i]>secMax && array[i]!=maxNum){
                secMax = array[i];
            }
            if (array[i]<secMin && array[i]!=minNum){
                secMin = array[i];
            }
        }
        System.out.println("Max number: "+maxNum+"\nMin number: "+minNum);
        if (array.length>1) {
            System.out.println("Second largest: " + secMax + "\nsecond smallest: " + secMin);
        }
        return 0;
    }
    public static boolean isPalindrome(int[] arr){
        double cycles = (double) arr.length /2;
        int l = arr.length;
        for (int i=0; i<cycles; i++){
            if (arr[i]!=arr[l-1-i]){
                return false;
            }
        }
        return true;
    }

}