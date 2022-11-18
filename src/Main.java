public class Main {
    public static void main(String[] args) {
        Kurulush[] kurulush=  {new Flat(3),new Hostel(5),new Hotel(4)};
        for (Kurulush kurulus:kurulush) {
            kurulus.address();
            kurulus.rent();
            kurulus.publicService();

            System.out.println("=====================================================");

        }

    }
}