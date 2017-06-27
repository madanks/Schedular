package com.madan.scheduler.dto;

public class TestDTO {

	private int id;
	private String name;

	public TestDTO() {

	}

	public TestDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestDTO [id=" + id + ", name=" + name + "]";
	}

}
