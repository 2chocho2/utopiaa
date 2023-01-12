package utopia.mapper;

import utopia.dto.LoginDto;
import utopia.dto.MemberDto;

public interface LoginMapper {
	MemberDto login(LoginDto loginDto) throws Exception;
	MemberDto memberInsert(MemberDto memberDto) throws Exception;
}
