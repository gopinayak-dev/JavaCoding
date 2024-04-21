public class SwapTwoNumbers {
    //Swap values of two variables without direct reassignment and without creating any extra variables.

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swaping value of a:"+a);
        System.out.println("after swaping value of b:"+b);
    }

}
