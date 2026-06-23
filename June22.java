public class June22 {
    public static void main(String[] args) {
        int[]a={2,1,1,5,8,5,4};
        int sum=4;
        int cnt=0;
        for(int i=0;i<a.length;i++){
            
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]<=sum){
                    cnt++;
                }
            }
            if(a[i]<=sum){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
