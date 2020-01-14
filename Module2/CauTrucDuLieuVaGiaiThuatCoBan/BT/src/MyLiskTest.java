
public class MyLiskTest {
    public static class Interger {

    public static void main(String[] args) {
        MyLisk<Interger> intergerMyLisk = new MyLisk<Interger>();
        intergerMyLisk.add(1242);
        intergerMyLisk.add(222);
        intergerMyLisk.add(3333);
        intergerMyLisk.add(4444);
        intergerMyLisk.add(5555);
        intergerMyLisk.add(666);
        intergerMyLisk.add(777);

        System.out.println("element: "+ intergerMyLisk.getElements(1));
        System.out.println("element: " + intergerMyLisk.getElements(2));
        System.out.println("element: " + intergerMyLisk.getElements(3));
        System.out.println("element: " + intergerMyLisk.getElements(4));
        System.out.println("element: " + intergerMyLisk.getElements(5));
        System.out.println("element: " + intergerMyLisk.getElements(6));
        System.out.println("element: " + intergerMyLisk.getElements(0));
    }
    }
}
