package lesson19;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Invoice invoice = new Invoice(LocalDate.of(2017,Month.MAY,15), "Alex Smith", new BigDecimal(1115.37));
        Invoice invoice1 = new Invoice(LocalDate.of(2017,Month.APRIL, 23), "Tom Tomson", new BigDecimal(1235.43));
        Invoice invoice2 = new Invoice(LocalDate.of(2017,Month.SEPTEMBER, 13), "Lee Tomson", new BigDecimal(1245.23));
        Invoice invoice3 = new Invoice(LocalDate.of(2017,Month.JULY, 25), "Sam Parson", new BigDecimal(1335.53));
        Invoice invoice4 = new Invoice(LocalDate.of(2017,Month.FEBRUARY, 5), "John Carson", new BigDecimal(1238.42));
        System.out.println(invoice.getClient()+ " | " +invoice.getSuma().doubleValue());

        List<Invoice> data1 = new ArrayList<>();
        data1.add(invoice);
        data1.add(invoice1);
        data1.add(invoice2);
        data1.add(invoice3);
        data1.add(invoice4);

        Collections.sort(data1, (i1, i2) -> i1.getData().compareTo(i2.getData()));
        System.out.println(data1.toString());

        //lygina menesius;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate date = LocalDate.of(2017, Month.APRIL, 23);
        LocalDate date2 = LocalDate.of(2017, Month.MAY, 15);
        LocalDate[] d = { date2, date };
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
    }
}
