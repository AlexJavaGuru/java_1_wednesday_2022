package teacher.lesson_x.insurance_policy.solutions.v1.tests;

import java.math.BigDecimal;

import teacher.lesson_x.insurance_policy.solutions.v1.businesslogic.InsurancePolicyPremiumCalculator;
import teacher.lesson_x.insurance_policy.solutions.v1.domain.House;
import teacher.lesson_x.insurance_policy.solutions.v1.domain.InsuranceObject;
import teacher.lesson_x.insurance_policy.solutions.v1.domain.InsuranceRisk;
import teacher.lesson_x.insurance_policy.solutions.v1.domain.Policy;

public class InsurancePolicyPremiumCalculatorTest {

	private InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();

	public static void main(String[] args) {
		InsurancePolicyPremiumCalculatorTest test = new InsurancePolicyPremiumCalculatorTest();
		test.testPolicyForOneInsuranceObject();
	}

	public void testPolicyForOneInsuranceObject() {
		InsuranceObject house = new House(new BigDecimal("100000.00"));
		house.addInsuranceRisk(InsuranceRisk.FIRE);

		Policy policy = new Policy();
		policy.addInsuranceObject(house);

		BigDecimal premium = insurancePolicyPremiumCalculator.calculate(policy);
		if (premium.compareTo(new BigDecimal("5000.00")) == 0) {
			System.out.println("OK!");
		} else {
			System.out.println("FAIL!");
		}
	}

}
