package references.parameters;


public class ReferencesMain {

    public static void main(String[] args) {
        Person person = new Person("Szalai Attila", 28);
        Person otherPerson = person;

        otherPerson.setName("Szalai");

        System.out.println(person.getName() + "Szalai Attila " + person.getAge());
        System.out.println(otherPerson.getName() + "Szalai" + otherPerson.getAge());

        int number1 = 24;
        int number2 = number1;

        number2++;

        System.out.println(number1);
        System.out.println(number2);

        otherPerson = new Person("XY", 40);
        System.out.println(person.getName() + "Szalai Attila " + person.getAge());
        System.out.println(otherPerson.getName() + "XY" + otherPerson.getAge());

    }
}

