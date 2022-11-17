import java.util.Scanner; 
import java.util.Arrays;
public class SortedArray {
    // write code here
    
  static int i,j;
    public static int[] getIntegers(int n){
        Scanner sc= new Scanner(System.in);
        
         int [] arr=new int[n]; 
        for( i=0;i<n;i++)
         arr[i]=sc.nextInt();
         
     return arr;     
    } 
    public static void printArray(int []a){
        for(i=0;i<a.length;i++)
          System.out.println("Element "+i+" contents "+a[i]);
    }
    public static int[] sortIntegers(int [] arr){
        int [] a=Arrays.copyOf(arr,arr.length);
        for(i=0;i<a.length-1;i++){
            for(j=0;j<a.length-1-i;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
}
