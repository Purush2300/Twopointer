public class Altitude {
    public static void main(String[] args) {
        int []a={-5,1,5,0,-7};
        int max=0;


       
        for (int i = 1; i < a.length; i++) {
            a[i]=a[i-1]+a[i];
          max=Math.max(max, a[i]);
        }
     System.out.println(max);
    }
}
