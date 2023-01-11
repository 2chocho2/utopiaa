package utopia.dto;

import lombok.Data;

@Data
public class MemberDto {
	private int MemberId;
	private String MemberName;
	private String MemberPw;
	private String MemberEmail;
}
