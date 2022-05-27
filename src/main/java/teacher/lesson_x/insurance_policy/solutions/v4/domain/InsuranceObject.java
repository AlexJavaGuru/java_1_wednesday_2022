package teacher.lesson_x.insurance_policy.solutions.v4.domain;

import java.util.ArrayList;
import java.util.List;

public class InsuranceObject {

	private List<SubInsuranceObject> subInsuranceObjects;

	public InsuranceObject() {
		this.subInsuranceObjects = new ArrayList<>();
	}

	public void addSubInsuranceObject(SubInsuranceObject subInsuranceObject) {
		this.subInsuranceObjects.add(subInsuranceObject);
	}

	public List<SubInsuranceObject> getSubInsuranceObjects() {
		return subInsuranceObjects;
	}

}
