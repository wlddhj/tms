/**
 * 
 */
package com.hhz.tms.entity.sys;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.hhz.tms.entity.IdEntity;

/**
 * @author huangjian
 * 
 */
@Entity
@Table(name = "t_sys_dept")
public class Dept extends IdEntity {
	private String deptName;
	private BigDecimal dispOrderNo;
	private Boolean enableFlg;
	private Dept parent;
	private List<Dept> children;
	private List<User> users;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Column(precision = 12, scale = 0)
	public BigDecimal getDispOrderNo() {
		return dispOrderNo;
	}

	public void setDispOrderNo(BigDecimal dispOrderNo) {
		this.dispOrderNo = dispOrderNo;
	}
	@JsonSerialize(using=ToStringSerializer.class)
	public Boolean getEnableFlg() {
		return enableFlg;
	}

	public void setEnableFlg(Boolean enableFlg) {
		this.enableFlg = enableFlg;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	public Dept getParent() {
		return parent;
	}

	public void setParent(Dept parent) {
		this.parent = parent;
	}
	@OneToMany(mappedBy = "dept")
	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}

	@OneToMany(mappedBy = "parent")
	public List<Dept> getChildren() {
		return children;
	}

	public void setChildren(List<Dept> children) {
		this.children = children;
	}
}
