package teacher.lesson_x.insurance_policy.solutions.v4.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import teacher.lesson_x.insurance_policy.solutions.v4.domain.InsuranceRisk;
import teacher.lesson_x.insurance_policy.solutions.v4.domain.SubInsuranceObject;

public class SubInsuranceObjectBuilder {

	private String name;
	private BigDecimal price;
	private List<InsuranceRisk> insuranceRisks = new ArrayList<>();

	public static SubInsuranceObjectBuilder createSubInsuranceObject() {
		return new SubInsuranceObjectBuilder();
	}

	private SubInsuranceObjectBuilder() {

	}

	public SubInsuranceObject build() {
		SubInsuranceObject subInsuranceObject = new SubInsuranceObject(name, price);
		insuranceRisks.forEach(insuranceRisk -> subInsuranceObject.addInsuranceRisk(insuranceRisk));
		return subInsuranceObject;
	}

	public SubInsuranceObjectBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public SubInsuranceObjectBuilder withPrice(BigDecimal price) {
		this.price = price;
		return this;
	}

	public SubInsuranceObjectBuilder withRisk(InsuranceRisk insuranceRisk) {
		this.insuranceRisks.add(insuranceRisk);
		return this;
	}

}
