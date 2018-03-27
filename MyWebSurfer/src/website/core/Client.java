package website.core;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class Client {

	private User user;
	private Machine machine;

	/**
	 * 
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param user
	 * @param machine
	 */
	public Client(User user, Machine machine) {
		super();
		this.user = user;
		this.machine = machine;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

}
