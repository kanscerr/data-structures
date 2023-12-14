package strings;

import java.util.ArrayList;
import java.util.HashMap;

public class countAnagrams {
    static int start = 0;
    static int updateMap(HashMap<Character, Integer> pattern, Character ch, int countMap){
        int instance = 0;
        instance = pattern.get(ch);
        pattern.put(ch, instance-1);
        instance = pattern.get(ch);
        if(instance == 0){
            countMap--;
        }
        if(instance < 0){
            countMap++;
        }
        return countMap;
    }
    static int slideWindow(HashMap<Character, Integer> pattern, Character ch, int countMap){
        int instance = 0;
        if(pattern.containsKey(ch)){
            instance = pattern.get(ch);
            pattern.put(ch, instance+1);
            instance = pattern.get(ch);
            if(instance == 0){
                countMap--;
            }
            else{
                countMap++;
            }
        }
        return countMap;
    }
    static ArrayList<Integer> countAnagramOccurrence(String str, String ptr){
        HashMap<Character, Integer> pattern = new HashMap<>();
        ArrayList<Integer> idx = new ArrayList<>();
        //creating hashmap of pattern
        for(int i=0;i<ptr.length();i++){
            Character ch = str.charAt(i);
            if(ch != ' '){
                if(pattern.containsKey(ch)){
                    int countFreq = pattern.get(ch);
                    pattern.put(ch, countFreq+1);
                }
                else{
                    pattern.put(ch, 1);
                }
            }
        }
        //sliding window
        int countMap = pattern.size();
        Character ch;
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            if(pattern.containsKey(ch)){
                countMap = updateMap(pattern, ch, countMap);
            }
            if((i-start+1) == ptr.length()){
                if(countMap == 0){
                    idx.add(start);
                }
                ch = str.charAt(start);
                countMap = slideWindow(pattern, ch, countMap);
                start += 1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        String str = "abab";
        String ptr = "ab";
        System.out.println(countAnagramOccurrence(str, ptr));
    }
}
