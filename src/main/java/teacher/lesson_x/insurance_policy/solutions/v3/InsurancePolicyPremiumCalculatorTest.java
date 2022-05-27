package teacher.lesson_x.insurance_policy.solutions.v3;

import java.math.BigDecimal;

import teacher.lesson_x.insurance_policy.solutions.v3.domain.InsuranceObject;
import teacher.lesson_x.insurance_policy.solutions.v3.domain.Policy;
import teacher.lesson_x.insurance_policy.solutions.v3.domain.RiskType;
import teacher.lesson_x.insurance_policy.solutions.v3.domain.SubInsuranceObject;

public class InsurancePolicyPremiumCalculatorTest {

	private InsurancePolicyPremiumCalculator calculator = new InsurancePolicyPremiumCalculator();

	public static void main(String[] args) {
		InsurancePolicyPremiumCalculatorTest test = new InsurancePolicyPremiumCalculatorTest();
		test.test1();
		test.test2();
		test.test3();
		test.test4();
		test.test5();
		test.test6();
		test.test7();
	}

	public void test1() {
		InsuranceObject house = new InsuranceObject();
		Policy policy = new Policy(house);
		BigDecimal premium = calculator.calculate(policy);
		checkResult(premium.compareTo(new BigDecimal("0.00")) == 0, "test1");
	}

	public void test2() {
		SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("100.00"), RiskType.FIRE);
		InsuranceObject house = new InsuranceObject(notebook);
		Policy policy = new Policy(house);
		BigDecimal premium = calculator.calculate(policy);
		checkResult(premium.compareTo(new BigDecimal("3.00")) == 0, "test2");
	}

	public void test3() {
		SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("100.00"), RiskType.THEFT);
		InsuranceObject house = new InsuranceObject(notebook);
		Policy policy = new Policy(house);
		BigDecimal premium = calculator.calculate(policy);
		checkResult(premium.compareTo(new BigDecimal("1.00")) == 0, "test3");
	}

	public void test4() {
		SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("100.00"), RiskType.THEFT, RiskType.FIRE);
		InsuranceObject house = new InsuranceObject(notebook);
		Policy policy = new Policy(house);
		BigDecimal premium = calculator.calculate(policy);
		checkResult(premium.compareTo(new BigDecimal("4.00")) == 0, "test4");
	}

	public void test5() {
		SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("100.00"), RiskType.THEFT, RiskType.FIRE);
		InsuranceObject house = new InsuranceObject(notebook);

		SubInsuranceObject tv = new SubInsuranceObject("TV", new BigDecimal("100.00"), RiskType.THEFT, RiskType.FIRE);
		InsuranceObject flat = new InsuranceObject(tv);

		Policy policy = new Policy(house, flat);
		BigDecimal premium = calculator.calculate(policy);
		checkResult(premium.compareTo(new BigDecimal("8.00")) == 0, "test5");
	}

	public void test6() {
		SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("5000.00"), RiskType.THEFT);
		InsuranceObject house = new InsuranceObject(notebook);
		Policy policy = new Policy(house);
		BigDecimal premium = calculator.calculate(policy);
		checkResult(premium.compareTo(new BigDecimal("100.00")) == 0, "test6");
	}

	public void test7() {
		SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("5000.00"), RiskType.FIRE);
		InsuranceObject house = new InsuranceObject(notebook);
		Policy policy = new Policy(house);
		BigDecimal premium = calculator.calculate(policy);
		checkResult(premium.compareTo(new BigDecimal("200.00")) == 0, "test7");
	}

	private void checkResult(boolean condition, String testName) {
		if (condition) {
			System.out.println(testName + " = OK!");
		} else {
			System.out.println(testName + " = FAIL!");
		}
	}

}
