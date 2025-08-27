package lambdas;

import java.util.Arrays;

public class JavaTipp {
    private String text;
    private String[] themen;

    public JavaTipp(String text, String... themen) {
        this.text = text;
        this.themen = themen;
    }

    public String getText() {
        return text;
    }

    public String[] getThemen() {
        return themen;
    }

    @Override
    public String toString() {
        return "Tipp: \"" + text + "\"\n   Themen :  " + Arrays.toString(themen) + "\n";
    }
}