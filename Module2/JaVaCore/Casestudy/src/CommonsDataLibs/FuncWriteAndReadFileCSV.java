package CommonsDataLibs;

import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;

import java.io.*;
import java.util.List;

public class FuncWriteAndReadFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static void writeCoustomerToFileCSV(String pathCustomer, List<Customer> customerList){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(pathCustomer);

            for (Customer customer: customerList){
                fileWriter.append(customer.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getCustomerName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getDateOfBirth());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getPhoneNumber()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getCustomerType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully!!!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in CsvFileWriter !!!");
        }finally {
            try{
                fileWriter.flush();
                fileWriter.close();
            }catch (IOException e){
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
    public static void writeVillaToFileCSV(String pathVilla, List<Villa> villaLis){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(pathVilla);
            for (Villa villa: villaLis) {
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAmountOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getTypeOfRent()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getDesciption());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getPoolArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberOfFloolrs()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully!!!");
        }catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        }finally {
            try{
                fileWriter.flush();
                fileWriter.close();
            }catch (IOException e){
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
    public static void writeHoseToFileCSV(String pathHose, List<House> houseList){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(pathHose);
            for (House house:houseList) {
                fileWriter.append(house.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getAmountOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getTypeOfRent()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getNumberOfFloolrs()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Tep CSV da tao thang cong");
        }catch (Exception e) {
            System.out.println("Loi trong CSV FileWriter!!");
            e.printStackTrace();
        }finally {
            try{
                fileWriter.flush();
                fileWriter.close();
            }catch (IOException e){
                System.out.println("Loi trong khi Xa Dong fileWriter!!");
                e.printStackTrace();
            }
        }
    }
    public static void writeRoomToFileCSV(String pathRoom, List<Room> roomList){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(pathRoom);
            for (Room room: roomList) {
                fileWriter.append(room.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getAmountOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getTypeOfRent()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getFreeService());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Tep CSV da tao thang cong");
        } catch (Exception e) {
            System.out.println("Loi trong CSV FileWriter!!");
            e.printStackTrace();
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }catch (IOException e){
                System.out.println("Loi trong khi Xa Dong fileWriter!!");
                e.printStackTrace();
            }
        }
    }
    public static Customer readerCustomerToFileCSV(String csvLine){
        Customer customer = new Customer();
        if (csvLine!=null){
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            customer.setId((splitData[0]));
            customer.setCustomerName(splitData[1]);
            customer.setDateOfBirth((splitData[2]));
            customer.setPhoneNumber(Integer.parseInt(splitData[3]));
            customer.setEmail(splitData[4]);
            customer.setCustomerType(splitData[5]);
            customer.setAddress(splitData[6]);
        }
        return customer;
    }
    public static Villa readerVillaToFileCSV(String csvLine) throws IOException {
        Villa villa = new Villa();
        if (csvLine!=null){
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            villa.setId(splitData[0]);
            villa.setName(splitData[1]);
            villa.setAreaUsed((float) Float.parseFloat(splitData[2]));
            villa.setRentalCosts((float) Float.parseFloat(splitData[3]));
            villa.setAmountOfPeople((int) Integer.parseInt(splitData[4]));
            villa.setTypeOfRent(splitData[5]);
            villa.setRoomStandard(splitData[6]);
            villa.setDesciption(splitData[7]);
            villa.setPoolArea((double) Double.parseDouble(splitData[8]));
            villa.setNumberOfFloolrs((int) Integer.parseInt(splitData[9]));
        }
        return villa;
    }
    public static Room readerRoomToFileCSV(String pathRoom){
        Room room = new Room();
        if (pathRoom!=null){
            String[] strings = pathRoom.split(COMMA_DELIMITER);
            room.setId(strings[0]);
            room.setName(strings[1]);
            room.setAreaUsed((float) Float.parseFloat(strings[2]));
            room.setRentalCosts((float) Float.parseFloat(strings[3]));
            room.setAmountOfPeople((int) Integer.parseInt(strings[4]));
            room.setTypeOfRent(strings[5]);
            room.setFreeService(strings[6]);
        }
        return room;
    }
    public static House readerHouseToFileCSV(String pathRoom){
        House house = new House();
        if (pathRoom!=null){
            String[] strings = pathRoom.split(COMMA_DELIMITER);
            house.setId(strings[0]);
            house.setName(strings[1]);
            house.setAreaUsed((float) Float.parseFloat(strings[2]));
            house.setRentalCosts((float) Float.parseFloat(strings[3]));
            house.setAmountOfPeople((int) Integer.parseInt(strings[4]));
            house.setTypeOfRent(strings[5]);
            house.setRoomStandard(strings[6]);
            house.setDescription(strings[7]);
            house.setNumberOfFloolrs((int) Integer.parseInt(strings[8]));
        }
        return house;
    }
}
