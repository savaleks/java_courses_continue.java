package lesson28;

public class Homework {

    public static void main(String[] args) {
        // printMegaBytesAndKiloBytes(0);
       // System.out.println(bark(true, -1));
       // System.out.println(isLeapYear(1600));
       // System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.176));
        //System.out.println(hasTeen(44,55,29));
    }
//  1.
//    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//            if (0 <= kiloBytes) {
//                System.out.println(kiloBytes + " KB = " + kiloBytes/1024 + " MB and " + kiloBytes%1024 + " KB");
//            }
//            else if (kiloBytes < 0) {
//                System.out.println("Invalid Value");
//            }
//        }
//   2.
//    public static boolean bark(boolean barking, int hourOfDay) {
//        if (hourOfDay < 0 || hourOfDay > 23) {
//            return false;
//        } else if (barking) {
//            if (hourOfDay < 8 || hourOfDay > 22) {
//                return true;
//            } else if (barking) {
//                if (hourOfDay >= 8 || hourOfDay <= 22) {
//                    return false;
//                }
//            }
//        }
//        return false;
//    }
//   3.
//    public static boolean isLeapYear(int year){
//        if (year>=1&&year<=9999){
//            if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
//                return true;
//            else
//                return false;
//        } else {
//            return false;
//        }
//    }
//    4.
//    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
//        int a = (int) (x*1000);
//        int b = (int) (y*1000);
//      if (a == b){
//          return true;
//      } else {
//          return false;
//      }
//    }
//   5.
//    public static boolean hasTeen(int x, int y, int z){
//        if ((x>=13 && x<=19)||(y>=13 && y<=19)) {
//            return true;
//        } else if ((z>=13 && z<=19)||(y>=13 && y<=19)){
//            return true;
//        }
//        return false;
//    }
}

