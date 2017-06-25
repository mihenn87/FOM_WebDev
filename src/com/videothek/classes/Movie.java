package com.videothek.classes;

import java.util.Date;

public class Movie {
	private String dtTitle;
	private String orgTitle;
	private Date publishDate;
	private String imdbId;
	
	public Movie(String dtTitle, String orgTitle, Date publishDate, String imdbId) {
		super();
		this.dtTitle = dtTitle;
		this.orgTitle = orgTitle;
		this.publishDate = publishDate;
		this.imdbId = imdbId;
	}

	public String getDtTitle() {
		return dtTitle;
	}

	public void setDtTitle(String dtTitle) {
		this.dtTitle = dtTitle;
	}

	public String getOrgTitle() {
		return orgTitle;
	}

	public void setOrgTitle(String orgTitle) {
		this.orgTitle = orgTitle;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	
	
	
}
