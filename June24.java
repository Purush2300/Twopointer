import java.util.*;
public class June24 {
    public static void main(String[] args) {
        int[]arr={7};
        HashMap <Integer,Integer> map=new HashMap<>();
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i])>arr.length/2){
                 System.out.println(arr[i]);
                 return;
            }
        }
        System.out.println(-1);
    }
}
