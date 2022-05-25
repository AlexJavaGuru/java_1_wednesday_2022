package teacher.lesson_x.insurance_policy.solutions.v3.domain;

import java.math.BigDecimal;

public class PolicyDemo {

	public static void main(String[] args) {
		// Policy:
		// 		flat:
		//   		tv
		//			notebook
		// 		house
		//			fridge
		//			tv

		SubInsuranceObject tv1 = new SubInsuranceObject("TV 1", new BigDecimal("100.00"), RiskType.FIRE);
		SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("700.00"), RiskType.FIRE, RiskType.THEFT);
		InsuranceObject flat = new InsuranceObject(tv1, notebook);

		SubInsuranceObject tv2 = new SubInsuranceObject("TV 1", new BigDecimal("100.00"), RiskType.FIRE);
		SubInsuranceObject fridge = new SubInsuranceObject("Fridge", new BigDecimal("700.00"), RiskType.THEFT);
		InsuranceObject house = new InsuranceObject(tv2, fridge);

		Policy policy = new Policy(flat, house);


	}

}
