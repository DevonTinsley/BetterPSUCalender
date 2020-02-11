/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.json.JSONObject;

/**
 *
 * @author johnk
 */
public class Event {
    private String title;

    public Event(JSONObject json) {
       this.title = json.get("title").toString();
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
