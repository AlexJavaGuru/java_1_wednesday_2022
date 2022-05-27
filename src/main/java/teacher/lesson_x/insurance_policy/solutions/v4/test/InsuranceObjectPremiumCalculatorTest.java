package teacher.lesson_x.insurance_policy.solutions.v4.test;

import static teacher.lesson_x.insurance_policy.solutions.v4.test.InsuranceObjectBuilder.createInsuranceObject;
import static teacher.lesson_x.insurance_policy.solutions.v4.test.SubInsuranceObjectBuilder.createSubInsuranceObject;

import java.math.BigDecimal;

import teacher.lesson_x.insurance_policy.solutions.v4.businesslogic.InsuranceObjectPremiumCalculator;
import teacher.lesson_x.insurance_policy.solutions.v4.businesslogic.InsuranceRiskCoefficientDetector;
import teacher.lesson_x.insurance_policy.solutions.v4.domain.InsuranceObject;
import teacher.lesson_x.insurance_policy.solutions.v4.domain.InsuranceRisk;

public class InsuranceObjectPremiumCalculatorTest {

	private InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator;

	public InsuranceObjectPremiumCalculatorTest() {
		InsuranceRiskCoefficientDetector riskCoefficientDetector = new InsuranceRiskCoefficientDetector();
		insuranceObjectPremiumCalculator = new InsuranceObjectPremiumCalculator(riskCoefficientDetector);
	}

	public static void main(String[] args) {
		InsuranceObjectPremiumCalculatorTest test = new InsuranceObjectPremiumCalculatorTest();
		test.shouldReturnCorrectSumForFireRiskLessThenBorder();
		test.shouldReturnCorrectSumForFireRiskBiggerThenBorder();
		test.shouldReturnCorrectSumForTheftRiskLessThenBorder();
		test.shouldReturnCorrectSumForTheftRiskBiggerThenBorder();
		test.shouldReturnCorrectSumForAllRisks();
	}


	public void shouldReturnCorrectSumForFireRiskLessThenBorder() {
		InsuranceObject insuranceObject = createInsuranceObject()
				.with(createSubInsuranceObject()
						.withName("tv")
						.withPrice(new BigDecimal("500.00"))
						.withRisk(InsuranceRisk.FIRE)
						.build()
				)
				.with(createSubInsuranceObject()
						.withName("notebook")
						.withPrice(new BigDecimal("1000.00"))
						.withRisk(InsuranceRisk.FIRE)
						.build()
				).build();
		BigDecimal sum = insuranceObjectPremiumCalculator.calculate(insuranceObject);
		boolean condition = isEquals(sum, new BigDecimal("1500.00").multiply(new BigDecimal("0.03")));
		checkResults(condition, "shouldReturnCorrectSumForFireRiskLessThenBorder");
	}

	public void shouldReturnCorrectSumForFireRiskBiggerThenBorder() {
		InsuranceObject insuranceObject = createInsuranceObject()
				.with(createSubInsuranceObject()
						.withName("tv")
						.withPrice(new BigDecimal("1500.00"))
						.withRisk(InsuranceRisk.FIRE)
						.build()
				)
				.with(createSubInsuranceObject()
						.withName("notebook")
						.withPrice(new BigDecimal("1500.00"))
						.withRisk(InsuranceRisk.FIRE)
						.build()
				).build();
		BigDecimal sum = insuranceObjectPremiumCalculator.calculate(insuranceObject);
		boolean condition = isEquals(sum, new BigDecimal("3000.00").multiply(new BigDecimal("0.04")));
		checkResults(condition, "shouldReturnCorrectSumForFireRiskBiggerThenBorder");
	}

	public void shouldReturnCorrectSumForTheftRiskLessThenBorder() {
		InsuranceObject insuranceObject = createInsuranceObject()
				.with(createSubInsuranceObject()
						.withName("tv")
						.withPrice(new BigDecimal("500.00"))
						.withRisk(InsuranceRisk.THEFT)
						.build()
				)
				.with(createSubInsuranceObject()
						.withName("notebook")
						.withPrice(new BigDecimal("1000.00"))
						.withRisk(InsuranceRisk.THEFT)
						.build()
				).build();
		BigDecimal sum = insuranceObjectPremiumCalculator.calculate(insuranceObject);
		boolean condition = isEquals(sum, new BigDecimal("1500.00").multiply(new BigDecimal("0.01")));
		checkResults(condition, "shouldReturnCorrectSumForTheftRiskLessThenBorder");
	}

	public void shouldReturnCorrectSumForTheftRiskBiggerThenBorder() {
		InsuranceObject insuranceObject = createInsuranceObject()
				.with(createSubInsuranceObject()
						.withName("tv")
						.withPrice(new BigDecimal("1500.00"))
						.withRisk(InsuranceRisk.THEFT)
						.build()
				)
				.with(createSubInsuranceObject()
						.withName("notebook")
						.withPrice(new BigDecimal("1500.00"))
						.withRisk(InsuranceRisk.THEFT)
						.build()
				).build();
		BigDecimal sum = insuranceObjectPremiumCalculator.calculate(insuranceObject);
		boolean condition = isEquals(sum, new BigDecimal("3000.00").multiply(new BigDecimal("0.02")));
		checkResults(condition, "shouldReturnCorrectSumForTheftRiskBiggerThenBorder");
	}

	public void shouldReturnCorrectSumForAllRisks() {
		InsuranceObject insuranceObject = createInsuranceObject()
				.with(createSubInsuranceObject()
						.withName("tv")
						.withPrice(new BigDecimal("1500.00"))
						.withRisk(InsuranceRisk.FIRE)
						.build()
				)
				.with(createSubInsuranceObject()
						.withName("notebook")
						.withPrice(new BigDecimal("1500.00"))
						.withRisk(InsuranceRisk.THEFT)
						.build()
				).build();
		BigDecimal sum = insuranceObjectPremiumCalculator.calculate(insuranceObject);
		boolean condition = isEquals(sum,
				new BigDecimal("1500.00").multiply(new BigDecimal("0.03"))
				.add(new BigDecimal("1500.00").multiply(new BigDecimal("0.01"))));
		checkResults(condition, "shouldReturnCorrectSumForAllRisks");
	}

	private boolean isEquals(BigDecimal firstNumber, BigDecimal secondNumber) {
		return firstNumber.compareTo(secondNumber) == 0;
	}

	private void checkResults(boolean condition, String testName) {
		if (condition) {
			System.out.println(testName + " = OK");
		} else {
			System.out.println(testName + " = FAIL");
		}
	}

}
