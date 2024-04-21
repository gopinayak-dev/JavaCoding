
public class IncremeantOperator {

    public static void main(String[] args) {
        
        int x = 10;
        incremeant(x);
        decremeant(x);
        
    }
    
    public static void incremeant(int x){

        int y = x++;
        /*Assigns the current value of x to y and then increments the value of x. 
        This is a post-increment operation. Therefore, y will initially be assigned the value of x, 
        which is 10, and then x will be incremented to 11. */
        System.out.println(y);

        y = ++x;
        /* Increments the value of x and then assigns the incremented value to y. 
        This is a pre-increment operation. Therefore, x is first incremented to 12, 
        and then the incremented value is assigned to y. */
        System.out.println(y);
    }

    public static void decremeant(int x){
        int y = x--;
        System.out.println(y);

        y = --x;
        System.out.println(y);
    }

}
