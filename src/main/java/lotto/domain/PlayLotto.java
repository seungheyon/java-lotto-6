package lotto.domain;

import lotto.userIO.ReadInput;

public class PlayLotto {

    ReadInput readInput = new ReadInput();

    public void run(){
        int amount = readInput.buyLotto();
        System.out.println(amount);
    }

}
