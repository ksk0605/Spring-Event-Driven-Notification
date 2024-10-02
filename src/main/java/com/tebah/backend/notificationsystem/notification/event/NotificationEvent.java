package com.tebah.backend.notificationsystem.notification.event;

import com.tebah.backend.notificationsystem.notification.domain.NotificationType;
import com.tebah.backend.notificationsystem.notification.domain.Sender;

import lombok.Builder;
import lombok.Getter;

@Getter
public class NotificationEvent {
	NotificationType notificationType;
	String prefix;
	Sender sender;

	@Builder
	public NotificationEvent(NotificationType notificationType, String prefix, Sender sender) {
		this.notificationType = notificationType;
		this.prefix = prefix;
		this.sender = sender;
	}

	@Override
	public String toString() {
		return "NotificationEvent{" +
			"notificationType=" + notificationType +
			", prefix='" + prefix + '\'' +
			", sender=" + sender +
			'}';
	}
}
