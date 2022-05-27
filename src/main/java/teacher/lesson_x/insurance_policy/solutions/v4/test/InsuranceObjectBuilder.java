package teacher.lesson_x.insurance_policy.solutions.v4.test;

import java.util.ArrayList;
import java.util.List;

import teacher.lesson_x.insurance_policy.solutions.v4.domain.InsuranceObject;
import teacher.lesson_x.insurance_policy.solutions.v4.domain.SubInsuranceObject;

public class InsuranceObjectBuilder {

	private List<SubInsuranceObject> subInsuranceObjects = new ArrayList<>();

	public static InsuranceObjectBuilder createInsuranceObject() {
		return new InsuranceObjectBuilder();
	}

	private InsuranceObjectBuilder() { }

	public InsuranceObject build() {
		InsuranceObject insuranceObject = new InsuranceObject();
		subInsuranceObjects.forEach(subInsuranceObject -> insuranceObject.addSubInsuranceObject(subInsuranceObject));
		return insuranceObject;
	}

	public InsuranceObjectBuilder with(SubInsuranceObject subInsuranceObject) {
		this.subInsuranceObjects.add(subInsuranceObject);
		return this;
	}

}
