package Homework1;

public class StringCharacters {

	public static void main(String[] args)
	{
	String text = "To be or not to be, that is the question;"
	+"Whether `tis nobler in the mind to suffer"
	+" the slings and arrows of outrageous fortune,"
	+" or to take arms against a sea of troubles,"
	+" and by opposing end them?";
	int spaces = 0,
	vowels = 0,
	letters = 0;
	//YOUR CODE HERE
    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);
        // Check if the character is a space
        if (Character.isWhitespace(ch)) {
            spaces++;
        }
        // Check if the character is a vowel
        else if ("AEIOUaeiou".contains(String.valueOf(ch))) {
            vowels++;
        }
        // Check if the character is a letter (consonant)
        else if (Character.isLetter(ch)) {
            letters++;
        }
    }
    
    System.out.println("The text contained vowels: " + vowels + "\n"
                     + "consonants: " + (letters - vowels) + "\n"
                     + "spaces: " + spaces);
}
}







	
	


