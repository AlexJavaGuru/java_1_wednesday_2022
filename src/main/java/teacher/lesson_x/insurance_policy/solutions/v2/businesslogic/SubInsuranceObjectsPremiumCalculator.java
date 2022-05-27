package teacher.lesson_x.insurance_policy.solutions.v2.businesslogic;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import teacher.lesson_x.insurance_policy.solutions.v2.domain.InsuranceObject;
import teacher.lesson_x.insurance_policy.solutions.v2.domain.InsuranceRisk;
import teacher.lesson_x.insurance_policy.solutions.v2.domain.SubInsuranceObject;

public class SubInsuranceObjectsPremiumCalculator {

	private FireRiskCoeficientDetector fireRiskCoeficientDetector = new FireRiskCoeficientDetector();
	private TheftRiskCoeficientDetector theftRiskCoeficientDetector = new TheftRiskCoeficientDetector();

	public BigDecimal calculate(InsuranceObject insuranceObject) {
		Set<InsuranceRisk> subObjectRisks = identifyAllRisksForSubObjects(insuranceObject);
		BigDecimal subInsuranceObjectRiskPremium = BigDecimal.ZERO;
		for (InsuranceRisk insuranceRisk : subObjectRisks) {
			BigDecimal subObjectPriceForRisk = calculatePriceSumForSubObjectWithRisk(insuranceObject, insuranceRisk);
			BigDecimal coeficient = getCoeficientForSubInsuranceObjects(insuranceRisk, insuranceObject);
			subInsuranceObjectRiskPremium = subInsuranceObjectRiskPremium.add(subObjectPriceForRisk.multiply(coeficient));
		}
		return subInsuranceObjectRiskPremium;
	}

	private BigDecimal calculatePriceSumForSubObjectWithRisk(InsuranceObject insuranceObject,
															 InsuranceRisk insuranceRisk) {
		return insuranceObject.getSubInsuranceObjects().stream()
				.filter(subInsuranceObject -> subInsuranceObject.isInsuredFrom(insuranceRisk))
				.map(SubInsuranceObject::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	private BigDecimal getCoeficientForSubInsuranceObjects(InsuranceRisk insuranceRisk,
														   InsuranceObject insuranceObject) {
		if (InsuranceRisk.FIRE == insuranceRisk) {
			return fireRiskCoeficientDetector.detect(insuranceObject.getSubInsuranceObjects());
		}
		if (InsuranceRisk.THEFT == insuranceRisk) {
			return theftRiskCoeficientDetector.detect(insuranceObject.getSubInsuranceObjects());
		}
		throw new IllegalArgumentException("Insurance risk not supported! " + insuranceRisk);
	}

	private Set<InsuranceRisk> identifyAllRisksForSubObjects(InsuranceObject insuranceObject) {
		Set<InsuranceRisk> subObjectRisks = new HashSet<>();
		for (SubInsuranceObject subInsuranceObject : insuranceObject.getSubInsuranceObjects()) {
			subObjectRisks.addAll(subInsuranceObject.getInsuranceRisks());
		}
		return subObjectRisks;
	}

}