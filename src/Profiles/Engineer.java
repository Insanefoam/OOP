package Profiles;

public class Engineer extends Employer{
    private int qualification;

    public Engineer(String name, String secondName, int qualification) {
        super(name,secondName);
        this.qualification = qualification;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }
}
