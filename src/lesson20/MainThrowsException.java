package lesson20;

public class MainThrowsException {
    public static void main(String[] args) {
        // naudojame try.. catch.. statements kad pagauti exception;
        try{
            int result = getFactorial(-6); // skaicius maziau uz 1;

            System.out.println(result);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }

    public static int getFactorial(int num) throws Exception{

        if(num<1) throw new Exception("The number is less than 1"); // rodo pranesima konsolyje
        int result=1;
        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }
}
