package teacher.lesson_x.insurance_policy.solutions.v3.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInsuranceObject {

	private String title;    // tv, notebook, etc
	private BigDecimal value;
	private List<RiskType> risks;

	public SubInsuranceObject(String title, BigDecimal value, RiskType ... risks) {
		this.title = title;
		this.value = value;
		this.risks = new ArrayList<>(Arrays.asList(risks));
	}

	public String getTitle() {
		return title;
	}

	public BigDecimal getValue() {
		return value;
	}

	public boolean containsRiskType(RiskType riskType) {
		return risks.contains(riskType);
	}

}
