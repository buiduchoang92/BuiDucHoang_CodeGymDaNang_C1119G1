package Models;

public class House extends Services {
    private String description;
    private String roomStandard;
    private int numberOfFloolrs;

    public House() {
    }

    public House(String id, String name, float areaUsed, float rentalCosts, int amountOfPeople, String typeOfRent, String roomStandard, String desciption, int numberOfFloolrs) {
        super(id, name, areaUsed, rentalCosts, amountOfPeople, typeOfRent);
        this.description = desciption;
        this.roomStandard = roomStandard;
        this.numberOfFloolrs = numberOfFloolrs;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
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
                "\nMô tả tiện nghi khác: " + this.getDescription()+
                "\nSố tầng: " + this.getNumberOfFloolrs()+
                "\n-------------------");
    }
}
