package teacher.lesson_x.insurance_policy.solutions.v4.domain;

import java.util.ArrayList;
import java.util.List;

public class Policy {

	private List<InsuranceObject> insuranceObjects = new ArrayList<>();

	public void addInsuranceObject(InsuranceObject insuranceObject) {
		this.insuranceObjects.add(insuranceObject);
	}

	public List<InsuranceObject> getInsuranceObjects() {
		return this.insuranceObjects;
	}

}
