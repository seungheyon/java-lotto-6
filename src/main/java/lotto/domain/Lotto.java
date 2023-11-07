package lotto.domain;

import lotto.contant.OutputEnum;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(OutputEnum.output.ERR_LOTTO_MUST_BE_SIX_NUMBER.getDescription());
        }
        if(numbers.stream().anyMatch(it -> it > 45)){
            throw new IllegalArgumentException(OutputEnum.output.ERR_LOTTO_NOT_IN_RANGE.getDescription());
        }
        Set<Integer> set = new HashSet<>(numbers);
        if(set.size()!=numbers.size()){
            throw new IllegalArgumentException(OutputEnum.output.ERR_LOTTO_DUPLICATED.getDescription());
        }
    }

    // TODO: 추가 기능 구현


}
