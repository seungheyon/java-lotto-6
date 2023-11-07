package lotto.domain;

import lotto.contant.OutputEnum;

import java.util.List;

public class BonusNumber {
    private final int number;
    private final List<Integer> numbers;

    public BonusNumber(int number, List<Integer> numbers) {
        validate(number, numbers);
        this.number = number;
        this.numbers = numbers;
    }

    private void validate(int number, List<Integer> numbers){
        if(number>45){
            throw new IllegalArgumentException(OutputEnum.output.ERR_BONUS_NOT_IN_RANGE.getDescription());
        }
        if(numbers.stream().anyMatch(it -> it.equals(number))){
            throw new IllegalArgumentException(OutputEnum.output.ERR_BONUS_DUPLICATED.getDescription());
        }
    }

}
