package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("java")) {
            return "Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems, " +
                    "which was later acquired by the Oracle Corporation, that provides a system for developing application software "+
                    "and deploying it in a cross-platform computing environment.";
        }
        return "";
    }
}
