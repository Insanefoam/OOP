package Profiles;

public class Worker extends Employer {
    private int qualification;
    private int detailsCount;

    public Worker(String name, String secondName, int qualification) {
        super(name, secondName);
        this.qualification = qualification;
        detailsCount = 0;
    }

    public void addOneDetail() {
        addDetails(1);
    }

    public void addDetails(int n) {
        detailsCount += n;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public int getDetailsCount() {
        return detailsCount;
    }

    public void setDetailsCount(int detailsCount) {
        this.detailsCount = detailsCount;
    }
    public void setDetailsCountToZero(){
        detailsCount = 0;
    }
}
