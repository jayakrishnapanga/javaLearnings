public class lengthmethod {

    public static void main(String[] args){
        String s="krishna";
        System.out.println(s.length());
    }
}


//Is length() a final method for strings?
//Yes, the length() method in the String class is a final method.
//Why? The String class in Java is immutable, and its length() method is defined as final to prevent subclasses from overriding it and changing its behavior.
//Final Method: A final method in Java cannot be overridden by subclasses.
//This ensures that the behavior of length() is consistent for all String objects.

//Source Example (in java.lang.String class):
//in java.lang.String idhi main string class dhantlo form line 18 to 20 la declare chesii untundhii length method
//public final int length() {
//    return value.length;
//}

//Aspect	            length (for arrays)	               length() (for strings)
//Final?	          Behaves like a final variable	     Explicitly a final method
//Changeable?    	  No, it cannot be reassigned	     No, it cannot be overridden
//Where it's used	  Arrays (as a property)	         Strings (as a method)


//length (array):   Acts as a read-only field after array creation.
//length() (String):  Is a final method and cannot be overridden.
