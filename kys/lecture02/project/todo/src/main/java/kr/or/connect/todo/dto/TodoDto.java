package kr.or.connect.todo.dto;

public class TodoDto {
	private String title;
	private String name;
	private Integer sequence;
	private String type;
	private String regdate;
	
	public TodoDto(String title, String name, Integer sequence, String type, String regdate) {
		super();
		this.title = title;
		this.name = name;
		this.sequence = sequence;
		this.type = type;
		this.regdate = regdate;
	}
	
	public TodoDto(String title, String name, Integer sequence) {
		super();
		this.title = title;
		this.name = name;
		this.sequence = sequence;
	}
	
	public TodoDto(String title, String type) {
		super();
		this.title = title;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "TodoDto [title=" + title + ", name=" + name + ", sequence=" + sequence + ", type=" + type + ", regdate="
				+ regdate + "]";
	}
	
	
}
