package lotto.domain;

import lotto.convert.Convert;
import lotto.userIO.Print;
import lotto.userIO.Read;

import java.util.List;
import java.util.Map;

public class PlayLotto {

    Read read = new Read();
    Convert convert = new Convert();
    Print print = new Print();
    Publish publish = new Publish();


    public void run(){
        print.toInputBuyAmount();
        int amount = read.buyLotto();
        int boughtLotto = amount/1000;
        print.boughtNumber(boughtLotto);
        List<List<Integer>> lottoList = publish.publishLottoNumber(boughtLotto);
        print.boughtLottoList(lottoList);

        print.toInputWinningNumber();
        List<Integer> winningNumber =
                convert.convertStringToIntegerList(read.readNumber());
        print.toInputBonusNumber();
        int bonusNumber = Integer.parseInt(read.readNumber());
        Lotto lotto = new Lotto(winningNumber);
        Map<String, Integer> gradeMap = lotto.winLotto(lottoList, bonusNumber);
        print.winningDetails(gradeMap);
    }

}
