package Models;

public abstract class Services {
    private String id;
    private String nameServies;
    private float areaUsed;
    private float rentalCosts;
    private int amountOfPeople;
    private String typeOfRent;

    public Services() {
    }

    public Services(String id, String name, float areaUsed, float rentalCosts, int amountOfPeople, String typeOfRent) {
        this.id = id;
        this.nameServies = name;
        this.areaUsed = areaUsed;
        this.rentalCosts = rentalCosts;
        this.amountOfPeople = amountOfPeople;
        this.typeOfRent = typeOfRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return nameServies;
    }

    public void setName(String name) {
        this.nameServies = name;
    }

    public float getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(float areaUsed) {
        this.areaUsed = areaUsed;
    }

    public float getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(float rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public abstract void showInfor();
}
