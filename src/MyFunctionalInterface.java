import java.util.List;
import java.util.Map;

@FunctionalInterface
public interface MyFunctionalInterface <K>{
//    void myFunction();

    Map<K, K> myFunction(List<K> listForFunctiionKeys, List<K> listForFunctionValues);

}
