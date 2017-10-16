import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Samuel Butta
 */
public class ParserTest {

    public Parser parser = new Parser();
    private String input = "Dear Sir or Madam,\n" +
            "\n" +
            "please find the details about my booking bellow:\n" +
            "\n" +
            "===\n" +
            "Trip id: \"1\"\n" +
            "Location: \"Bohemian Switzerland\"\n" +
            "Record: \"Jan Novak\"\n" +
            "===\n" +
            "\n" +
            "Regards,\n" +
            "Jan Novak";


    @Test
    public void parseData() throws Exception {
        String id = Parser.parseData(input, "id:");
        String location = Parser.parseData(input, "Location:");
        String person = Parser.parseData(input, "Record:");


        Assert.assertEquals("1", id);
        Assert.assertEquals("Bohemian Switzerland", location);
        Assert.assertEquals("Jan Novak", person);
    }

    @Test
    public void parseName() throws Exception {
        String name = Parser.parseName(input);
        Assert.assertEquals("Jan Novak", name);
    }

}