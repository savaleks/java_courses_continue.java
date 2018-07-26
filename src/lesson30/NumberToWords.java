package lesson30;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(reverse(123));
        numberToWords(reverse(-12));
        numberToWords(reverse(1000));
        numberToWords(reverse(1010));
    }

    public static void numberToWords(int number)
    {
        int reversedValue = reverse(number);
        int digitCounter = getDigitCount(number);
        if (reversedValue > 0)
        {
            int counter = 0;
            while (reversedValue > 0)
            {
                switch (reversedValue % 10)
                {
                    case 0:
                        System.out.print("Zero ");
                        counter++;
                        break;
                    case 1:
                        System.out.print("One ");
                        counter++;
                        break;
                    case 2:
                        System.out.print("Two ");
                        counter++;
                        break;
                    case 3:
                        System.out.print("Three ");
                        counter++;
                        break;
                    case 4:
                        System.out.print("Four ");
                        counter++;
                        break;
                    case 5:
                        System.out.print("Five ");
                        counter++;
                        break;
                    case 6:
                        System.out.print("Six ");
                        counter++;
                        break;
                    case 7:
                        System.out.print("Seven ");
                        counter++;
                        break;
                    case 8:
                        System.out.print("Eight ");
                        counter++;
                        break;
                    case 9:
                        System.out.print("Nine ");
                        counter++;
                        break;
                }
                reversedValue /= 10;
            }
            if (counter != digitCounter && digitCounter != -1)
            {
                while (digitCounter != counter)
                {
                    System.out.print("Zero ");
                    digitCounter--;
                }
            }
        } else if (number == 0)
            System.out.println("Zero");
        else
            System.out.println("Invalid Value");
    }

    public static int reverse(int number) {
        int reversenum = 0;
        while (number != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + number % 10;
            number = number / 10;
        }
        return reversenum;
    }

    public static int getDigitCount(int number)
    {
        if (number < 0)
            return -1;
        int counter = 0;
        boolean conditon = false;
        while (!conditon)
        {
            number /= 10;
            counter++;
            if (number == 0)
                conditon = true;
        }
        return counter;
    }
}

