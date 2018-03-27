package website.core;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public abstract class AbstractWebSite {

	protected String server;
	protected int port;
	protected Region region;
	protected Location location;
	protected Owner owner;

	/**
	 * 
	 */
	public AbstractWebSite() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param server
	 * @param port
	 * @param region
	 * @param location
	 * @param owner
	 */
	public AbstractWebSite(String server, int port, Region region, Location location, Owner owner) {
		super();
		this.server = server;
		this.port = port;
		this.region = region;
		this.location = location;
		this.owner = owner;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
