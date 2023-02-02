import java.util.List;
import java.util.Map;

@FunctionalInterface
public interface MyFunctionalInterface <K, V, T>{

    Map<K, V> myFunction(List<T> listForFunctiionKeys, List<T> listForFunctionValues);

}
