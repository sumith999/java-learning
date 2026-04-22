package Week1.basics;

public class StringHandlingDemo {
    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(0, 5));
        System.out.println(s.contains("World"));
        System.out.println(s.replace("World", "Java"));
        System.out.println(s.indexOf("World"));
        System.out.println(s.trim());

        // equals vs ==
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        System.out.println(sb.toString());
    }
}
