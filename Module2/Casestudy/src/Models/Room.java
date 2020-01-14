package Models;

public class Room extends Services {
    private String freeService;

    public Room() {
        this.freeService = freeService;
    }

    public Room(String id, String name, float areaUsed, float rentalCosts,
                int amountOfPeople, String typeOfRent, String freeService) {
        super(id, name, areaUsed, rentalCosts, amountOfPeople, typeOfRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public void showInfor() {
        System.out.println("Tên dịch vụ: " + this.getName()+
                "\nDiện tích sử dụng: " + this.getAreaUsed()+
                "\nChi phí thuê: " + this.getRentalCosts()+
                "\nSố lượng người tối đa: " + this.getAmountOfPeople()+
                "\nKiểu thuê: " + this.getTypeOfRent()+
                "\nDịch vụ miễn phí đi kèm: " + this.getFreeService()+"-----------------------");
    }
}
