public class InheritanceClass {
        public static void main(String[] args) {
                Person person = new Person();
                Person child = new Child();

                person.greeting();
                child.greeting();
        }
}

class Person {
        public void greeting() {
                System.out.println("Person class");
        }
}

class Child extends Person {
        @Override
        public void greeting() {
                System.out.println("Child class");
        }
}
