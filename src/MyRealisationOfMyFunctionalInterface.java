import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
УСЛОВИЕ

Дано два ArrayList. ArrayList<String> и ArrayList<Integer>.
Я хочу создать функциональный интерфейс, который возвращает HashMap<String, Integer>,
у которого ключ это стринг первого эррэйлиста, а значение - интежер второго эррэйлиста.
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
