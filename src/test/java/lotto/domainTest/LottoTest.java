package lotto.domainTest;

import lotto.domain.Lotto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 45보다 큰 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByOverMaxNumber() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 50)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("보너스 번호에 45보다 큰 숫자가 있으면 예외가 발생한다.")
    @Test
    void createBonusByOverMaxNumber() {
        Lotto lotto = new Lotto(List.of(1, 2, 3, 4, 5, 6));
        int testBonusNumber = 50;

        assertThatThrownBy(() -> lotto.validateBonusNumberRange(testBonusNumber))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("보너스 번호에 로또 번호와 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createBonusByDuplicatedNumber() {
        Lotto lotto = new Lotto(List.of(1, 2, 3, 4, 5, 6));
        int testBonusNumber = 5;

        assertThatThrownBy(() -> lotto.validateBonusNumberDuplicated(testBonusNumber))
                .isInstanceOf(IllegalArgumentException.class);
    }
}