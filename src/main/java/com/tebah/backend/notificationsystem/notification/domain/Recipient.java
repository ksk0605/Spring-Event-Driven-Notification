package com.tebah.backend.notificationsystem.notification.domain;

import java.util.List;

public class Recipient {
	private List<String> tokens;

	public Recipient(List<String> tokens) {
		this.tokens = tokens;
	}
}
