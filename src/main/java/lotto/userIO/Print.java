package lotto.userIO;

import java.util.List;

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
}
