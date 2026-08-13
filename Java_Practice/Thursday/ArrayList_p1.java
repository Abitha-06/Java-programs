package Java_Practice.Thursday;
import java.util.*;

public class ArrayList_p1 {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    while(true)
    {
        int a = s.nextInt();
        if(a==-1) break;
        list.add(a);
    }
    System.out.println("Before sorting" + list);
    int n=list.size();
    for(int i=0;i<n-1;i++)
    {
        boolean flag = true;
        for(int j=0;j<n-1-i;j++)
        {
            if(list.get(j)>list.get(j+1))
            {
                int temp = list.get(j);
                list.set(j,list.get(j+1));
                list.set(j+1,temp);
                flag = false;
            }
        }
        if(flag) break;
    }
    System.out.println("After sorting" + list);
}
}
