public class Aspirant extends Student {
    String nauchnayaRabota;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String nauchnayaRabota) {
        super(firstName, lastName, group, averageMark);
        this.nauchnayaRabota = nauchnayaRabota;
    }
    @Override
    public int getScholarship() {
        if (averageMark == 5) {
            return 20000;
        }
        else {
            return 18000;
        }
    }
}
