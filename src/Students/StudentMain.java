package Students;

//PASALINA STUDENTUS KURIE PRALEIDZIA DAUGIAU NEGU 20 PROC. PASKAITU;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentMain {
    private static final int REQUIRED_ATTENDANCE = 80; //procentai
    private static final int LESSONS = 11; //pamoku skaicius;

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("R", 10));
        students.add(new Student("T", 8));
        students.add(new Student("E", 9));
        students.add(new Student("W", 11));
        students.add(new Student("V", 8));

        System.out.println("Before: " + students);
        Iterator<Student> studentIterator = students.iterator();
        Student st;
        while (studentIterator.hasNext()){
            st = studentIterator.next();
            double attendance = st.getLessonsAttended()*100/LESSONS;
            System.out.println(st + " " + attendance + "%");
            if(attendance <= REQUIRED_ATTENDANCE){
                studentIterator.remove();
            }
        }
        System.out.println("After: " + students);
    }
}
