package Profiles;

public class Manager extends Employer {

    private int dealCount;

    public Manager(String name, String secondName) {
        super(name, secondName);
        dealCount = 0;
    }

    public int getDealCount() {
        return dealCount;
    }

    public void addDeal(int n) {
        dealCount += n;
    }

    public void setDealCountToZero(){
        this.dealCount = 0;
    }

    public void setDealCount(int dealCount) {
        this.dealCount = dealCount;
    }
}
