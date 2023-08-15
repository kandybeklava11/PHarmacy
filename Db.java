import java.util.Arrays;

public class Db {
    private Pharmacy[] pharmacies;

    public Db(Pharmacy[] pharmacies) {
        this.pharmacies = pharmacies;
    }

    public Pharmacy[] getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(Pharmacy[] pharmacies) {
        this.pharmacies = pharmacies;
    }

    Medicine[] getAllMabicineByPharmasyName(String pharmacyName) {
        for (Pharmacy p : pharmacies) {
            if (p.getName().equalsIgnoreCase(pharmacyName)) {
                return p.getMadicines();
            }
        }
        return null;
    }


    Worker[]getAllSortedByPharmacyAdress(String address){
        for (Pharmacy pharmacy : pharmacies) {
            if (pharmacy.getAdress().equalsIgnoreCase(address)) {
                Worker[] sortedWorkers = pharmacy.getWorkers();
                Arrays.sort(sortedWorkers, (w1, w2) -> w1.getName().compareToIgnoreCase(w2.getName()));
                return sortedWorkers;
            }
        }
        return null;
    }
    String addMadicineToPharmacy(String pharmacyName,Medicine madicine){
        for (Pharmacy pharmacy : pharmacies) {
            if (pharmacy.getName().equalsIgnoreCase(pharmacyName)) {
                Medicine[] newMedicines = Arrays.copyOf(pharmacy.getMadicines(), pharmacy.getMadicines().length + 1);
                newMedicines[pharmacy.getMadicines().length] = madicine;
                pharmacy.setMadicines(newMedicines);
                return "Medicine added successfully.";
            }
        }
        return "Pharmacy not found.";
    }


    Pharmacy getPharmacyByWowkersName(String workersName){
        for (Pharmacy pharmacy : pharmacies) {
            for (Worker worker : pharmacy.getWorkers()) {
                if (worker.getName().equalsIgnoreCase(workersName)) {
                    return pharmacy;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Db{" +
                "pharmacies=" + Arrays.toString(pharmacies) +
                '}';
    }
}
