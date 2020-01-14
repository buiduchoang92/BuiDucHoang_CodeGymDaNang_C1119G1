public class MyArrayTest {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

    }

    public static void main(String[] args) {
        Student a = new Student(1, "Huy");
        Student b = new Student(2, "Tuy");
        Student c = new Student(3, "Guy");
        Student d = new Student(4, "Muy");
        Student e = new Student(5, "Buy");
        Student f = new Student(6, "Duy");
        MyArrayLisk<Student> studentMyArrayLisk = new MyArrayLisk<>();
        studentMyArrayLisk.add(a);
        studentMyArrayLisk.add(b);
        studentMyArrayLisk.add(c);
        studentMyArrayLisk.add(d);
        studentMyArrayLisk.add(e);
        studentMyArrayLisk.add(1,f);
//        for (int i = 0; i < studentMyArrayLisk.size(); i++) {
//            System.out.println(studentMyArrayLisk.get(i).getName());
//        }
//        MyArrayLisk<Student> cloneArrayLisk = new MyArrayLisk<>();
////        cloneArrayLisk = studentMyArrayLisk.clone();
////        for (int i = 0;i <studentMyArrayLisk.size();i++){
////            System.out.println(cloneArrayLisk.get(i).getName());
////        }
//        Student student = studentMyArrayLisk.remove(4);
//        for (int i = 0; i < studentMyArrayLisk.size(); i++) {
//            System.out.println(studentMyArrayLisk.get(i).getName());
//        }
//        System.out.println(student.getName());
    }

}
