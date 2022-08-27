import java.util.Arrays;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Array {
    public static void main(String[] args) {
        //task1
        int[] arrays0 = new int[3];
        arrays0[0] = 1;
        arrays0[1] = 2;
        arrays0[2] = 3;

        double[] arrays1 = new double[]{1.57, 7.654, 9.986};

        String[] arrays2 = new String[]{"Hi", "World", "Z"};

        //task2
        System.out.println(Arrays.stream(arrays0)
                        .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));

        System.out.println(Arrays.stream(arrays1)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));

        System.out.println(String.join(", ", arrays2));

        //task3

        System.out.println(Arrays.stream(arrays0)
                .sorted()
                .mapToObj(String::valueOf)
                        .sorted(Collections.reverseOrder())
                .collect(Collectors.joining(", ")));

        System.out.println(Arrays.stream(arrays1)
                .mapToObj(String::valueOf)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining(", ")));

        System.out.println(Arrays.stream(arrays2)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining(", ")));


        //task4
        for(int i=0;i<arrays0.length;i++){
            if(arrays0[i]%2!=0){
                arrays0[i]+=1;
            }
        }
        System.out.println(Arrays.toString(arrays0));



    }
}
