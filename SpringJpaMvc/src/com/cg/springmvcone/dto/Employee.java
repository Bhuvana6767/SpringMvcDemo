package com.cg.springmvcone.dto;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="employeemanagement")
public class Employee 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="emp_seq")
	@SequenceGenerator(name="emp_seq",sequenceName="emp_seq_eid")
	@Column(name="emp_id")
	private Integer empId;
	
	@Column(name="emp_name")
	@NotEmpty(message="Name should not be empty")
	private String empName;
	
	@Column(name="emp_deg")
	private String empDesignation;
	
	@Column(name="emp_sal")
	@NotNull(message="Salary should not be blank")
	private Double empSalary;
	
	@Column(name="emp_gen")
	private String empGender;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empDesignation=" + empDesignation + ", empSalary="
				+ empSalary + ", empGender=" + empGender + "]";
	}
	public Employee(Integer empId, String empName, String empDesignation,
			Double empSalary, String empGender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
		this.empGender = empGender;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
