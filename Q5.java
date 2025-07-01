// Q5)Demonstrate the use of repeat(), strip(),trim(), isBlank(), indent(), transform(), stripIndent(), translateEscapes(),tripleQuotes and formatted() methods.

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class MyClass{
    public static void main(String[] args) {
        String name = "Aman";
        System.out.println("Using Repeat: "+name.repeat(4));

        String string = "\n\t Aman \t\n";
        System.out.println("Using Strip: " + string.strip());
        System.out.println("Using Trim: " + string.trim());
        System.out.println("Using isBlank: " + string.isBlank());
        System.out.println("Using indent: " + string.indent(10));

        String transformedString = string.transform(str->str.toUpperCase()).strip();
        System.out.println("Using transformation: " + transformedString);

        System.out.println("Using StripIndent: " + string.stripIndent());

        String escapeSequenceString = "\u2002 Aman \u2002";
        System.out.println("Using translateEscapes: " + escapeSequenceString.translateEscapes());

        String tripleQuotes = """
                             To The New \
                             sector 143 
                              """;
        System.out.println("Using triple quotes: "+ tripleQuotes);

        System.out.println("Using formatted: AMAN %s".formatted("PAL"));
        
    }
}
