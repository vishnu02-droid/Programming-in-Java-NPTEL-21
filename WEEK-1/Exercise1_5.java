import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }
      //Initialize maximum element as first element of the array.  
   //Traverse array elements to get the current max.
   //Store the highest mark in the variable result.
   //Store average mark in avgMarks.
int max=arr[0];
double sum=arr[0];
//traverse array elements to get the current max
for(i=1;i<arr.length;i++)
{
sum=sum+arr[i];
if(arr[i]>max)
max =arr[i];
}
//Store the highest mark in the variable max
//Store average mark in avgMarks
result=max;
mark_avg=sum/(arr.length);
//Evaluation code
System.out.println(result);
System.out.print(mark_avg);
 }
}
