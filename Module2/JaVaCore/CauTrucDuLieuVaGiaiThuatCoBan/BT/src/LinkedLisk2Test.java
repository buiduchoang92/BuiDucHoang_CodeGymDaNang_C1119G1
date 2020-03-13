public class LinkedLisk2Test {
    public static void main(String[] args) {
        class Student{
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
        LinkedLisk2<Student> linkedLisk2 = new LinkedLisk2<>();
        Student student1 = new Student(1,"hoang");
        Student student2 = new Student(1,"hoang");
        Student student3 = new Student(1,"hoang");
        Student student4 = new Student(1,"hoang");
        Student student5 = new Student(1,"hoang");
        Student student6 = new Student(1,"hoang");
        linkedLisk2.addFirst(student1);
        for (int i=0;i<linkedLisk2.size();i++){
            Student student = (Student) linkedLisk2.get(i);
            System.out.println(student.getName());
        }
    }
}
