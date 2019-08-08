package org.launchcode.java.studios;

import java.util.HashMap;

public class CountingCharacters {

    public static void main(String args[]){
        HashMap<Character,Integer> characters = new HashMap<>();
        String sentence="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        for (char ch: sentence.toCharArray()){
            if(characters.containsKey(ch)){
                int value = characters.get(ch).intValue()+1;
                characters.replace(ch,value);
            }else{
                characters.put(ch,1);
            }
        }
        characters.forEach((key,value) -> System.out.println(key+":"+value));
    }
}
