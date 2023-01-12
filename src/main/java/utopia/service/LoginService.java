package utopia.service;

import utopia.dto.LoginDto;
import utopia.dto.MemberDto;

public interface LoginService {
	public MemberDto login(LoginDto loginDto) throws Exception;
}
