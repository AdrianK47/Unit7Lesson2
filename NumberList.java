import java.util.*;
public class NumberList{
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for(int i = 0; i < 101; i++){
            numList.add(i * 3);
        }
        System.out.println(numList);
}
}