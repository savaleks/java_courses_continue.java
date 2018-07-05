package lesson18;

public class Arrays {

    public static void main(String[] args) {

        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};
        int sum = 0;
        int sum1 = 0;

        for(int i:a){
            sum+=i;
        }
        for(int j:b){
            sum1+=j;
        }
        System.out.println(sum - sum1);
    }

}
