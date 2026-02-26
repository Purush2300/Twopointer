public class Zero {
    public static void main(String[] args) {
        int[]a={0,1,2,2,3,0,4,2};
        int k=2;
        int l=0;
        
     for (int i = 1; i < a.length; i++) {
        if(a[i]==k){
            int temp=a[i];
            a[i]=a[l];
            a[l]=temp;
           l++;
        }
         
     }
  
    System.out.println(l);
    }
}
