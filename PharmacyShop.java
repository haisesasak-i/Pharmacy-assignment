
import java.util.Scanner;
public class PharmacyShop {
    private Address address;
    private int medicineCount = 2;
    private Medicine[] medicines = new Medicine[medicineCount];
    private Person owner;
    private double totalRevenue = 0.0;

    public PharmacyShop() {
    }

    {
        this.medicines[0] =  new Medicine("M001", "B123", 202, 12, "ABc", "Paracetamol",new Date(15, 8, 2025));
        medicines[1] = new Medicine("M002", "B124", 2002,12 , "DEf", "Ibuprofen",new Date(10, 12, 2024));
    }

    public PharmacyShop(Address address, int medicineCount, Person owner) {
        this.address = address;
        this.medicines = medicines;
        this.medicineCount = medicineCount;
        this.owner = owner;
    }


    public String SearchMedicineById(String id){
        for (int i = 0; i < medicines.length; i++) {
                   if (medicines[i].getMedicineId().equals(id)) {
                       System.out.println("The medicine with id " + id + " is found");
                       return id;
                   }

        }
        System.out.println("The medicine with id " + id + " is not found");
        return "-1";


    }
    public int SearchMedicineByName(String name){
        for (int i = 0; i < medicines.length; i++) {
            if (medicines[i].getName().equals(name)) {
                System.out.println("The medicine with name " + name + " is found on index ");
                return i;
            }

        }

        System.out.println("The medicine with name " + name + " is not found");
        return -1;

    }
    public void printTotalRevenue(){
        double price=0.0;
        for (int i = 0; i < medicines.length; i++) {
           price = price +medicines[i].getPrice();
        }
        System.out.println("The total revenue of medicines in pharmacy shop is Rs."+price);

    }
    public  void displayMedicines(){
            for (int i = 0; i < medicines.length; i++) {
                System.out.println(medicines[i]);
                System.out.println("");
            }

    }
    public void addMedicine(Medicine medicine){
        if (medicines.length==medicineCount){
            System.out.println("Cannot add more medicines");
            return;

        }
        if(medicines.length==0){
            medicines[0]=medicine;
            return;
        }
        medicines[medicines.length]=medicine;


    }
    public void UpdateMedicine(String name){
        int foundId =this.SearchMedicineByName(name);
        if(foundId==-1){
            System.out.println("The medicine with name " + name + " is not found");
            return;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  new medicine id:");
        String medicineId = scan.nextLine();
        System.out.println("Enter the  new medicine name:");
        String medicineName = scan.nextLine();
        System.out.println("Enter the  new price:");
        double price = scan.nextDouble();
        System.out.println("Enter the  new medicine quantity:");
        int quantity = scan.nextInt();
        System.out.println("Enter the manufacturer:");
        String manufacturer = scan.nextLine();
        System.out.println("Enter the  new medicine id:");
        String batchNumber = scan.nextLine();
        System.out.println("Enter the year:");
        int year = scan.nextInt();
        System.out.println("Enter the month:");
        int month = scan.nextInt();
        System.out.println("Enter the day:");
        int day = scan.nextInt();
        Date expireDate = new Date(year, month, day);
        Medicine medicine = new Medicine(medicineId,medicineName,price,quantity,manufacturer,batchNumber,expireDate);
        this.medicines[foundId] = medicine;

    }
    public void removeMedicine(String id) {
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i].getMedicineId().equals(id)) {
                System.out.println("Removing Medicine: " + medicines[i].getName());
                medicines[i] = medicines[medicineCount - 1];
                medicines[medicineCount - 1] = null;
                medicineCount--;
                return;
            }
        }
        System.out.println("Medicine not found!");
    }

    public void sellMedicine(String medicineId, int quantity) {
        double totalRevenue=0.0;
        for (Medicine medicine : medicines) {
            if (medicine != null && medicine.getMedicineId().equals(medicineId)) {
                if (medicine.getQuantity() >= quantity) {
                    medicine.setQuantity(medicine.getQuantity() - quantity);
                    totalRevenue += quantity * medicine.getPrice();
                    System.out.println("Sold " + quantity + " units of " + medicine.getName());
                    return;
                } else {
                    System.out.println("Not enough stock available!");
                    return;
                }
            }
        }
        System.out.println("Medicine not found!");
    }
    public void findExpiredMedicine(Date date){
        int count =0;
        System.out.println("The expired medicines are:");
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i].getExpiryDate().equals(date)) {
                count++;
                medicines[i].displayInformation();
            }

        }
        System.out.println("Total "+count+" medicines are expired");
    }



}
