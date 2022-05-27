package teacher.lesson_x.insurance_policy.solutions.v3;

import java.math.BigDecimal;

import teacher.lesson_x.insurance_policy.solutions.v3.domain.InsuranceObject;
import teacher.lesson_x.insurance_policy.solutions.v3.domain.Policy;
import teacher.lesson_x.insurance_policy.solutions.v3.domain.RiskType;
import teacher.lesson_x.insurance_policy.solutions.v3.domain.SubInsuranceObject;

public class InsurancePolicyPremiumCalculator {

	public BigDecimal calculate(Policy policy) {
		BigDecimal premium = BigDecimal.ZERO;
		for (RiskType riskType : RiskType.values()) {
			BigDecimal premiumForRisk = calculate(policy, riskType);
			premium = premium.add(premiumForRisk);
		}
		return premium;
	}

	private BigDecimal calculate(Policy policy, RiskType riskType) {
		BigDecimal premium = BigDecimal.ZERO;
		for (InsuranceObject insuranceObject : policy.getInsuranceObjects()) {
			BigDecimal premiumForRisk = calculate(insuranceObject, riskType);
			premium = premium.add(premiumForRisk);
		}
		return premium;
	}

	private BigDecimal calculate(InsuranceObject insuranceObject, RiskType riskType) {
		BigDecimal subObjectValueForSpecificRisk = calculateValue(insuranceObject, riskType);
		BigDecimal riskCoeficient = getRiskCoeficient(riskType, subObjectValueForSpecificRisk);
		return subObjectValueForSpecificRisk.multiply(riskCoeficient);
	}

	private BigDecimal calculateValue(InsuranceObject insuranceObject, RiskType riskType) {
		BigDecimal value = BigDecimal.ZERO;
		for (SubInsuranceObject subInsuranceObject : insuranceObject.getSubInsuranceObjects()) {
			if (subInsuranceObject.containsRiskType(riskType)) {
				value = value.add(subInsuranceObject.getValue());
			}
		}
		return value;
	}

	private BigDecimal getRiskCoeficient(RiskType riskType, BigDecimal subObjectValueForSpecificRisk) {
		if (RiskType.FIRE == riskType) {
			if (subObjectValueForSpecificRisk.compareTo(new BigDecimal("2000.00")) < 0) {
				return new BigDecimal("0.03");
			} else {
				return new BigDecimal("0.04");
			}
		}
		if (RiskType.THEFT == riskType) {
			if (subObjectValueForSpecificRisk.compareTo(new BigDecimal("2000.00")) < 0) {
				return new BigDecimal("0.01");
			} else {
				return new BigDecimal("0.02");
			}
		}
		return BigDecimal.ZERO;
	}

}