class avg{
static void main(String... args){
int[] arr={1,2,3};
int count=0;
for(int i=0;i<arr.length;i++){
count+= arr[i];
}
System.out.println(count/arr.length);
}
}