package com.tebah.backend.notificationsystem.notification;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tebah.backend.notificationsystem.api.DarakbangMember;
import com.tebah.backend.notificationsystem.api.MoimService;
import com.tebah.backend.notificationsystem.notification.event.NotificationEvent;

@SpringBootTest
class NotificationManagerTest {

	@Autowired
	MoimService moimService;

	@Autowired
	private NotificationManager notificationManager;

	@DisplayName("알림 이벤트 수신")
	@Test
	void listenEvent() {
		// given
		long moimId = 1L;
		String moimName = "test moim";
		DarakbangMember darakbangMember = new DarakbangMember(1L, 2L, 3L, "tebah", "MANAGER");

		// when
		moimService.createMoim(moimId, moimName, darakbangMember);

		// then
	}

}
