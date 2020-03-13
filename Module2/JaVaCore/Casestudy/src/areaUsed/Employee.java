package areaUsed;

import java.util.*;

public class Employee {
    String name;
    int age;
    String address;
    int id;

    public static Stack<Employee> st = new Stack<>();
    public static Queue<Employee> emplemens = new LinkedList<Employee>();
    public static Map map = new HashMap();
    public Employee(String name, int age, String address, int id) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.id = id;
    }
    public static void DanhSach(){
        Employee employee1 = new Employee("Lien", 23, "Da Nang", 001);
        Employee employee2 = new Employee("Qien", 23, "Da Nang", 002);
        Employee employee3 = new Employee("Tien", 23, "Da Nang", 003);
        Employee employee4 = new Employee("Thien", 23, "Da Nang", 004);
        Employee employee5 = new Employee("Hien", 23, "Da Nang", 005);
        st.push(employee1);
        st.push(employee2);
        st.push(employee3);
        st.push(employee4);
        st.push(employee5);
        emplemens.offer(employee1);
        emplemens.offer(employee3);
        emplemens.offer(employee5);
        emplemens.add(employee2);
        emplemens.add(employee4);
        Map map = new HashMap();
        map.put(001, employee1);
        map.put(002, employee2);
        map.put(003, employee3);
        map.put(004, employee4);
        map.put(005, employee5);
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
