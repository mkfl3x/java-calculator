import org.intellij.lang.annotations.Language;

import java.util.regex.Pattern;

public class RegexExample {
    final Pattern pattern = Pattern.compile("^\\+(?:[0-9] ?){6,14}[0-9]$");

    @Language("CronExp")
    String cronExpression = "0 0 12 * * ?";
}
