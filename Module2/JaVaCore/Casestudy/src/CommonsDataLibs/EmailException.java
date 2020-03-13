package CommonsDataLibs;

public class EmailException extends Exception{
    public EmailException(String message) {
        super(message);
    }
    public static void checkEmail(String email)throws EmailException{
        String regex = "^\\w+[a-z0-9]*@{1}\\w+mail.com$";
        if (!email.matches(regex)){
            throw new EmailException("email phai dung dinh danh hoang92duc@gmail.com");
        }else {
            System.out.println("email hop le");
        }
    }
}
