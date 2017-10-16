import com.fasterxml.jackson.core.JsonProcessingException;
import entity.Person;
import entity.Record;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Samuel Butta
 */
public class JsonWriterTest {


    @Test
    public void testPersonToJson() throws JsonProcessingException {
        Record record = new Record("1", "Russia", new Person("milos", "zeman"));
        String json = JsonWriter.personToJson(record);

        Assert.assertEquals("{\"id\":\"1\",\"location\":\"Russia\",\"person\":{\"name\":\"milos\",\"surname\":\"zeman\"}}", json);
    }

}