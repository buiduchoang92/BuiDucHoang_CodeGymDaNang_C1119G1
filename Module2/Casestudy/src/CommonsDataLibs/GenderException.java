package CommonsDataLibs;

public class GenderException extends Exception{
    public GenderException(String message) {
        super(message);
    }
    public static void checkGender(String gender) throws GenderException {
        String regex = "^male$|^female$|^unknow$";
        if (!gender.matches(regex)){
            throw new GenderException("Gender nhap sai");
        }else {
            System.out.println("xac nhan Gender");
        }
    }
}
