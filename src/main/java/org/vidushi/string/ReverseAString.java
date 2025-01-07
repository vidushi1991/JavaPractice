package org.vidushi.string;

import java.util.List;

public class ReverseAString {

    public static void main(String[] args) {
    //    reverseASingleName();
        reverseFullNameIndividually();
    }

    public static void reverseASingleName(){
        String name = "Vidushi Mishra";

        char[] charArray = name.toCharArray();


        for (int i = 0; i < charArray.length; i++) {
        }
        String reverse = "";

        for (int i = charArray.length -1;i >= 0;i--){
            reverse = reverse + charArray[i];
            System.out.println(reverse);
        }
    }

    public static void reverseFullNameIndividually(){
        String fullName = "Vijay Vardhan";
        List<String> name = List.of(fullName.split(" "));
        System.out.println(name);

          char[]  firstName = name.get(0).toCharArray();
          char[]  LastName = name.get(1).toCharArray();

          String reversedFirstName = "";
          String reversedLastName = "";
          for (int i=firstName.length-1;i>=0;i--){
              reversedFirstName = reversedFirstName +firstName[i];
          }
          for (int i = LastName.length-1;i>=0;i--){
              reversedLastName = reversedLastName + LastName[i];
          }
        System.out.println(reversedFirstName + reversedLastName);
    }
    public static void reverse(){
        String fullName = "Vijay Vardhan";
        char[]  chr = fullName.toCharArray();

    }


}
