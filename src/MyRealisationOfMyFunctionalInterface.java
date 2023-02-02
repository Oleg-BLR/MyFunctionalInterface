import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
УСЛОВИЕ

Дано два ArrayList. ArrayList<String> и ArrayList<Integer>.
Я хочу создать функциональный интерфейс, который возвращает HashMap<String, Integer>,
у которого ключ это стринг первого эррэйлиста, а значение - интежер второго эррэйлиста.

Т.е. дано:
[two, four, seven, nine]
[2, 4, 7, 9]

Результат
{four=4, nine=9, seven=7, two=2}

*/

public class MyRealisationOfMyFunctionalInterface {

    public static void main(String[] args) {

        List<String> myInitialStringList = new ArrayList<>(Arrays.asList("two", "four", "seven", "nine"));
        List<Integer> myInitialIntegerList = new ArrayList<>(Arrays.asList(2, 4, 7, 9));

        System.out.println(myInitialStringList);
        System.out.println(myInitialIntegerList);

        MyRealisationOfMyFunctionalInterface myRealisationOfMyFunctionalInterface = new MyRealisationOfMyFunctionalInterface();
        myRealisationOfMyFunctionalInterface.myMethodOfFunctionalInterface().myFunction(myInitialStringList, myInitialIntegerList);
    }


    public MyFunctionalInterface<List<String>, List<Integer>, Map<String,Integer>> myMethodOfFunctionalInterface() {

        return (k, v) -> Stream.concat(k.stream(), v.stream()).collect(Collectors.toMap(k, v));
    }

}

