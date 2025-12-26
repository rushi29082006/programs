import java.util.*;
public class array {
    static void main(String ... args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         int[] even = new int[4]; 
         for (int i=0;i<=3;i++){
            even[i]=s.nextInt();
         }
         System.out.print(Arrays.toString(even));

    }
    
}
