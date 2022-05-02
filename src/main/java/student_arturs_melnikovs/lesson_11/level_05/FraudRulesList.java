package student_arturs_melnikovs.lesson_11.level_05;

import java.util.ArrayList;
import java.util.List;

class FraudRulesList {
    private List<FraudRule> fraudRules = new ArrayList<>();

    public FraudRulesList() {
        fraudRules.add(new FraudRule1("Rule 1"));
        fraudRules.add(new FraudRule2("Rule 2"));
        fraudRules.add(new FraudRule3("Rule 3"));
        fraudRules.add(new FraudRule4("Rule 4"));
        fraudRules.add(new FraudRule5("Rule 5"));
    }

    public List<FraudRule> getFraudRules() {
        return fraudRules;
    }
}
