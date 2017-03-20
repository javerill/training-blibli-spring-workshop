package org.binus.intern.dto;

import java.io.Serializable;

public class HelloWorldDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String title;
    
    public HelloWorldDTO()
    {
    	
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
}
