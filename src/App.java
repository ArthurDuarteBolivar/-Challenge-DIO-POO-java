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

        Mentoring mentoring = new Mentoring();
        mentoring.setTitleString("Mentoria Java");
        mentoring.setDescriptionString("Descrição mentoria java");
        mentoring.setDate(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição do java");
        bootcamp.getContends().add(courseAngular);
        bootcamp.getContends().add(courseJava);
        bootcamp.getContends().add(mentoring);

        Dev devArthur =  new Dev();
        devArthur.subscribeBootcamp(bootcamp);
        devArthur.setNameString("Arthur");
        devArthur.progress();
        devArthur.progress();
        devArthur.progress();
        devArthur.calculateTotalXp();

        Dev devJoao =  new Dev();
        devJoao.subscribeBootcamp(bootcamp);
        devJoao.setNameString("João");
        devJoao.progress();
        devArthur.calculateTotalXp();

        System.out.println(devArthur.getContendsSubscribe());
        System.out.println(devJoao.getContendsSubscribe());
        System.out.println(devArthur.getContendsConcluded());
        System.out.println(devJoao.getContendsConcluded());
        System.out.println(devArthur.calculateTotalXp());
        System.out.println(devJoao.calculateTotalXp());

    }
}
