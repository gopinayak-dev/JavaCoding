//print maximum produt of a given array
public class MaxProduct{
       public static void main(String[] args){
              int[] a = {2,5,1,3,7}; //{2,5,1,3,7};
              int maxproduct = getMaxProduct(a);
              System.out.println("maximum product: "+maxproduct);
       }

       public static int getMaxProduct(int[] a){

              if(a.length<2){
                 System.out.println("No pairs exists");
                 return 0;
              }
              else{
                  int max = 0;
              int secondMax = 0;
              for(int x: a){
                  if(x>max){
                     secondMax = max;
                     max = x;
                  }
                  else if(x>secondMax){
                       secondMax = x;  
                  }
                
              }
              System.out.println("max:"+max);
              System.out.println("secondMax:"+secondMax);
              return max * secondMax;
              }
              
       }
}