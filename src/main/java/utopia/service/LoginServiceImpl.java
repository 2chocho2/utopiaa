package utopia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import utopia.dto.LoginDto;
import utopia.dto.MemberDto;
import utopia.mapper.LoginMapper;


@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;
	
	
	@Override
	public MemberDto login(LoginDto loginDto) throws Exception {
		return loginMapper.login(loginDto);
	}
	
	@Override
	public void memberInsert(MemberDto memberDto) throws Exception {

		loginMapper.memberInsert(memberDto);
	}
}
