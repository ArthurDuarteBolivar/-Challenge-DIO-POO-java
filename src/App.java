import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Course courseJava = new Course();
        courseJava.setTitleString("Curso java");
        courseJava.setDescriptionString("Descrição curso java");
        courseJava.setWorkload(8);

        Course courseAngular = new Course();
        courseAngular.setTitleString("Curso Angular");
        courseAngular.setDescriptionString("Descrição curso angular");
        courseAngular.setWorkload(10);

        System.out.println(courseJava);
        System.out.println(courseAngular);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitleString("Mentoria Java");
        mentoring.setDescriptionString("Descrição mentoria java");
        mentoring.setDate(LocalDate.now());
        
        System.out.println(mentoring);
    }
}
