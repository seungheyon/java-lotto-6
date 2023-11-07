package lotto.contant;

public class OutputEnum {
    public enum output{
        WINNING_STATISTICS("당첨 통계"),
        ___("---"),
        THREE_MATCH("3개 일치 (5,000원) - "),
        FOUR_MATCH("4개 일치 (50,000원) - "),
        FIVE_MATCH("5개 일치 (1,500,0000원) - "),
        FIVE_MATCH_AND_BONUS("5개 일치, 보너스 볼 일치 (30,000,000원) - "),
        SIX_MATCH("6개 일치 (2,000,000,0000원) - "),
        COUNT("개");


        private final String description;

        output(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}
