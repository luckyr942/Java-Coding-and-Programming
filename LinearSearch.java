class LinearSearch{  
    static int search(int arr[], int N, int X)
    {
        for(int i=0; i<N; i++){
            
            if(arr[i]==X){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        int N = arr.length;
        int X = 4;
        
        int index = search(arr,N,X);
        
        if (index==1){
        System.out.println("Element is not present in the array");
        }
        else{
            System.out.println("Element is found at position"+index);
        }
    }  
}
