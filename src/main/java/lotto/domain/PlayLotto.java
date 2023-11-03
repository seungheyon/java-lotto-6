package lotto.domain;

import lotto.convert.Convert;
import lotto.userIO.Print;
import lotto.userIO.Read;

import java.util.List;

public class PlayLotto {

    Read read = new Read();
    Convert convert = new Convert();
    Print print = new Print();

    public void run(){
        print.toInputBuyAmount();
        int amount = read.buyLotto();
        int boughtLotto = amount/1000;
        print.boughtNumber(boughtLotto);
        print.toInputWinningNumber();
        List<Integer> winningNumber =
                convert.convertStringToIntegerList(read.readNumber());
        print.toInputBonusNumber();
        int bonusNumber = Integer.parseInt(read.readNumber());

    }

}
