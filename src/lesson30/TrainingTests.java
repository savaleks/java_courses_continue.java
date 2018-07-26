package lesson30;

public class TrainingTests {
    public static void main(String[] args) {
        System.out.println(middleThree("solving")); //lvi
        System.out.println(middleThree("andy")); //andy ?
        System.out.println(middleThree("Candy")); //and
        System.out.println(middleThree("and")); //and
        System.out.println(middleThree("dy")); //dy
        System.out.println(middleThree("y")); //y
        System.out.println(middleThree(null)); //null
    }

    private static String middleThree(String str) {
        //nurodom salyga kokio ilgio zodziai turi buti ir kad nebutu lyginiu raidziu skaicius;
        if (str != null && str.length() > 3) {
            //dalinam zodi per puse;
            int middle = str.length() / 2;
            //pridedame po viena raide is abieju pusiu;
            return str.substring(middle - 1, middle + 2);
        }
        return str;
    }
}
