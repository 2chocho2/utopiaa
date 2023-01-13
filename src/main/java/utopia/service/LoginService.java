package utopia.service;


import org.springframework.stereotype.Service;

import utopia.dto.LoginDto;
import utopia.dto.MemberDto;

@Service
public interface LoginService {
	public MemberDto login(LoginDto loginDto) throws Exception;

	public void memberInsert(MemberDto memberDto)throws Exception;
}
