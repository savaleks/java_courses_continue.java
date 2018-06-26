package Students;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sample1 {
    private String name;
    private String model;

    public Sample1(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Sample1() {
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyObject [name=" + name + "]";
    }

    public static void main(String[] args){
        List<Sample1> l = new ArrayList<>();
        l.add(new Sample1("Alex","volvo"));
        l.add(new Sample1("Adam", "opel"));
        l.add(new Sample1("tom", "nissan"));

        Collections.sort(l, new Comparator<Sample1>(){

            @Override
            public int compare(Sample1 o1, Sample1 o2) {
                if (o1.name == null && o2.name == null){
                    return 0;
                }else if (o1.name == null){
                    return -1;
                }else if (o2.name == null){
                    return 1;
                }else{
                    return o1.name.toUpperCase().compareTo(o2.name.toUpperCase());
                }
            }

        });

        System.out.println(l);
    }
}