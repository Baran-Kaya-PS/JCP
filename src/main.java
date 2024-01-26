import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        countDuplicateCharacterOfAllCharacter("Hello");
        findTheMostNonRepetedCharacter("Hello");
        reverseLetterInEachWord("Hello Hey");
    }
    public static Map<Character,Integer> countDuplicateCharacterOfAllCharacter(String s){ // it works
        s = s.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        fillMap(s, map);
        System.out.println(map);
        return map;
    }

    /**
     * Cette fonction permet de récupérer le premier charactère qui apparait le moins dans un string
     * On initie une HashMap permettant de stocker le nombre de fois qu'un élément apparait
     * Puis nous transformants les entry (le nombre d'apparition de la valeur) en flux de donnée
     * Nous trions le flux de donnée (cf comparingByValue)
     * Puis nous récupérons dans l'ordre trié les clés de la map et nous récupérons la première valeur.
     * @param s représente le string de la fonction
     * @return char
     */
    public static char findTheMostNonRepetedCharacter(String s){ // it works
        s = s.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        fillMap(s, map);
        System.out.println(map);
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Aucun caractère unique trouvé"));
    }
    public static String reverseLetterInEachWord(String s){
        String[] words = s.split("\\s");
        for (int i = 0; i < words.length; i++){
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ",words);
    }

    private static void fillMap(String s, Map<Character, Integer> map) {
        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i),1);
            }
        }
    }
}
