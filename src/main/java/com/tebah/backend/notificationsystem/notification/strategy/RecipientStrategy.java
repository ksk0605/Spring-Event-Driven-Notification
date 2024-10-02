package com.tebah.backend.notificationsystem.notification.strategy;

import java.util.List;

import com.tebah.backend.notificationsystem.notification.domain.NotificationType;
import com.tebah.backend.notificationsystem.notification.domain.Recipient;

public interface RecipientStrategy {
	boolean support(NotificationType notificationType);

	List<Recipient> selectRecipients(NotificationType notificationType);
}
