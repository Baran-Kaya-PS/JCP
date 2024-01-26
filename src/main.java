import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {

    }
    public static Map<Character,Integer> countDuplicateCharacterOfAllCharacter(String s){ // it works
        s = s.toLowerCase();
        Map<Character,Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (count.containsKey(s.charAt(i))){
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            } else {
                count.put(s.charAt(i),1);
            }
        }
        System.out.println(count);
        return count;
    }
}
