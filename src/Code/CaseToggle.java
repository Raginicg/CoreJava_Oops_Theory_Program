package Code;
public class CaseToggle {
    public static void main(String[] args) {
        String str = "StRinG";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch; 
            }
        }

        System.out.println("Converted String: " + result);
    }
}
