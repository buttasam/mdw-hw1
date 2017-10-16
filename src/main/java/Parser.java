import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Samuel Butta
 */
public class Parser {

    public static String parseData(String input, String start) {
        Pattern pattern = Pattern.compile(start + "(.)*\n");
        Matcher matcher = pattern.matcher(input);

        String result = "";
        if(matcher.find()) {
            String line = matcher.group(0);
            result = line.substring(line.indexOf("\"") + 1, line.lastIndexOf("\""));
        }
        return result;
    }


    public static String parseName(String input) {
        String template = "Regards,\n";
        return input.substring(input.indexOf(template) + template.length());
    }
}
