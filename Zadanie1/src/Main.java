public class Main {
    public static void main(String[] args) {
        Student Kirill = new Student("Kirill", "Shatokhin", "PKS-320", 4.06);
        Aspirant Vlad = new Aspirant("Voronov", "Vladislav", "PKS-320", 4.10,"Network");
        Student[] students = { Kirill, Vlad };

        for (Student s : students){
            System.out.println(s.getScholarship());
        }
    }
}
