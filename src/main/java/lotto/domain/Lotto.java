package lotto.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현

    public Map<String, Integer> winLotto(List<List<Integer>> lottoList, int bonusNumber){
        Map<String, Integer> gradeMap = initLottoGradeMap();
        for(List<Integer> lottoNUmber : lottoList){
            int correct = (int)lottoNUmber.stream()
                    .filter(numbers::contains)
                    .count();
            if(correct<3){
                continue;
            }
            if(correct==5){
                determine2ndOr3rd(gradeMap, lottoNUmber, bonusNumber);
            }
            putGradeMapByCorrectCount(gradeMap, correct);
        }

        return gradeMap;
    }

    private static Map<String, Integer> initLottoGradeMap(){
        Map<String, Integer> gradeMap = new HashMap<>();
        gradeMap.put("5th", 0);
        gradeMap.put("4th", 0);
        gradeMap.put("3rd", 0);
        gradeMap.put("2nd", 0);
        gradeMap.put("1st", 0);

        return gradeMap;
    }

    private static void putGradeMapByCorrectCount(Map<String, Integer> gradeMap, Integer correctCount){
        if(correctCount==3){
            gradeMap.put("5th", gradeMap.get("5th")+1);
            return;
        }
        if(correctCount==4){
            gradeMap.put("4th", gradeMap.get("4th")+1);
            return;
        }
        if(correctCount==6){
            gradeMap.put("1st", gradeMap.get("1st")+1);
        }
    }

    private static void determine2ndOr3rd(Map<String, Integer> gradeMap, List<Integer> lottoNumber, int bonusNumber){
        if(lottoNumber.contains(bonusNumber)){
            gradeMap.put("2nd", gradeMap.get("2nd")+1);
            return;
        }
        gradeMap.put("3rd", gradeMap.get("3rd")+1);
    }

}
