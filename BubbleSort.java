public class BubbleSort {
    public static void Bubblesort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int swap=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                swap++;
                }
            }
            if(swap==0){
                System.out.println("The array is alraedy sorted:");
                break;
            }
        }
    }
public static void Print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    Bubblesort(arr);
    Print(arr);
}
}