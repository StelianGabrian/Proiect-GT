package com.digitalnation.StelianGabrian.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Chestionar {
    public Chestionar() {
    }

    @Id
    private String name;
    private String email;
    private String comments;
    private Boolean likedSite;
    
	public Chestionar(String name, String email, String comments, Boolean likedSite) {
		super();
		this.name = name;
		this.email = email;
		this.comments = comments;
		this.likedSite = likedSite;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Boolean getLikedSite() {
		return likedSite;
	}

	public void setLikedSite(Boolean likedSite) {
		this.likedSite = likedSite;
	}
}
