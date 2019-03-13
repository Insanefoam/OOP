import Profiles.Employer;
import Profiles.Engineer;
import Profiles.Manager;
import Profiles.Worker;

public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer("Никита", "Вардугин", 3);
        Worker worker = new Worker("Роман", "Разговоров", 5);
        Manager manager = new Manager("Александр", "Песков");
        Accounting accounting = new Accounting();

        manager.addDeal(5);
        worker.addDetails(500);

        System.out.println("Зарплата дворника: " + engineer.getFirstName() + " " + engineer.getSecondName() + " составляет: " + accounting.calculateSalary(engineer));
        System.out.println("Зарплата дворника 2 разряда: " + worker.getFirstName() + " " + worker.getSecondName() + " составляет: " + accounting.calculateSalary(worker));
        System.out.println("Зарплата дворника 3 разряда: " + manager.getFirstName() + " " + manager.getSecondName() + " составляет: " + accounting.calculateSalary(manager));
    }
}
