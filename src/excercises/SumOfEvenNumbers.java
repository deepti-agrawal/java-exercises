package excercises;

import java.util.ArrayList;
import java.util.Iterator;

public class SumOfEvenNumbers {

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(6);
        list.add(2);
        System.out.println("The sum of even numbers is:-"+sum(list));
    }

    public static int sum(ArrayList<Integer> list){
        int sum =  0;
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            int num = itr.next();
            if(num%2 == 0){
                sum+=num;
            }
        }
        return sum;
    }
}
