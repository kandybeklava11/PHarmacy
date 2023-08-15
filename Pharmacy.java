import java.util.Arrays;

public class Pharmacy {
    private String name;
    private String adress;
    private Medicine[] madicines;
    private Worker[] workers;

    public Pharmacy(String name, String adress, Medicine[] madicines, Worker[] workers) {
        this.name = name;
        this.adress = adress;
        this.madicines = madicines;
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Medicine[] getMadicines() {
        return madicines;
    }

    public void setMadicines(Medicine[] madicines) {
        this.madicines = madicines;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }
    String updateMedicinePrice(String medicineName,int newPrice){
        for (Medicine medicine : madicines) {
            if (medicine.getName().equalsIgnoreCase(medicineName)) {
                medicine.setPrice(newPrice);
                return "Medicine price updated successfully.";
            }
        }
        return "Medicine not found.";
    }

    String deleteMedicineByName(String medicineName){
        for (int i = 0; i < madicines.length-1; i++) {
            if (madicines[i].getName().equalsIgnoreCase(medicineName)) {
                madicines[i] = null;
                return "Medicine deleted successfully.";
            }
        }
        return "Medicine not found.";
    }

    String deleteWorkerByName(String workerName){
        for (int i = 0; i < workers.length-1; i++) {
            if (workers[i].getName().equalsIgnoreCase(workerName)) {
                workers[i] = null;

                return "Worker deleted successfully.";

            }
        }
        return "Worker not found.";
    }


    @Override
    public String toString() {
        return "Pharmacy{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", madicines='" + Arrays.toString(madicines )+ '\'' +
                ", workers='" + Arrays.toString(workers) + '\'' +
                '}';
    }
}
