package excercises;

import java.util.ArrayList;
import java.util.Iterator;

public class ArralyListAndStrings {

    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("This");
        list.add("foods");
        list.add("civic");
        list.add("Major");
        list.add("Humble");
        list.add("Kind");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String word = itr.next();
            if(word.length() == 5){
                System.out.println("Word with five characters is: "+word);
            }
        }
    }
}
