package chapter3.item10;

import java.util.ArrayList;
import java.util.List;

public class CaseInSensitiveString {

    private final String s;

    public CaseInSensitiveString(String s) {
        this.s = s;
    }

    // 대칭성 위배
//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof CaseInSensitiveString) {
//            return s.equalsIgnoreCase(
//                    ((CaseInSensitiveString) o).s);
//        }
//
//        if (o instanceof String) {
//            return s.equalsIgnoreCase((String) o);
//        }
//
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInSensitiveString &&
                ((CaseInSensitiveString) o).s.equalsIgnoreCase(s);
    }

    // 문제 시연
    public static void main(String[] args) {
        CaseInSensitiveString cis = new CaseInSensitiveString("Polish");
        String s = "polish";

        List<CaseInSensitiveString> list = new ArrayList<>();
        list.add(cis);

        System.out.println(list.contains(s));
    }
}
