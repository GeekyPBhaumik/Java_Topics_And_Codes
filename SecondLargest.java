public class SecondLargest {

    static int secondLargest(int arr[]){
        int max=0;
        int secondLargest = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondLargest=max;
                max=arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[]={3,4,1,6,7};
        int secondMax = secondLargest(arr);
        System.out.println(secondMax);
    }
}
