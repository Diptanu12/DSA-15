public class RoatedArray1Place {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotatedByOne(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void rotatedByOne(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
}
