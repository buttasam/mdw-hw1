import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Samuel Butta
 */
public class App {


    public static void main(String[] args) {
        String input = "Dear Sir or Madam,\n" +
                "\n" +
                "please find the details about my booking bellow:\n" +
                "\n" +
                "===\n" +
                "Trip id: \"1\"\n" +
                "Location: \"Bohemian Switzerland\"\n" +
                "Person: \"Jan Novak\"\n" +
                "===\n" +
                "\n" +
                "Regards,\n" +
                "Jan Novak";

        String id = Parser.parseData(input, "id:");
        System.out.println(id);

        String location = Parser.parseData(input, "Location:");
        System.out.println(location);

        String person = Parser.parseData(input, "Person:");
        System.out.println(person);

        String name = Parser.parseName(input);
        System.out.println(name);


    }

}
