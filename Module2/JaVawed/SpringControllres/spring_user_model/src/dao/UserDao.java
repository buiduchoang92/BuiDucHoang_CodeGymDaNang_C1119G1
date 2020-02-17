package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User user1 = new User();
        user1.setAccount("duchoang");
        user1.setPassword("12345");
        user1.setAge(10);
        user1.setEmail("hoang92duc@gmail.com");
        user1.setName("Hoang");
        users.add(user1);

        User user2 = new User();
        user1.setAccount("duyvu");
        user1.setPassword("12345");
        user1.setAge(11);
        user1.setEmail("duy91vu@gmail.com");
        user1.setName("Vu");
        users.add(user2);

        User user3 = new User();
        user1.setAccount("dinhquoc");
        user1.setPassword("12345");
        user1.setAge(9);
        user1.setEmail("dinhquoc93@gmail.com");
        user1.setName("Quoc");
        users.add(user2);
    }
    public static User checkLogin(Login login){
        for (User u : users) {
            if (u.getAccount().equalsIgnoreCase(login.getAccount())&&u.getPassword().equalsIgnoreCase(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
