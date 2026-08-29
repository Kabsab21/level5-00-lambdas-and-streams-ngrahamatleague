package _04_Searching_With_Streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSearcher {
    /*
     * Use stream methods to return the number of times a string appears
     * in the array of strings.
     *
     * The filter() and count() stream methods may be useful here.
     */
    public long containsCount(String[] strArr, String strToCount) {
    	 Stream<String> arrStream = Arrays.stream(strArr);
        
        return arrStream.filter((word) -> word.equals(strToCount)).count();
    }
}

//						.stream(words)                          // 1.
//                              // 2.
//                        .map((word) -> word.length())           // 3.
//                        .reduce(0, (acc, next) -> acc + next);  // 4.