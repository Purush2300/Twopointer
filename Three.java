import java.lang.reflect.Array;

public class Three {
    public static void main(String[] args) {
        int []a={1,8,6,2,5,4,8,3,7};
        int width=0;
        int l=0;
      
        int r=a.length-1;
        int max=0;
        while (r>l) {
           int w=r-l;
         
            int min=Math.min(a[r], a[l]);
            int area=w*min;
            max=Math.max(max, area);
            if(a[l]<a[r]){
                l++;
            }
          else{
            r--;
          }

        }
        System.out.println(max);
    }
}
