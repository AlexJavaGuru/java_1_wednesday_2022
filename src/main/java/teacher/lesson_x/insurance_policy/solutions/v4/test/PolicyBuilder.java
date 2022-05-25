package teacher.lesson_x.insurance_policy.solutions.v4.test;

import java.util.ArrayList;
import java.util.List;

import teacher.lesson_x.insurance_policy.solutions.v4.domain.InsuranceObject;
import teacher.lesson_x.insurance_policy.solutions.v4.domain.Policy;

public class PolicyBuilder {

	private List<InsuranceObject> insuranceObjects = new ArrayList<>();

	public static PolicyBuilder createPolicy() {
		return new PolicyBuilder();
	}

	private PolicyBuilder() { }

	public Policy build() {
		Policy policy = new Policy();
		insuranceObjects.forEach(insuranceObject -> policy.addInsuranceObject(insuranceObject));
		return policy;
	}

	public PolicyBuilder with(InsuranceObject insuranceObject) {
		this.insuranceObjects.add(insuranceObject);
		return this;
	}

}