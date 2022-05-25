package teacher.lesson_x.login_service.solutions.super_task_1;

public class User {

	private static final int MAX_ATTEMPTS_COUNT = 3;

    private String login;
    private String password;
    private boolean blocked;
    private int attemptsLeft;

    public User(String login, String password){
        this.login = login;
        this.password = password;
        this.blocked = false;
        this.attemptsLeft = MAX_ATTEMPTS_COUNT;
    }

	public boolean isBlocked() {
		return blocked;
	}

	public void block(){
		this.blocked = true;
	}

	public void unblock() {
    	this.blocked = false;
    	this.attemptsLeft = MAX_ATTEMPTS_COUNT;
	}

	public int getAttemptsLeft() {
    	return this.attemptsLeft;
	}

	public boolean isPasswordEquals(String password) {
    	return this.password.equals(password);
	}

	public void reduceLoginAttempts() {
    	this.attemptsLeft--;
    	if (attemptsLeft <= 0) {
    		block();
		}
	}

}
