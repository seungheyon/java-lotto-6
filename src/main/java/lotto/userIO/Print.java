package lotto.userIO;

import java.util.List;
import java.util.Map;

public class Print {

    public void toInputBuyAmount(){
        System.out.println("구입금액을 입력해 주세요.");
    }

    public void boughtNumber(int number){
        System.out.println(number+"개를 구매했습니다.");
    }

    public void toInputWinningNumber(){
        System.out.println("당첨 번호를 입력해 주세요.");
    }

    public void toInputBonusNumber(){
        System.out.println("보너스 번호를 입력해 주세요.");
    }

    public void boughtLottoList(List<List<Integer>> lottoLists){
        lottoLists.forEach(System.out::println);
    }

    public void winningDetails(Map<String, Integer> gradeMap){
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println("3개 일치 (5,000원) - "+gradeMap.get("5th")+"개");
        System.out.println("4개 일치 (5,0000원) - "+gradeMap.get("4th")+"개");
        System.out.println("5개 일치 (1,500,000원) - "+gradeMap.get("3rd")+"개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - "+gradeMap.get("2nd")+"개");
        System.out.println("6개 일치 (2,000,000,000원) - "+gradeMap.get("1st")+"개");
    }
}
