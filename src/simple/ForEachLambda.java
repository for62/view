package simple;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lists.add(i);
        }
        lists.forEach(System.err::println);
    }
}
