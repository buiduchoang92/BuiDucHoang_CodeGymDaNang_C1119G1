package CommonsDataLibs;

public class NameException extends Exception{
    public NameException(String message) {
        super(message);
    }
    public static void checkName(String name)throws NameException{
        final String regex = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,}))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
        if (!name.matches(regex)){
            throw new NameException("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
        }else {
            System.out.println("ten hop le.");
        }
    }
}
