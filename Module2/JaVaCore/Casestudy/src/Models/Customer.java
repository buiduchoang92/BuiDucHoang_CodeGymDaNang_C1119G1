package Models;

public class Customer {
    private String customerName;
    private String dateOfBirth;
    private String id;
    private int phoneNumber;
    private String email;
    private String customerType;
    private String address;
    private int yearold;

    public Customer( String id,String customerName, String dateOfBirth, int phoneNumber, String email, String customerType, String address) {
        this.id = id;
        this.customerName = customerName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;

    }

    public Customer() {

    }



    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearold() {
         String temp = dateOfBirth.substring(dateOfBirth.length()-4);
        return Integer.parseInt(temp);
    }

    public void showInfor(){
        System.out.println("Tên khach hàng: " + this.getCustomerName()+
                //"\nGioi tinh: " + this.getGender() +
                "\nNgày sinh: " + this.getDateOfBirth() +
                "\nSố chứng minh: " + this.getId() +
                "\nSố điện thoại: " + this.getPhoneNumber() +
                "\nEmail: " + this.getEmail() +
                "\nLoại khách hàng: " + this.getCustomerType()+
                "\nĐịa chỉ: " + this.getAddress()+
                "\n------------------");
    }
}
