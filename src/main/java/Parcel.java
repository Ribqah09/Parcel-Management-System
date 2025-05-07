package smartparcelmanagement;

public class Parcel {
    private String id;
    private String senderName;
    private String senderContactNumber;
    private String senderAddress;
    private String senderEmail;
    private String receiverName;
    private String receiverContactNumber;
    private String receiverAddress;
    private String receiverEmail;
    private double weight;
    private int priority; 
    private String city;

    private String status;
    private double price;

    public Parcel(String id, String senderName, String senderContact, String senderAddress, String senderEmail,
                  String receiverName, String receiverContact, String receiverAddress, String receiverEmail,
                  double weight, int priorityValue, String city) {
        this.id = id;
        this.senderName = senderName;
        this.senderContactNumber = senderContact;
        this.senderAddress = senderAddress;
        this.senderEmail = senderEmail;
        this.weight = weight;
        this.priority = priorityValue;
        this.receiverName = receiverName;
        this.receiverContactNumber = receiverContact;
        this.receiverAddress = receiverAddress;
        this.receiverEmail = receiverEmail;
        this.city = city;

        this.status = "Pending";
        this.price = calculatePrice();
    }

    public String getId() {
        return id;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getSenderContact() {
        return senderContactNumber;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getReceiverContact() {
        return receiverContactNumber;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public double getWeight() {
        return weight;
    }

    public int getPriority() {
        return priority;
    }

    public String getCity() {
        return city;
    }

    public double calculatePrice() {
        double basePrice;
        switch (this.city.toLowerCase()) {
            case "karachi":
                basePrice = 100;
                break;
            case "hyderabad":
                basePrice = 200;
                break;
            case "sukkur":
                basePrice = 300;
                break;
            case "lahore":
                basePrice = 500;
                break;
            case "islamabad":
                basePrice = 600;
                break;
            case "multan":
                basePrice = 500;
                break;
            case "peshawar":
                basePrice = 550;
                break;
            case "quetta":
                basePrice = 600;
                break;
            default:
                basePrice = 150;
        }
        
        if (this.weight <= 1) {
            basePrice += 50;
        } 
        else if (this.weight <= 5) {
            basePrice += 100;
        } 
        else {
            basePrice += 150;
        }

        switch (this.priority) {
            case 1: 
                basePrice += 250;
                break;
            case 2: 
                basePrice += 200;
                break;
            case 3: 
                basePrice += 150;
                break;
            default:
                break;
        }

        return basePrice;
    }
}
