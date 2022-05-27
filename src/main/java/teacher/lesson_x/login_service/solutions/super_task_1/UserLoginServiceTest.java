package teacher.lesson_x.login_service.solutions.super_task_1;

public class UserLoginServiceTest {

	public static void main(String[] args) {
		UserLoginServiceTest test = new UserLoginServiceTest();
		test.shouldSuccessfullyLogin();
		test.shouldLoginFail_attempts_2();
		test.shouldLoginFail_attempts_1();
		test.shouldLoginFail_attempts_0();
		test.shouldSetAttemptsLeftTo3AfterSuccessfulLogin();
	}

	public void shouldSuccessfullyLogin() {
		UserLoginService service = new UserLoginService();
		User user = new User("javaguru", "abcd");
		boolean loginSuccessfully = service.login(user, "abcd");
		checkResults(loginSuccessfully, "shouldSuccessfullyLogin");
		checkResults(!user.isBlocked(), "shouldSuccessfullyLogin");
	}

	public void shouldLoginFail_attempts_2() {
		UserLoginService service = new UserLoginService();
		User user = new User("javaguru", "abcd");
		boolean loginSuccessfully = service.login(user, "incorrect password");
		checkResults(!loginSuccessfully, "shouldLoginFail_attempts_2");
		checkResults(user.getAttemptsLeft() == 2, "shouldLoginFail_attempts_2");
		checkResults(!user.isBlocked(), "shouldLoginFail_attempts_2");
	}

	public void shouldLoginFail_attempts_1() {
		UserLoginService service = new UserLoginService();
		User user = new User("javaguru", "abcd");
		service.login(user, "incorrect password");
		boolean loginSuccessfully = service.login(user, "incorrect password");
		checkResults(!loginSuccessfully, "shouldLoginFail_attempts_1");
		checkResults(user.getAttemptsLeft() == 1, "shouldLoginFail_attempts_1");
		checkResults(!user.isBlocked(), "shouldLoginFail_attempts_1");
	}

	public void shouldLoginFail_attempts_0() {
		UserLoginService service = new UserLoginService();
		User user = new User("javaguru", "abcd");
		service.login(user, "incorrect password");
		service.login(user, "incorrect password");
		boolean loginSuccessfully = service.login(user, "incorrect password");
		checkResults(!loginSuccessfully, "shouldLoginFail_attempts_0");
		checkResults(user.getAttemptsLeft() == 0, "shouldLoginFail_attempts_0");
		checkResults(user.isBlocked(), "shouldLoginFail_attempts_0");
	}

	public void shouldSetAttemptsLeftTo3AfterSuccessfulLogin() {
		UserLoginService service = new UserLoginService();
		User user = new User("javaguru", "abcd");
		service.login(user, "incorrect password");
		service.login(user, "incorrect password");
		checkResults(user.getAttemptsLeft() == 1, "shouldSetAttemptsLeftTo3AfterSuccessfulLogin");
		boolean loginSuccessfully = service.login(user, "abcd");
		checkResults(loginSuccessfully, "shouldSetAttemptsLeftTo3AfterSuccessfulLogin");
		checkResults(user.getAttemptsLeft() == 3, "shouldSetAttemptsLeftTo3AfterSuccessfulLogin");
		checkResults(!user.isBlocked(), "shouldSetAttemptsLeftTo3AfterSuccessfulLogin");
	}

	private void checkResults(boolean condition, String testName) {
		if (condition) {
			System.out.println(testName + " = OK");
		} else {
			System.out.println(testName + " = FAIL");
		}
	}

}
