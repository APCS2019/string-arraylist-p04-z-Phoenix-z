public class StringCoder
{
 private String masterString;
 /** @param master the master string for the StringCoder
 * Precondition: the master string contains all the letters of the alphabet
 */
 public StringCoder(String master)
 { masterString = master; }
 /** @param parts an ArrayList of string parts that are valid in the master string
 * Precondition: parts.size() > 0
 * @return the string obtained by concatenating the parts of the master string
 */
 public String decodeString(ArrayList<StringPart> parts){
  String temp = "";
  for (int i = 0 ; i < parts.size() ; i ++){
      int a = parts.getStart(i);
      int b = parts.getLength(i);
      temp = materString.substring(a,a+b);
  }
  return temp;
   
 }
 /** @param str the string to encode using the master string
 * Precondition: all of the characters in str appear in the master string;
 * str.length() > 0
 * @return a string part in the master string that matches the beginning of str.
 * The returned string part has length at least 1.
 */
 private StringPart findPart(String str)
 { /* implementation not shown */ }
 /** @param word the string to be encoded
 * Precondition: all of the characters in word appear in the master string;
 * word.length() > 0
 * @return an ArrayList of string parts of the master string that can be combined
 * to create word
 */
 public ArrayList<StringPart> encodeString(String word){
  ArrayList<StringPart> a = new ArrayList<StringPart>();
  while (word.length() != 0){
    a.add(findPart.(word));
    word = word.substring(getLength.(findPart.(word)));
  }
  return a;
  } 
