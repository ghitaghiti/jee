package model;


public class Task {
    private String name;
    private int id;
    private String label;
    private Boolean completed;
   
    

    public Task(int id, String label) {
		super();
		this.id = id;
		this.label = label;
		this.completed = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}