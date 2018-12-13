package org.rastalion.chapter18_lambda_expressions.demo2;

import org.rastalion.chapter18_lambda_expressions.demo1.Text;
import org.rastalion.chapter18_lambda_expressions.demo1.WordFilter;

public class TextApp {
    public static void main (String[] args) {
        String a = "a";
        final String e = "e";
        Text text = new Text("Hello this is another example of a sentence containing words");

        System.out.println("**** Words containing 'e' ****");
        text.printFilteredWords((String s) -> s.contains(e));

        System.out.println("**** Long words ****");
        text.printFilteredWords((s) -> s.length() > 4);

        System.out.println("**** Words starting with 'a' ****");
        text.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid (String s) {
                return s.contains(a);
            }
        });


    }


}
