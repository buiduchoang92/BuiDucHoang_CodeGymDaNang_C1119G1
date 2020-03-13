package CommonsDataLibs;

public class IdCardException extends Exception{
    public IdCardException(String message) {
        super(message);
    }
    public static void checkId(String id)throws IdCardException{
        String regex = "^[0-9]{9}$";
        if (!id.matches(regex)){
            throw new IdCardException("Id phai co 9 so.");
        }else {
            System.out.println("Id hop le.");
        }
    }
}
