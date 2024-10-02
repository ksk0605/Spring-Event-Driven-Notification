package com.tebah.backend.notificationsystem.notification.channel;

import com.tebah.backend.notificationsystem.notification.domain.NotificationType;
import com.tebah.backend.notificationsystem.notification.event.NotificationEvent;

public interface NotificationChannel {
	boolean support(NotificationType notificationType);

	void send(NotificationEvent notificationEvent);
}
