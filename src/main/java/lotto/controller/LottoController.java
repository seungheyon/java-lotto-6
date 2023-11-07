package lotto.controller;

import lotto.domain.LottoDrawer;
import lotto.domain.RandomLottoGenerator;
import lotto.domain.WinningNumberGenerator;
import lotto.util.Printer;
import lotto.view.Output;

import java.util.List;
import java.util.Map;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class LottoController {
    public void start(){
        LottoDrawer lottoDrawer = new LottoDrawer(new Output(new Printer()));
        RandomLottoGenerator lottoGenerator = new RandomLottoGenerator();
        WinningNumberGenerator winningNumberGenerator = new WinningNumberGenerator();

        System.out.println("구입금액을 입력해 주세요.");
        int amount = Integer.parseInt(readLine());
        int boughtLottoSize = amount/1000;
        System.out.println(boughtLottoSize+"개를 구매했습니다.");
        Map<Integer, List<Integer>> lottos = lottoGenerator.generate(boughtLottoSize);
        for(List<Integer> lottoNumber : lottos.values()){
            System.out.println(lottoNumber);
        }

        System.out.println("당첨 번호를 입력해 주세요.");
        List<Integer> winningNumber = winningNumberGenerator.generator(readLine());
        System.out.println("보너스 번호를 입력해 주세요.");
        int bonusNumber = Integer.parseInt(readLine());

        lottoDrawer.draw(lottos, winningNumber, bonusNumber);

    }
}
