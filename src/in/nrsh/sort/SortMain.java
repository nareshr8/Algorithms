package in.nrsh.sort;

import java.util.Random;


public class SortMain {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < 10; i++) {
            numbers[i]=new Random().nextInt();
        }
        Sort sort=new MergeBottomUpSort();
        sort.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

            if(i < (numbers.length-1) && !sort.lessThan(numbers[i],numbers[i+1])){
                System.out.println("Incorrect Order");
            }
        }
    }
}
