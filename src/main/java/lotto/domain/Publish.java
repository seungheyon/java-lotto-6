package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Publish {

    public List<List<Integer>> publishLottoNumber(int boughtLotto){
        List<List<Integer>> lottoNumbersList = new ArrayList<>();
        for(int i=0;i<boughtLotto;i++){
            lottoNumbersList.add(Randoms.pickUniqueNumbersInRange(1, 45, 6));
        }
        return lottoNumbersList;
    }
}
