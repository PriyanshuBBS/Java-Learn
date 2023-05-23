public class java_14 {
    public static void main(String[] args) {
        String name = "Priyanshu";

        System.out.println(name.length());

        // String lString = name.toLowerCase();
        System.out.println(name.toLowerCase());

        // String ustring = name.toUpperCase();
        System.out.println(name.toUpperCase());

        String nonTrimmedString = "     Priyanshu   ";
        System.out.println(nonTrimmedString.trim()); //Remove spaces from string

        System.out.println(name.substring(1)); // Print substring from 1 to end
        System.out.println(name.substring(1, 5)); // from 1 to 5-1

        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("r", "ier"));

        System.out.println(name.startsWith("Pri"));
        System.out.println(name.endsWith("aa"));

        System.out.println(name.charAt(4)); // what is at 4

        // search a value in string
        String modified_name = "Harryrryrry";
        System.out.println(modified_name.indexOf("rry"));
        System.out.println(modified_name.indexOf("rry", 4)); // start search after index 4

        // returns the last of the given sub string
        // search starts from right in lastIndex
        System.out.println(modified_name.lastIndexOf("rry", 7));

        // comparisons for strings
        System.out.println(name.equals("priyanshu"));
        System.out.println(name.equalsIgnoreCase("priyanshu"));

        // Printing "
        System.out.println("Printing \" ");
        // For Printing \, it is needed to add \\
    }
}
