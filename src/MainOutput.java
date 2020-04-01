import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MainOutput {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Person person = new Person(1, "qwerty");
        Person person1 = new Person(2, "asdasd");
        Person person2 = new Person(3, "vdvdfvf");
        people.add(person);
        people.add(person1);
        people.add(person2);

        try {
            ObjectOutputStream outputStream =
                    new ObjectOutputStream(new FileOutputStream("person.details"));
            outputStream.writeObject(people);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
