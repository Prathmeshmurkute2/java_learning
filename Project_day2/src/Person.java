public class Person {

    private String name;
    private int age;

    Person() {
       this("Ananymous",-1);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.age == p.age && this.name.equals(p.name);
        }
        return false;
    }

    public static void main(String[] args) {

        Person p1 = new Person("Polo", 21);
        Person p2 = new Person();

        p1.print();
        p2.print();

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1);

        System.out.println(p1.equals(p2));
        
        Person pc = (Person) p1.clone();
        System.out.println(pc);
    }
}