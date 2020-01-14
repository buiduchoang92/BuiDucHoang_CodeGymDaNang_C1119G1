public class MyARRtest2 {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
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
    }

    public static void main(String[] args) {
        Student student1 = new Student(3, "hoang");
        Student student2 = new Student(54, "haitac");
        Student student3 = new Student(65, "huy");
        Student student4 = new Student(76, "hong");
        Student student5 = new Student(97, "huong");
        Student student6 = new Student(32, "hai");
        Student student7 = new Student(322, "ha");
        MyArrayLisk2<Student> studentMyArrayLisk2 = new MyArrayLisk2<>();

        studentMyArrayLisk2.add(student1);
        studentMyArrayLisk2.add(student2);
        studentMyArrayLisk2.add(student3);
        studentMyArrayLisk2.add(student4);
        studentMyArrayLisk2.add(student5);
        studentMyArrayLisk2.add(student6);
        studentMyArrayLisk2.add(1,student7);
        //System.out.println(studentMyArrayLisk2.get(2).getName());
//        System.out.println(studentMyArrayLisk2.contains(student1));
//        for (int i = 0; i < studentMyArrayLisk2.size(); i++) {
//            Student student = (Student) studentMyArrayLisk2.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//
//        }
//        MyArrayLisk2<Student> cloneMyArrayLisk2 = new MyArrayLisk2<>();
//        cloneMyArrayLisk2 = studentMyArrayLisk2.clone();
//        for (int i =0; i < cloneMyArrayLisk2.size();i++) {
//            System.out.println(cloneMyArrayLisk2.get(i).getId());
//        }
//        Student student = studentMyArrayLisk2.remove(2);
//        System.out.println(student.getName());
//        studentMyArrayLisk2.remove(2);
//        for (int i = 0;i <studentMyArrayLisk2.size();i++){
//            System.out.println(studentMyArrayLisk2.get(i).getName());
//        }


//            System.out.println(studentMyArrayLisk2.indexOf(student1));
        System.out.println(studentMyArrayLisk2.contains(student2));



    }
}
