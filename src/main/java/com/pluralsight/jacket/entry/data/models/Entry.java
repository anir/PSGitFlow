package com.pluralsight.jacket.entry.data.models;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "entries")
public class Entry extends BaseModel {

<<<<<<< HEAD
    // fields used by the databases
=======
    // needed for authentication
>>>>>>> release/sprint2-release
    private String url;
    private String title;

    public String getUrl() {
	return url;
    }
    public void setUrl(String url) {
	this.url = url;
    }
    public String getTitle() {
	return title;
    }
    public void setTitle(String title) {
	this.title = title;
    }
}
