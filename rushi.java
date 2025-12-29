import java.util.Scanner;

class arri{
static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
for (int j:arr){
System.out.print(j+" ");
}
}
}
