
public class ConstructorOverloading {

    public static void main(String[] args) {

        Student s1 = new Student("Rani", 22, 4.5);

        s1.display();

        Student s2 = new Student();

        s2.display();
    }
}

class Student {

    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    Student() {
        name = null;
        age = 0;
        height = 0.0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("height: " + height);

    }
}
