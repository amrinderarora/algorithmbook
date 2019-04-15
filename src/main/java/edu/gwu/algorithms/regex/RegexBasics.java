package edu.gwu.algorithms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {

    public static void main(String[] args) {
        doesStringMatch("abababababab", "(ab)+");
        doesStringMatch("abababababab", "(ab)*");
        doesStringMatch("abababccbab", "(ab)*");
        doesStringMatch("abababccbab", "(a|b)*");
        doesStringMatch("abababbbbbab", "(a|b)+");
    }

    private static void doesStringMatch(String string, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(string);
        System.out.println(string + " matches " + pattern + " " + m.matches());
    }
}
