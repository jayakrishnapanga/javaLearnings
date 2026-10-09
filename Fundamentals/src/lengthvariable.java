public class lengthvariable {

    public static void main(String[] args){

        int[] numbers = new int[10];
        System.out.println(numbers.length);
    }
}



//In Java, the length property (for arrays) and the length() method (for strings) are implemented differently.
// Let's break down whether they are final and what that means.
//1. Is length a final variable for arrays?
//Yes, the length field for arrays in Java is effectively final.
//Why? Once an array is created, its size is fixed and cannot be changed.
// The length property is automatically assigned when the array is initialized, and it cannot be modified afterward.
//Final Behavior: You cannot reassign or change the value of array.length during the program's execution.
// However, this is not explicitly marked as final in the language, but it behaves as if it were final because the array's size is immutable.

