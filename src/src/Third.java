import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Copyright (c) Anton on 13.09.2018.
 */
public class Third {
     ArrayList<Second> listC = new ArrayList <>() ;

    public static void main(String[] args) {
        Third third1 = new Third();
        Third third2 = new Third();

        Second second1 = new Second();
        Second second2 = new Second();

        First first1 = new First();
        First first2 = new First();
        First first3 = new First();

        third1.listC.add(second1);
        third1.listC.add(second2);

        third2.listC.add(second2);

        second1.listA.add(first1);
        second1.listA.add(first2);

        second2.listA.add(first3);
        second2.listA.add(first2);

        Map<First,ArrayList<Third>> res = new HashMap <>();

        third1.listC.stream().forEach(item -> item.listA.stream().;




    }
}
