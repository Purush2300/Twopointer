public class June22 {
    public static void main(String[] args) {
        int[]a={2,1,1,5,8,5};
        int sum=4;
        int cnt=0;
        for(int i=0;i<a.length-1;i++){
            
            for(int j=i+1;j<a.length-1;j++){
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
