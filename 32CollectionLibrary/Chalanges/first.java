    package Chalanges;


    public class first {

        public static String concatenateStrings(String ...strings) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < strings.length; i++) {
                result.append(strings[i]);
                if (i < strings.length - 1 && !strings[i+1].matches("[.!?,]")) {
                    result.append(" "); // Add space between strings
                }
            }
            return result.toString();
        }

        public static void main(String[] args) {
            String result = concatenateStrings("Hello", "World", "!", "Welcome", "to", "Java", ".");
            System.out.println(result);

        }


    }
