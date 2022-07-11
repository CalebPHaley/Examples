import java.util.Scanner;
class VowelOrConsonant
{
   public static void main(String[ ] arg)
   {
	boolean isVowel = false;
	// Open scanner input
	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter a character : ");
	char c = scnr.next().charAt(0); 
	scnr.close();
	switch(c)
	{
	// Declare Vowels
	   case 'a' :
	   case 'e' :
	   case 'i' :
	   case 'o' :
	   case 'u' :
	   case 'A' :
	   case 'E' :
	   case 'I' :
	   case 'O' :
	   case 'U' : isVowel = true;
	}
	// Checks for a vowel
	if(isVowel == true) {
	   System.out.println(c+" is  a Vowel");
	}
	
	// If not a vowel, it's consonant
	else {
	   if((c >= 'a' && c <= 'z')||(c >='A' && c<='Z'))
		System.out.println(c + " is a Consonant");
	   
	   // Otherwise, invalid input
	   else
		System.out.println("That is not in the alphabet");		
        }
   }
}
