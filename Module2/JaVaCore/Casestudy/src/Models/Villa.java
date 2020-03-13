package Models;

public class Villa extends Services{
    private String roomStandard;
    private String description;
    private double poolArea;
    private int numberOfFloolrs;

    public Villa() {
    }

    public Villa(String id, String name, float areaUsed, float rentalCosts,
                 int amountOfPeople, String typeOfRent, String roomStandard,
                 String desciption, double poolArea, int numberOfFloolrs) {
        super(id, name, areaUsed, rentalCosts, amountOfPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.description = desciption;
        this.poolArea = poolArea;
        this.numberOfFloolrs = numberOfFloolrs;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDesciption() {
        return description;
    }

    public void setDesciption(String desciption) {
        this.description = desciption;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloolrs() {
        return numberOfFloolrs;
    }

    public void setNumberOfFloolrs(int numberOfFloolrs) {
        this.numberOfFloolrs = numberOfFloolrs;
    }

    @Override
    public void showInfor() {
        System.out.println("Tên dịch vụ: " + this.getName()+
                "\nDiện tích sử dụng: " + this.getAreaUsed()+
                "\nChi phí thuê: " + this.getRentalCosts()+
                "\nSố lượng người tối đa: " + this.getAmountOfPeople()+
                "\nKiểu thuê: " + this.getTypeOfRent()+
                "\nTiêu chuẩn phòng: " + this.getRoomStandard()+
                "\nMô tả tiện nghi khác: " + this.getDesciption()+
                "\nDien tích hồ bơi: " + this.getPoolArea() +
                "\n Số tầng: " + this.getNumberOfFloolrs()+"\n-------------------------");
    }
}
