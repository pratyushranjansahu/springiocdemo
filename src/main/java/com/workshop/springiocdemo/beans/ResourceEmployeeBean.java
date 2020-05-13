package com.workshop.springiocdemo.beans;

import javax.annotation.Resource;

public class ResourceEmployeeBean {
	private String id;
    private String name;
    @Resource(name="mycompany")
    private ResourceCompanyBean resourceCompanyBean;

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ResourceEmployeeBean [id=" + id + ", name=" + name + ", resourceCompanyBean=" + resourceCompanyBean
				+ "]";
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

	public ResourceCompanyBean getResourceCompanyBean() {
		return resourceCompanyBean;
	}

	public void setResourceCompanyBean(ResourceCompanyBean resourceCompanyBean) {
		this.resourceCompanyBean = resourceCompanyBean;
	}
    
}
