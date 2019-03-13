import Profiles.*;

public class Accounting {
    private double ndfl = 0.13;
    private double north_premium = 0.3;


    private final double ENGINEER_SALARY = 1200.0;
    private final double WORKER_SALARY = 600.0;
    private final double MANAGER_SALARY = 500.0;


    private final double ONE_DETAIL_COST = 0.5;
    private final double ONE_DEAL_COST = 500;

    public double getNdfl() {
        return ndfl;
    }

    public void setNdfl(double ndfl) {
        this.ndfl = ndfl;
    }

    public double getNorth_premium() {
        return north_premium;
    }

    public void setNorth_premium(double north_premium) {
        this.north_premium = north_premium;
    }

    public Double calculateSalary(Employer employer) {
        switch (employer.getClass().getCanonicalName()) {
            case "Profiles.Engineer":
                return calculateForEngineer((Engineer) employer);
            case "Profiles.Worker":
                return calculateForWorker((Worker) employer);
            case "Profiles.Manager":
                return calculateForManager((Manager) employer);
            default:
                System.out.println("Create case for new profile");
        }
        return null;
    }

    public Double calculateForEngineer(Engineer engineer) {
        double salary = ENGINEER_SALARY * engineer.getQualification();
        return calculateFinalSalary(salary);
    }

    public Double calculateForWorker(Worker worker) {
        double salary = WORKER_SALARY * worker.getQualification() + (worker.getDetailsCount() * ONE_DETAIL_COST);
        return calculateFinalSalary(salary);
    }

    public Double calculateForManager(Manager manager) {
        double salary = MANAGER_SALARY + (manager.getDealCount() * ONE_DEAL_COST);
        return calculateFinalSalary(salary);
    }

    private Double calculateFinalSalary(Double salary) {
        salary -= salary * ndfl;
        salary += salary * north_premium;
        return salary;
    }

}
