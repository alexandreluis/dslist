package com.devsuperior.dslist.dto;


import com.devsuperior.dslist.entities.GameList;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class GameListDTO 
{
	private Long id;
	private String name;
	
	
	public GameListDTO() {}
	
	public GameListDTO(GameList entity)
	{
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
