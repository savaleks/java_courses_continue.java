package homework_other;
//pirmas uzdavinys pirmo varianto;
public class MoreTestFromLesson {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum = 0;
        for(int i=1; i<array.length-90; i=i+2) {
            sum += i;
        }
        //
        System.out.println(sum); //1 uzduotys
        System.out.println(lastNumbers()); //2 uzduotys
        System.out.println(staticMethod.anyName());// 3 uzduotys

    }
//pirmas uzdavinys antro varianto;
    public static int lastNumbers() {
        int[]arr = new int[100];
        int sum1 = 0;
        for (int j=0; j<arr.length; j++) {
            sum1 = arr.length-1 + arr.length-2 + arr.length-3;
        }
        return sum1;
    }
    //trecias uzduotys antrame variante;
    public interface staticMethod {
        static String anyName(){
            return "static";
        }
    }

}
