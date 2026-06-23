public class June23 {
    public static void main(String[] args) {
        int[]arr={1,1,2,28,8,8,3,1,1};
        int target=4;
        int len=0;
        int sum=0;
        
       for(int i=0,j=0;j<arr.length;j++){
            sum+=arr[j];

            while(sum>target){
                sum-=arr[i];
                i++;
            }
            
                len+=(j-i+1);
            
       }
    System.out.println(len);
    }
}
