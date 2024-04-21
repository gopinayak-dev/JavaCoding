public class StringEqual {

    // check equality of two strings
    /*Q: Explain why the output of this code snippet will always be "Two Strings are not equal" 
    even though both s1 and s2 contain the same string "Hello"? */

    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        if (s1 == s2) {
            System.out.println("Two Strings are equal");
        } else {
            System.out.println("Two Strings are not equal");
        }
    /*Ans:  In Java, the == operator checks for reference equality, meaning it checks if the two variables 
    refer to the same object in memory, not if the contents of the objects are the same. Even though the 
    contents of s1 and s2 are the same ("Hello"), they are different objects in memory because you're explicitly 
    creating new String objects with the new keyword. 
    To check if two strings have the same contents, you should use the equals() method instead of == */
    
    //Q: check equality of two nos(Primitive type)
        int a =10;
        int b=10;
        if (a == b) {
            System.out.println("Two nos are equal");
        } else {
            System.out.println("Two nos are not equal");
        }

        /*Ans: In Java, when you use the == operator with primitive types like int, it checks for value equality. 
        In this code, a and b both have the same value 10, so the condition a == b evaluates to true. 
        Therefore, the output will be "Two nos are equal". */

        //Q: What is String interning?
        String one = "VS";
        String two = "VS";
        
        if (one == two) {
            System.out.println("Two str are equal");
        } else {
            System.out.println("Two str are not equal");
        }

        /*Ans: In Java, when you create string literals (like "VS"), the compiler checks if there's 
        already an existing string with the same value in the string pool. If such a string exists, 
        the compiler reuses the reference to that string rather than creating a new one. 
        This process is called string interning. 

        In your code, both one and two are initialized with the same string literal "VS". Since string literals 
        are interned by the compiler, both one and two refer to the same string object in the string pool. 
        Therefore, when you use the == operator to compare them, it checks if they reference the same object, 
        which they do. Hence, the condition one == two evaluates to true, and the output is "Two str are equal".
        
        String internig:
        ---------------
        String interning is a process in Java where multiple references to the same string literal in the code point 
        to the same memory location, rather than each string literal having its own separate memory allocation. 
        This is done to conserve memory and optimize performance.
        
        String pool:
        ------------
        The string pool is a special area in the Java heap memory where all the string literals are stored. 
        If the string literal already exists in the pool, the compiler does not create a new string object. 
        Instead, it reuses the reference to the existing string object in the pool. */
    }

}
