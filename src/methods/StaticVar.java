package methods;

public class StaticVar {

    private static String name;

    public StaticVar(String name) {
       StaticVar.name = name;
    }

    public void printName(){
        System.out.println("name= " + name);
    }
}

class InstanceVar {

    private String name;

    public InstanceVar(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("name= " + name);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Static variables");
        StaticVar rex = new StaticVar("rex");
        StaticVar max = new StaticVar("max");
        rex.printName();
        max.printName();
        System.out.println("Instance variables");
        InstanceVar rex1 = new InstanceVar("rex");
        InstanceVar max1 = new InstanceVar("max");
        rex1.printName();
        max1.printName();
    }
}
/*
output
Static variables
name= max
name= max
Instance variables
name= rex
name= max
 */
