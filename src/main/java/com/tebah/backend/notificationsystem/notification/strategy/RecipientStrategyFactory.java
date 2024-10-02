package com.tebah.backend.notificationsystem.notification.strategy;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tebah.backend.notificationsystem.notification.domain.NotificationType;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class RecipientStrategyFactory {

	private final List<RecipientStrategy> recipientStrategies;

	public RecipientStrategy getStrategy(NotificationType notificationType) {
		return recipientStrategies.stream()
			.filter(recipientStrategy -> recipientStrategy.support(notificationType))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("not found notification type"));
	}
}
