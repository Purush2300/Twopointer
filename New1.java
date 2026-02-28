import java.util.Arrays;
public class New1 {
    public static void main(String[] args) {
        int []a={1,3,3,4,2};
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if(a[i]==a[i-1]){
              System.out.println(a[i]);
  
            }
        }
    }
}
