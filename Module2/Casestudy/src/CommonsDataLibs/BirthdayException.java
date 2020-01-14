package CommonsDataLibs;

public class BirthdayException extends Exception{
    public BirthdayException(String message) {
        super(message);
    }
    public static void checkBirthday(String birthday)throws BirthdayException{
        String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
        if (!birthday.matches(regex)){
            throw new BirthdayException("nhap theo dinh dang XX/YY/ZZZZ") ;
        }else {
            System.out.println("xac nhan Birthday");
        }
    }
}
