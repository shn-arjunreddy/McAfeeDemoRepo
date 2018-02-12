import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * This file has confidential information
 */
public class Test {

    public static void main(String args[]) {
        List<String> test = Lists.newArrayList("1a","1b","1c","1d","1e","2a","2b","2c","2d","2e","3a","3b","3c","3d","3e" );
        Iterables.partition(test, 5).forEach(batch -> process(batch));
    }

    private static void process(List<String> batch) {
        for (String test : batch ) {
            System.out.println(test);
        }
    }
}
