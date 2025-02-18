package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

    public static void main(String[] args) {
        
        // 분석할 문자열을 정의합니다.
        String str = "This is an awesome occasion " + "This has never happened before";
        
        // 문자(character)별 출현 횟수를 저장할 HashMap을 생성합니다.
        // 키: 문자(Character), 값: 해당 문자의 등장 횟수(Integer)
        Map<Character, Integer> occurances = new HashMap<>();
        
        // 문자열을 문자 배열로 변환합니다.
        char[] characters = str.toCharArray();
        
        // 배열의 각 문자를 순회하면서 등장 횟수를 계산합니다.
        for (char character : characters) {
            // 현재 문자가 맵에 저장되어 있는지 확인합니다. 해당 character의 key-value를 확인 
            Integer integer = occurances.get(character);
            if (integer == null) {
                // 만약 맵에 없으면 1로 초기화합니다.
                occurances.put(character, 1);
            } else {
                // 이미 존재하면 기존 값에 1을 더합니다.
                occurances.put(character, integer + 1);
            }
        }
        
        // 문자별 등장 횟수를 출력합니다.
        System.out.println(occurances);
        
        
        // 단어(word)별 출현 횟수를 저장할 HashMap을 생성합니다.
        // 키: 단어(String), 값: 해당 단어의 등장 횟수(Integer)
        Map<String, Integer> stringOccurances = new HashMap<>();
        
        // 문자열을 공백(" ")을 기준으로 분리하여 단어 배열로 만듭니다.
        String[] words = str.split(" ");
        
        // 각 단어에 대해 등장 횟수를 계산합니다.
        for (String word : words) {
            // 현재 단어가 맵에 저장되어 있는지 확인합니다.
            Integer integer = stringOccurances.get(word);
            if (integer == null) {
                // 만약 맵에 없으면 1로 초기화합니다.
                stringOccurances.put(word, 1);
            } else {
                // 이미 존재하면 기존 값에 1을 더합니다.
                stringOccurances.put(word, integer + 1);
            }
        }
        
        // 단어별 등장 횟수를 출력합니다.
        System.out.println(stringOccurances);        
    }
}
