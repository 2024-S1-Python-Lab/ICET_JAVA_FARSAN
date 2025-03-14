import java.util.Scanner;
public class WordSearch
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of words in the array: ");
int size = sc.nextInt();
String[] words = new String[size]; // Create an array to store the words
System.out.println("Enter the words:");
for (int i = 0; i < size; i++)
words[i] = sc.next();
System.out.print("Enter a word to search: ");
String searchWord = sc.next();
boolean found = false; // Flag to indicate if the word is found
// Iterate through the array to search for the word
for (String word : words) //for-each loop
{
if (word.equals(searchWord))
{
found = true;
break;
}
}
if (found)
System.out.println("The word '" + searchWord + "' is found in thearray.");
else
System.out.println("The word '" + searchWord + "' is not found.");
}
}
