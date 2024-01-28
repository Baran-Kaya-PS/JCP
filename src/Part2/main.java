package Part2;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class main {
    public static void main(String[] args) {

    }
    public boolean checkNullImperative(Object o){
        return o == null;
    }
    public static void checkNullFunctional(Object obj){
        Optional.ofNullable(obj)
                .ifPresentOrElse(
                        o -> System.out.println("0"),
                        () -> System.out.println("1")
                );
    }
    public static boolean intContainsNull(List<Integer> list){
        if (list == null) return true;
        return list.stream()
                .anyMatch(Objects::isNull);
    }

}
