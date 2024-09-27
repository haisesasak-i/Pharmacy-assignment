import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PharmacyShop pharma = new PharmacyShop();

        System.out.println("<------------PharmacyShop------->");
        System.out.println("Enter 1 to add medicine\nEnter 2 to update existing medicine\nEnter 3 to delete existing medicine\nEnter 4 to sell a medicine\nEnter 5 to display all medicines\nEnter 6 to search medicine by id or name\nEnter 7 to print total revenue from sales\nEnter 8 to identify and list expired medicine\nEnter 9 to quit");

        int choice = scan.nextInt();
        switch (choice) {
            case 1:{

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
                pharma.addMedicine(medicine);
                break;
            }
            case 2:{
                System.out.println("Enter the name of medicine which you like to update");
                String name = scan.nextLine();
                pharma.UpdateMedicine(name);
                break;
            }
            case 3:{
                System.out.println("Enter the id:");
                String id = scan.nextLine();
                    pharma.removeMedicine(id);
                    break;
            }
            case 4:{
                System.out.println("Enter the id:");
                String id = scan.nextLine();
                System.out.println("Enter quantity:");
                int quantity = scan.nextInt();
                pharma.sellMedicine(id,quantity);
                break;
            }
            case 5:{
                    pharma.displayMedicines();
                    break;
            }
            case 6:{
                System.out.println("Would you like to search medicine by name or id \nEnter 1 for id or 2 for ");
                int userChoice = scan.nextInt();
                if (userChoice == 1) {
                    System.out.println("Enter the name of medicine which you like to search");
                    pharma.SearchMedicineByName(scan.nextLine());
                }
                else {
                    System.out.println("Enter the id of medicine which you like to search");
                    pharma.SearchMedicineById(scan.nextLine());
                }
                break;
            }
            case 7:{
                    pharma.printTotalRevenue();

            }
            case 8:{
                System.out.println("Enter year:");
                int year = scan.nextInt();
                System.out.println("Enter month");
                int month = scan.nextInt();
                System.out.println("Enter day");
                int day = scan.nextInt();
                Date expireDate = new Date(year, month, day);
                pharma.findExpiredMedicine(expireDate);
            }
            case 9:{
                System.out.println("Thanks for coming into our shop");
                return;
            }
            default:{
                System.out.println("Invaid input");
            }
        }
    }
}

