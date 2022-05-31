import java.util.Arrays;

public class Difference {
        public static void difference(String[] args) {

            int[] num_list = {5, 7, 2, 4, 9};
            System.out.println("Array of numbers: "+Arrays.toString(num_list));

            int max = num_list[0];
            int min = num_list[0];

            for(int i = 1; i < num_list.length; i++) {
                if(num_list[i] > max)
                    max = num_list[i];
                else if(num_list[i] < min)
                    min = num_list[i];
            }
            System.out.println("This is the difference between the largest and smallest values in an array of numbers: "+(max-min));
        }
}