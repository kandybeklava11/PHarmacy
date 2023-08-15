import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Medicine medicine1 = new Medicine("Analgin", 50, 200);
        Medicine medicine2 = new Medicine("Paretstamol", 30, 150);
        Medicine medicine3 = new Medicine("Tailalhot", 15, 500);
        Medicine medicine4 = new Medicine("Ibufen", 260, 80);
        Medicine medicine5 = new Medicine("Metanol", 345, 30);
        Medicine medicine6 = new Medicine("No Grip", 799, 60);

        Medicine[] medici1 = {medicine1, medicine2};
        Medicine[] medici2 = {medicine3, medicine4};
        Medicine[] medici3 = {medicine5, medicine6};

        Worker worker1 = new Worker("Papa Rimski", 78, "PapaRimski@email.com ");
        Worker worker2 = new Worker("Tashiev", 64, "Tashiev@email.com ");
        Worker worker3 = new Worker("JoBaidon", 70, "JoBaidon@email.com ");

        Worker[] worke1 = {worker1};
        Worker[] worke2 = {worker2};
        Worker[] worke3 = {worker3};

        Pharmacy pharmacy1 = new Pharmacy("Neman", "Ahunbaeva 165", medici1, worke1);
        Pharmacy pharmacy2 = new Pharmacy("Balabolot", "Chortekova 99", medici2, worke2);
        Pharmacy pharmacy3 = new Pharmacy("Kyzbolot", "Avatarov 85", medici3, worke3);

        Pharmacy[] phrmec = {pharmacy1, pharmacy2, pharmacy3};
        Db db = new Db(phrmec);

        // Получение всех медикаментов по имени аптеки
        Medicine[] pharmacy1Medicines = db.getAllMabicineByPharmasyName("Neman");
        if (pharmacy1Medicines != null) {
            System.out.println("Medicines in Neman Pharmacy:");
            for (Medicine medicine : pharmacy1Medicines) {
                System.out.println(medicine);
            }
        } else {
            System.out.println("Pharmacy not found.");
        }

        // Получение всех работников, отсортированных по адресу аптеки
        Worker[] sortedWorkers = db.getAllSortedByPharmacyAdress("Chortekova 99");
        if (sortedWorkers != null) {
            System.out.println("Workers in Pharmacy at Chortekova 99:");
            for (Worker worker : sortedWorkers) {
                System.out.println(worker);
            }
            // Добавление медикамента в аптеку
            Medicine newMedicine = new Medicine("New Medicine", 100, 50);
            String addMedicineResult = db.addMadicineToPharmacy("Neman", newMedicine);
            System.out.println(addMedicineResult);

            // Обновление цены медикамента
            String updateMedicineResult = pharmacy1.updateMedicinePrice("Analgin", 70);
            System.out.println(updateMedicineResult);

            // Удаление медикамента по имени
            String deleteMedicineResult = pharmacy1.deleteMedicineByName("Paretstamol");
            System.out.println(deleteMedicineResult);

            // Удаление работника по имени


            // Получение аптеки по имени работника
            System.out.println(db.getPharmacyByWowkersName("JoBaidon"));
            //     if (pharmacyByWorker != null) {

         //   } else {
          //      System.out.println("Worker not found.");
          //  }
            String deleteWorkerResult = pharmacy1.deleteWorkerByName("Papa Rimski");
            System.out.println(deleteWorkerResult);
        }
    }
}
