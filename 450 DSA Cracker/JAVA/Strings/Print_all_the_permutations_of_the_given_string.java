import java.util.*;
public class Print_all_the_permutations_of_the_given_string 
{
    public static Scanner scn=new Scanner(System.in);

    public static ArrayList<String> find_permutation(String S) 
    {
        if (S.length() == 0) {
 
            // Return an empty arraylist
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
 
        // Take first character of str
        char ch = S.charAt(0);
 
        // Take sub-string starting from the
        // second character
        String subStr = S.substring(1);
 
        // Recurvise call
        ArrayList<String> prevResult = find_permutation(subStr);
 
        // Store the generated permutations
        // into the resultant arraylist
        ArrayList<String> Res = new ArrayList<>();
 
        for (String val : prevResult) {
            for (int i = 0; i <= val.length(); i++) {
                Res.add(val.substring(0, i) + ch + val.substring(i));
            }
        }
          
        // Sorting the ArrayList  
        Collections.sort(Res);
        // Return the resultant arraylist
        return Res;
    }

    public static void main(String[] args)
    {
        String str=scn.next();
        ArrayList<String> al=find_permutation(str);
        System.out.println(al);
    }
}

