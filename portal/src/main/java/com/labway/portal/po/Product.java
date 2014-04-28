package com.labway.portal.po;

import java.io.Serializable;

public class Product implements Serializable{
private String name;
private String description;
private String x_reviewed;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getX_reviewed() {
	return x_reviewed;
}
public void setX_reviewed(String x_reviewed) {
	this.x_reviewed = x_reviewed;
}

}
