import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag=false;
        int n=10;
        int k=s.nextInt();
        int min=Integer.MAX_VALUE;
        int data[] = new int[n];
        for(int i=0;i<n;i++){
        	data[i]=s.nextInt();
            if(data[i]<daa){
              	flag=true;
          		break;
            }
        }
      if(flag)
        System.out.print("yes");
      else
         System.out.print("no");
       
    }
}
