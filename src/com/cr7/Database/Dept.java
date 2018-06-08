package com.cr7.Database;

import java.io.Serializable;

/**
 * @author Kishon
 *
 */
public class Dept implements Serializable {
	private int deptNo;
	private String dName;
	private String loc;

	/**
	 * @return the deptNo
	 */
	public int getDeptNo() {
		return deptNo;
	}

	/**
	 * @param deptNo
	 *            the deptNo to set
	 */
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	/**
	 * @return the dName
	 */
	public String getdName() {
		return dName;
	}

	/**
	 * @param dName
	 *            the dName to set
	 */
	public void setdName(String dName) {
		this.dName = dName;
	}

	/**
	 * @return the loc
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * @param loc
	 *            the loc to set
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}

}
