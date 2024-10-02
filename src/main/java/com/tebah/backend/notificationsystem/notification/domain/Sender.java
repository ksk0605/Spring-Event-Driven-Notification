package com.tebah.backend.notificationsystem.notification.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Sender {

	private long memberId;
	private long darakbangMemberId;
	private String nickname;

	@Builder
	public Sender(long memberId, long darakbangMemberId, String nickname) {
		this.memberId = memberId;
		this.darakbangMemberId = darakbangMemberId;
		this.nickname = nickname;
	}
}
