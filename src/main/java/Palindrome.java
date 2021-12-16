public class Palindrome {
    public static void main(String[] args) {
        String text = "madam";
        boolean flag = true;

        //Converts the given string into lowercase
        text = text.toLowerCase();

        //Iterate the string forward and backward, compare one character at a time
        //till middle of the string is reached
        for(int i = 0; i < text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Given string is palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
}
