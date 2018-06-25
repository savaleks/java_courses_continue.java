package lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.lang.String.format;

/**
 * Tarkime turime klasę Employee ir jos vidinę klasę Address.
 * Tegul klasėje Employee turime du laukus - String name ir
 * Address address, o Address klasė turi laukus - String city,
 * String address.
 * <p>
 * Sukurkite keletą darbuotojų su vardu ir adresu ir pabandykit
 * nustatyti iš kiek skirtingų miestų yra darbuotojai.
 * <p>
 * Išvesti miestų pavadinimus su darbuotojų skaičiumi (panaudoti Map interfeisą).
 */

class Employee {
    String name;
    Employee.Address address;

    // darbuotojo konstruktorius
    Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // vidine statine klase
    static class Address {
        String city;
        String address;

        // adreso konstruktorius
        Address(String city, String address) {
            this.city = city;
            this.address = address;
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Employee1", new Employee.Address("Vilnius", "adr"));
        Employee e2 = new Employee("Employee2", new Employee.Address("Vilnius", "adrrr"));
        Employee e3 = new Employee("Employee2", new Employee.Address("Kaunas", "aadr"));
        Employee e4 = new Employee("Employee2", new Employee.Address("Vilnius", "ssadr"));
        Employee e5 = new Employee("Employee2", new Employee.Address("Ignalina", "gadr"));

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        countCities(employees);
        printStats(employees);
    }

    private static void countCities(List<Employee> employees) {
        Set<String> uniqueCities = new HashSet<>();
        for (Employee e : employees) {
            uniqueCities.add(e.address.city);
        }
        System.out.println(format("Employees are from %d different cities", uniqueCities.size()));
    }

    private static void printStats(List<Employee> employees) {
        Map<String, List<Employee>> employeesByCity = new HashMap<>();
        // idedame darbuotojus pagal miestus
        for (Employee e : employees) {
            String city = e.address.city;
            // jei dar nebuvo irasyta miesto darbuotoju (raktas neegzistuoja mape)
            // turime sukurti tuscia lista, kad galetume talpinti juos
            if (!employeesByCity.containsKey(city)) {
                employeesByCity.put(city, new ArrayList<>());
            }
            employeesByCity.get(city).add(e);
        }

        // spausdiname rakta (miesta) ir elementu skaiciu (darbuotoju sk.)
        for (Map.Entry<String, List<Employee>> entry : employeesByCity.entrySet()) {
            System.out.println(format("%s - %d", entry.getKey(), entry.getValue().size()));
        }
    }
}