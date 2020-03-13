package Controllers;

import CommonsDataLibs.*;
import Models.*;
import areaUsed.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MainController {
    List<Villa> villaList = new ArrayList<>();
    List<House> houseList = new ArrayList<>();
    List<Room> roomList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() throws IOException {
        luuFile();
        boolean stop = true;
        do {
            System.out.println("1. Add New Services" +
                    "\n2. Show Services" +
                    "\n3. Add New Customer" +
                    "\n4. Show Information Customer" +
                    "\n5. Add New Booking Resort " +
                    "\n6. Show Information Employee " +
                    "\n7. Exit");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInmationCustomer();
                    break;
                case 5:
                    addNewBookingResort();
                    break;
                case 6:
                    showInmationEmployee();
                    break;
                case 7:
                    stop = false;
                    break;
                default:
                    System.out.println("nhap sai");
            }
        } while (stop);
    }

    public void addNewServices() throws IOException {
        boolean stop = true;
        do {
            System.out.println("\n-------------");
            System.out.println("\n1. Add New Villa" +
                    "\n2. Add New House" +
                    "\n3. Add New Room" +
                    "\n4. Back to menu" +
                    "\n5. Exit"
                    + "\nEnter choose number ?");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    stop = false;
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("nhap sai");
            }
        } while (stop);
    }

    private void showServices() throws IOException {
        System.out.println("1. Show All Villa" + "\n2. Show All House" + "\n3. Show All Room" + "\n4. Back to menu" + "\n5. Exit");
        boolean stop = true;
        do {
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    stop = false;
                    break;
                case 5:
                    System.exit(0);
                    break;
                case 6:
                default:
                    System.out.println("nhap sai");
            }
        } while (stop);
    }

    private void showAllVilla() throws IOException {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("src/Data/Villa.csv"));
            villaList.clear();
            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                villaList.add(FuncWriteAndReadFileCSV.readerVillaToFileCSV(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        for (Villa villa : villaList) {
            villa.showInfor();
        }
    }

    private void showAllRoom() throws IOException {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("src/Data/Villa.csv"));
            roomList.clear();
            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                roomList.add(FuncWriteAndReadFileCSV.readerRoomToFileCSV(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        for (Room room : roomList) {
            room.showInfor();
        }
    }

    private void showAllHouse() throws IOException {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("src/Data/Villa.csv"));
            houseList.clear();
            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                houseList.add(FuncWriteAndReadFileCSV.readerHouseToFileCSV(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        for (House house : houseList) {
            house.showInfor();
        }
    }

    private void addNewVilla() throws IOException {
        String id = UUID.randomUUID().toString().replace("-", "");
        System.out.println("nhap ten");
        String name = scanner.next();
        while (!checkNameServices(name)) {
            System.out.println("nhap sai ten,hay nhap 1 lan nua");
            System.out.println("Nhap ten Sevices: ");
            name = scanner.next();
        }
        System.out.println("dien tich su dung la fload");
        float areaUsed;
        do {
            System.out.println("lon hon 30: ");
            areaUsed = checkVaildNumberFloat();
        }
        while (areaUsed <= 30);
        System.out.println("chi phi thue la fload");
        float rentalCosts;
        do {
            System.out.println("lon hon 0");
            rentalCosts = checkVaildNumberFloat();
        }
        while (rentalCosts < 0);
        System.out.println("so nguoi toi da la Interger");
        int amountOfPeople;
        do {
            System.out.println(" lon hon 0 be hon 20");
            amountOfPeople = checkVaildNumberInterger();
        } while (amountOfPeople < 0 || amountOfPeople > 20);
        System.out.println("nhap kieu thue: ");
        String typeOfRent = scanner.next();
        System.out.println("nhap tieu chuan phong ");
        String roomStandard = scanner.next();
        System.out.println("mo ta tien nghi: ");
        String desciption = scanner.next();
        System.out.println("Dien tich ho boi: ");
        double poolArea;
        do {
            poolArea = checkVaildNumberdouble();
        } while (poolArea < 0);
        System.out.println("nhap So Tang: ");
        int numberOfFloolrs;
        do {
            System.out.println("lon hon 0");
            numberOfFloolrs = checkVaildNumberInterger();
        } while (numberOfFloolrs < 0);
        Villa villa = new Villa(id, name, areaUsed, rentalCosts, amountOfPeople, typeOfRent, roomStandard,
                desciption, poolArea, numberOfFloolrs);
        villaList.add(villa);
        String pathVilla = "src/Data/Villa.csv";
        FuncWriteAndReadFileCSV.writeVillaToFileCSV(pathVilla, villaList);
    }

    private void addNewHouse() throws IOException {
        String id = UUID.randomUUID().toString().replace("-", "");
        System.out.println("nhap ten");
        String name = scanner.next();
        while (!checkNameServices(name)) {
            System.out.println("nhap sai ten,hay nhap 1 lan nua");
            System.out.println("Nhap ten Sevices: ");
            name = scanner.next();
        }
        System.out.println("dien tich su dung la fload ");
        float areaUsed;
        do {
            System.out.println("lon hon 30");
            areaUsed = checkVaildNumberFloat();
        }
        while (areaUsed <= 30);
        System.out.println("chi phi thue la fload");
        float rentalCosts;
        do {
            System.out.println("lon hon 0");
            rentalCosts = checkVaildNumberFloat();
        }
        while (rentalCosts < 0);
        System.out.println("so nguoi toi da la Interger ");
        int amountOfPeople;
        do {
            System.out.println("lon hon 0 be hon 20");
            amountOfPeople = checkVaildNumberInterger();
        } while (amountOfPeople < 0 || amountOfPeople > 20);
        System.out.println("nhap kieu thue: ");
        String typeOfRent = scanner.next();
        System.out.println("nhap tieu chuan phong: ");
        String roomStandard = scanner.next();
        System.out.println("mo ta tien nghi: ");
        String desciption = scanner.next();
        System.out.println("nhap So Tang: ");
        int numberOfFloolrs;
        do {
            System.out.println("lon hon 0");
            numberOfFloolrs = checkVaildNumberInterger();
        } while (numberOfFloolrs < 0);
        House house = new House(id, name, areaUsed, rentalCosts, amountOfPeople, typeOfRent, roomStandard, desciption, numberOfFloolrs);
        houseList.add(house);
        String pathHouse = "src/Data/House.csv";
        FuncWriteAndReadFileCSV.writeHoseToFileCSV(pathHouse, houseList);
    }

    private void addNewRoom() throws IOException {
        String id = UUID.randomUUID().toString().replace("-", "");
        System.out.println("nhap ten");
        String name = scanner.next();
        while (!checkNameServices(name)) {
            System.out.println("nhap sai ten,hay nhap 1 lan nua");
            System.out.println("Nhap ten Sevices: ");
            name = scanner.next();
        }
        System.out.println("dien tich su dung la fload");
        float areaUsed;
        do {
            System.out.println("lon hon 30");
            areaUsed = checkVaildNumberFloat();
        }
        while (areaUsed <= 30);
        System.out.println("chi phi thue la fload");
        float rentalCosts;
        do {
            System.out.println("lon hon 0");
            rentalCosts = checkVaildNumberFloat();
        }
        while (rentalCosts < 0);
        System.out.println("so nguoi toi da la Interger ");
        int amountOfPeople;
        do {
            System.out.println("lon hon 0 be hon 20");
            amountOfPeople = checkVaildNumberInterger();
        } while (amountOfPeople < 0 || amountOfPeople > 20);
        System.out.println("nhap kieu thue: ");
        String typeOfRent = scanner.next();
        System.out.println("nhap dich vu di kem:");
        String freeSirvices = scanner.next();
        Room room = new Room(id, name, areaUsed, rentalCosts, amountOfPeople, typeOfRent, freeSirvices);
        roomList.add(room);
        String pathRoom = "src/Data/Room.csv";
        FuncWriteAndReadFileCSV.writeRoomToFileCSV(pathRoom, roomList);
    }

    List<Customer> customerList = new ArrayList<>();

    private void addNewCustomer() throws IOException {
        boolean stop = true;
        String id;
        do {
            System.out.println("nhap id:");
            id = scanner.next();
            try {
                IdCardException.checkId(id);
                stop = false;
            } catch (IdCardException ex) {
                System.out.println(ex.getMessage());
            }
        } while (stop);
        stop = true;
        String name;
        do {
            System.out.println("nhap ten: ");
            name = scanner.next();
            try {
                NameException.checkName(name);
                stop = false;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        } while (stop);
        stop = true;
        String dayOfBirth;
        do {
            System.out.println("nhap ngay sinh: ");
            dayOfBirth = scanner.next();
            try {
                BirthdayException.checkBirthday(dayOfBirth);
                stop = false;
            } catch (BirthdayException ex) {
                System.out.println(ex.getMessage());
            }
        } while (stop);

        System.out.println("so dien thoai");
        int phoneNumber = scanner.nextInt();
        stop = true;
        String email;
        do {
            System.out.println("dia chi email");
            email = scanner.next();
            try {
                EmailException.checkEmail(email);
                stop = false;
            } catch (EmailException ex) {
                System.out.println(ex.getMessage());
            }
        } while (stop);

        System.out.println("Loai khach hang");
        String customerType = scanner.next();
        System.out.println("Dia chi khach hang");
        String address = scanner.next();
        Customer customer = new Customer(id, name, dayOfBirth, phoneNumber, email, customerType, address);
        customerList.add(customer);
        String pathCustomer = "src/Data/Customer.csv";
        FuncWriteAndReadFileCSV.writeCoustomerToFileCSV(pathCustomer, customerList);
    }

    private void addNewBookingResort() throws IOException {
//        ArrayList<Customer> customerArrayList = FuncWriteAndReadFileCSV
    }

    private void luuFile() {
        //luuFileVilla
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("src/Data/Villa.csv"));
            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                villaList.add(FuncWriteAndReadFileCSV.readerVillaToFileCSV(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        //luuFile House
        try {
            String line;
            br = new BufferedReader(new FileReader("src/Data/House.csv"));

            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                houseList.add(FuncWriteAndReadFileCSV.readerHouseToFileCSV(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        //luufile Room
        try {
            String line;
            br = new BufferedReader(new FileReader("src/Data/Room.csv"));

            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                roomList.add(FuncWriteAndReadFileCSV.readerRoomToFileCSV(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        //luu file Customer
        try {
            String line;
            br = new BufferedReader(new FileReader("src/Data/Customer.csv"));
            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                customerList.add(FuncWriteAndReadFileCSV.readerCustomerToFileCSV(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    private void showInmationCustomer() throws IOException {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("src/Data/Customer.csv"));
            customerList.clear();
            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                customerList.add(FuncWriteAndReadFileCSV.readerCustomerToFileCSV(line));
            }
            System.out.println("doc file thanh cong");
        } catch (IOException e) {
            System.out.println("bat loi khi doc");
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        Collections.sort(customerList, new CustomerComparator());
        for (Customer customer : customerList) {
            customer.showInfor();
        }

    }

    private String regex = "";
    private Scanner sc;

    public boolean checkNameServices(String str) {
        regex = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,}))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
        return str.matches(regex);
    }

    public float checkVaildNumberFloat() {
        boolean chose = true;
        while (chose) {
            try {
                sc = new Scanner(System.in);
                chose = false;
            } catch (Exception ex) {
                System.out.println("Nhap sai kieu du lieu");
                ex.printStackTrace();
            }
        }
        return sc.nextFloat();
    }

    public int checkVaildNumberInterger() {
        boolean chose = true;
        while (chose) {
            try {
                sc = new Scanner(System.in);
                chose = false;
            } catch (Exception ex) {
                System.out.println("nhap sai kieu du lieu");
            }
        }
        return sc.nextInt();
    }

    public double checkVaildNumberdouble() {
        boolean chose = true;
        while (chose) {
            try {
                sc = new Scanner(System.in);
                System.out.println("nhap kieu Double");
                chose = false;
                return sc.nextDouble();
            } catch (Exception ex) {
                System.out.println("nhap sai kieu du lieu");
            }
        }
        return sc.nextInt();
    }

    private void showInmationEmployee() {
        Employee.DanhSach();
        Map map = Employee.map;
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(map.get(key));
        }
        Queue<Employee> emplemens = Employee.emplemens;
        while (true) {
            Employee emplemen = emplemens.poll();
            if (emplemen == null) {
                break;
            }
            System.out.println(emplemen);
        }
        Stack<Employee> st = Employee.st;
        System.out.println("st" + st);
        for (Employee e : st) {
            System.out.println(e);
        }
    }
}