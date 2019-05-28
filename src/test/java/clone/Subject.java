package clone;

public class Subject {

	private String id;

	private String name;

	private String peoples;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPeoples() {
		return peoples;
	}

	public void setPeoples(String peoples) {
		this.peoples = peoples;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", peoples=" + peoples + "]";
	}

}
