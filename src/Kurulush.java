public abstract class Kurulush implements Hint {
    private int personNumber;

    public Kurulush(int personNumber) {
        this.personNumber = personNumber;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    @Override
    public void publicService() {

    }

    @Override
    public void rent() {

    }

    @Override
    public void address() {

    }
    public void method(){

        System.out.println("adm sany"+personNumber);
    }
}
