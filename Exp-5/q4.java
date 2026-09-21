import java.util.*;
public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element");
        int ele=sc.nextInt();
        int c=0;
        int mid;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            mid=(i+j)/2;
            if(arr[mid]==ele){
                System.out.println("element found "+i);
                c++;
                break;
            }
            else if(arr[mid]>ele){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        if(c==0){
            System.out.println("not found");
        }
        sc.close();

    }
}
