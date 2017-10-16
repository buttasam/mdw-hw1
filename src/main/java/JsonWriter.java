import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Record;

/**
 * @author Samuel Butta
 */
public class JsonWriter {


    public static String personToJson(Record record) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.writeValueAsString(record);
    }


}
