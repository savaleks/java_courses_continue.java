package lesson19;

/*
Sukurkite sąskatas-faktūras aprašančią klasę, kurioje būtų
sąskaitpos datos laukas (LocalDate), kliento laukas (klasė arba
tik String tipo) ir sumos laukas (BigDecimal).
Sukurkite sąrašą tokių įrašų su skirtingomis datomis ir
sumomis.
Parašykite metodą kuris iš sąrašo suformuoja kitą sąrašą -
ataskaitą parodančią kokios yra pajamos pagal ketvirčius.
 */

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Invoice {
    private LocalDate data;
    private String client;
    private BigDecimal suma;

    Invoice(LocalDate date, String client, BigDecimal suma) {
        this.data = date;
        this.client = client;
        this.suma = suma;
    }

    public LocalDate getData() {
        return data;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public BigDecimal getSuma() {
        return suma;
    }

    public void setSuma(BigDecimal suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return this.getData() + " " + this.getClient() + " " + this.getSuma().doubleValue();
    }
}
