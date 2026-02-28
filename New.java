public class New {
    public static void main(String[] args) {
        int []a={0,0,1,1,1,2,2,3,3,4};
        int l=0;
       int point=0;
        for (int i = 1; i < a.length; i++) {
            
        
            if(a[l]!=a[i]){
                l++;
            a[l]=a[i];
        
        }
                         
    }
        System.out.println(l+1);
    
    }
}
