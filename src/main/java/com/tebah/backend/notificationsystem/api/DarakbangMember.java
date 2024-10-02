package com.tebah.backend.notificationsystem.api;

import lombok.Builder;
import lombok.Getter;

@Getter
public class DarakbangMember {

	private Long id;
	private long darakbangId;
	private Long memberId;
	private String nickname;
	private String role;

	@Builder
	public DarakbangMember(Long id, long darakbangId, Long memberId, String nickname, String role) {
		this.id = id;
		this.darakbangId = darakbangId;
		this.memberId = memberId;
		this.nickname = nickname;
		this.role = role;
	}
}
