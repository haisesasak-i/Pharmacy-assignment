public class Medicine {
    //attributes
    private String medicineId;
    private String name;
    private double price;
    private int quantity;
    private String manufacturer;
    private String batchNumber;
    private Date expiryDate;
    //constructor
    public Medicine(String medicineId, String name, double price, int quantity, String manufacturer, String batchNumber, Date expiryDate) {
        this.medicineId = medicineId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.batchNumber = batchNumber;
        this.expiryDate = expiryDate;
    }
    //getters
    public String getMedicineId() {
        return medicineId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }
    //setters
    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    public void displayInformation() {
        System.out.println("The details of the medicine are: ");
        System.out.print("Medicine ID: " + medicineId+"\n"+"Medicine Name: " + this.name+"\n"+"Medicine price: Rs." + this.price+"\n"+"Medicine quantity: " +this.quantity+"\n"+"Medicine manufacturer : " + this.manufacturer+"\n"+"Medicine batchNumber: " + this.batchNumber+"\n"+"Medicine expiry: ");
        this.expiryDate.displayDate();
    }
}
