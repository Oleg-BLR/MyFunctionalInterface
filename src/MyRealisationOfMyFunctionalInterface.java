import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


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
        List<String> myInitialStringList = Arrays.asList("two", "four", "seven", "nine");
        List<String> mySecondInitialStringList = Arrays.asList("two", "four", "seven", "nine");
        List<Integer> myInitialIntegerList = Arrays.asList(2, 4, 7, 90);
        List<Integer> mySecondInitialIntegerList = Arrays.asList(2, 4, 7, 90);

        System.out.println(myInitialStringList);
        System.out.println(myInitialIntegerList);

        MyRealisationOfMyFunctionalInterface myRealisationOfMyFunctionalInterface =
                new MyRealisationOfMyFunctionalInterface();

        Map<String, String> resultMap = myRealisationOfMyFunctionalInterface.myMethodOfFunctionalInterface()
                .myFunction(myInitialStringList, mySecondInitialStringList);

        System.out.println(resultMap);

        List<Integer> list = IntStream.rangeClosed(1, 7)
                .filter(value -> value > 3)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list);

        List<Integer> list2 = IntStream.of(1, 2, 3, 4, 5)
                .boxed()
                .collect(Collectors.toList());

//        Map<Integer, Integer> map = (k, v) -> IntStream.of(1,2,3,4,5)
//                .boxed()
//                .collect(Collectors.toList());
//
//        System.out.println(list);


    }


    public MyFunctionalInterface<String> myMethodOfFunctionalInterface() {
        // https://stackoverflow.com/questions/1839668/what-is-the-best-way-to-combine-two-lists-into-a-map-java
        // можно выбрать любое другое решение по преобразованию в map
        MyFunctionalInterface<String> myFunctionalInterface = (k, v) -> IntStream.range(0, v.size())
                .boxed()
                .collect(Collectors.toMap(k::get, v::get));

        return myFunctionalInterface;
    }


//    public static void main(String[] args) {
//
//        List<String> myInitialStringList = new ArrayList<>(Arrays.asList("two", "four", "seven", "nine"));
//        List<Integer> myInitialIntegerList = new ArrayList<>(Arrays.asList(2, 4, 7, 9));
//
//        System.out.println(myInitialStringList);
//        System.out.println(myInitialIntegerList);
//
//        MyRealisationOfMyFunctionalInterface myRealisationOfMyFunctionalInterface = new MyRealisationOfMyFunctionalInterface();
//        myRealisationOfMyFunctionalInterface.myMethodOfFunctionalInterface().myFunction(myInitialStringList, myInitialIntegerList);
//    }
//
//
//    public MyFunctionalInterface<List<String>, List<Integer>, Map<String,Integer>> myMethodOfFunctionalInterface() {
//
//        return (k, v) -> Stream.concat(k.stream(), v.stream()).collect(Collectors.toMap(k, v));
//    }

}

