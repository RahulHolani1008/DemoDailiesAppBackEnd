package com.genesis.Dailies.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Class")
public class ClassEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "teacherid")
	private int teacherId;
	
	@Column(name = "classname")
	private String className;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "starttime")
	private String startTime;
	
	@Column(name = "endtime")
	private String endTime ; 
	
	@Column(name = "daysofweek")
	private String daysOfWeek;
	
	@Column(name = "countofstudent")
	private int countOfStudent;

	public int getCountOfStudent() {
		return countOfStudent;
	}

	public void setCountOfStudent(int countOfStudent) {
		this.countOfStudent = countOfStudent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(String daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}
	
	
}
