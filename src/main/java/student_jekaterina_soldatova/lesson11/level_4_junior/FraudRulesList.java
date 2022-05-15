package student_jekaterina_soldatova.lesson11.level_4_junior;

import java.util.ArrayList;
import java.util.List;

public class FraudRulesList {
    private List<FraudRule> fraudRules = new ArrayList<>();

    public FraudRulesList() {
        fraudRules.add(new FraudRuleAmount("Rule max amount"));
        fraudRules.add(new FraudRuleAmountGerman("Rule max amount from Germany"));
        fraudRules.add(new FraudRuleCity("Rule fraud cities"));
        fraudRules.add(new FraudRuleCountry("Rule fraud countries"));
        fraudRules.add(new FraudRuleName("Rule fraud trader name"));
    }

    public List<FraudRule> getFraudRules() {
        return fraudRules;
    }
}

