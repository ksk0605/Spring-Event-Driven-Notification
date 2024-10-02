package com.tebah.backend.notificationsystem.api;

import lombok.Getter;

@Getter
public class Moim {
	private long id;
	private String name;

	public Moim(long id, String name) {
		this.id = id;
		this.name = name;
	}
}
