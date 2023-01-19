package utopia.service;


import java.util.List;

import org.springframework.stereotype.Service;

import utopia.dto.LoginDto;
import utopia.dto.MemberDto;
import utopia.dto.PerfumeDto;

@Service
public interface LoginService {
	public MemberDto login(LoginDto loginDto) throws Exception;

	public void memberInsert(MemberDto memberDto)throws Exception;
	
	// 메인 베스트 셀러
	List<PerfumeDto> selectPerfumeBest() throws Exception;
}
