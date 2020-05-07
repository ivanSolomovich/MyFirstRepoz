package HomeWork11;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Censorship {
    private String inputString;
    private String searchString;
    private String replacementString;
    private String outputString;

    public Censorship(String inputString, String searchString, String replacementString) {
        this.inputString = inputString;
        this.searchString = searchString;
        this.replacementString = replacementString;
    }

    public void convertWithMethod() {
        outputString = inputString.replaceAll("(?iu)" + searchString,replacementString);
    }

    public void convertWithPattern() {
        outputString = Pattern.compile(searchString, Pattern.LITERAL |
                Pattern.CASE_INSENSITIVE |
                Pattern.UNICODE_CASE)
                .matcher(inputString)
                .replaceAll(Matcher.quoteReplacement(replacementString));
    }

    @Override
    public String toString() {
        return outputString;
    }

    public static void main(String[] args) {
        Censorship censor = new Censorship("Меню: Бяка  Морская, бякА  Сухая, бяка Воздушная.",
                "бяка","\'вырезано цензурой\'");
        censor.convertWithMethod();
        System.out.println("Замена с replaceAll: " + censor);
        censor.convertWithPattern();
        System.out.println("Замена с Pattern: " + censor);
    }
}