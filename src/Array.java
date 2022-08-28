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

        for(int k=0;k<3;k++){
            if(k!=2){
                System.out.print(arrays0[k]+",");
            }else{
                System.out.print(arrays0[k]);
            }
        }
        System.out.println("\n");
        for(int k=0;k<3;k++){
            if(k!=2){
                System.out.print(arrays1[k]+",");
            }else{
                System.out.print(arrays1[k]);
            }
        }
        System.out.println("\n");
        for(int k=0;k<3;k++){
            if(k!=2){
                System.out.print(arrays2[k]+",");
            }else{
                System.out.print(arrays2[k]);
            }
        }
        System.out.println("\n");

        //task3

        for(int k=2;k>=0;k--){
            if(k!=0){
                System.out.print(arrays0[k]+",");
            }else{
                System.out.print(arrays0[k]);
            }
        }
        System.out.println("\n");
        for(int k=2;k>=0;k--){
            if(k!=0){
                System.out.print(arrays1[k]+",");
            }else{
                System.out.print(arrays1[k]);
            }
        }
        System.out.println("\n");
        for(int k=2;k>=0;k--){
            if(k!=0){
                System.out.print(arrays2[k]+",");
            }else{
                System.out.print(arrays2[k]);
            }
        }
        System.out.println("\n");


        //task4
        for(int i=0;i<arrays0.length;i++){
            if(arrays0[i]%2!=0){
                arrays0[i]+=1;
            }
        }
        System.out.println(Arrays.toString(arrays0));



    }
}
