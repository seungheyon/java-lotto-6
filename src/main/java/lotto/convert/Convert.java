package lotto.convert;

import java.util.List;

public class Convert {
    public List<Integer> convertStringToIntegerList(String str){
        List<String> strList = List.of(str.split(","));
        return strList.stream()
                .map(it -> {
                    try {
                        return Integer.parseInt(it);
                    } catch (NumberFormatException e) {
                        return null;
                    }
                }).toList();
    }
}
