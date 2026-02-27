public class Two {
    public static void main(String[] args) {
        int[]a={2,7,11,15}; 
        int sum=9;
        int l=0;
        int r=a.length-1;
      while(l<r){
            int cur=a[l]+a[r];
            if(cur>sum){
                r--;
            }
            else if(cur<sum){
                l++;
            }
            else{
                System.out.println((l+1)+" "+(r+1));
                break;
            }
        }
    }
}
