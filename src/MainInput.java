import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MainInput {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        try {
            ObjectInputStream inputStream =
                    new ObjectInputStream(new FileInputStream("person.details"));
            people = (ArrayList<Person>) inputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }

        for(Person person : people){
            System.out.println(person.toString());
        }
    }
}
