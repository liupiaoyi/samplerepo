package work.pojo;

public class Student {
	private Integer id;
	private String name;
	private double scope;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScope() {
		return scope;
	}
	public void setScope(double scope) {
		this.scope = scope;
	}
	public Student() {
		super();
	}
	public Student(Integer id, String name, double scope) {
		super();
		this.id = id;
		this.name = name;
		this.scope = scope;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", scope=" + scope + "]";
	}

}
