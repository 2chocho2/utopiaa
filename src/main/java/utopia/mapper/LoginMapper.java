package utopia.mapper;

import utopia.dto.LoginDto;
import utopia.dto.MemberDto;

public interface LoginMapper {
	public MemberDto login(LoginDto loginDto) throws Exception;
}
