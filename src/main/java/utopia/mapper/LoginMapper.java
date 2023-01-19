package utopia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import utopia.dto.LoginDto;
import utopia.dto.MemberDto;
import utopia.dto.PerfumeDto;

@Mapper
public interface LoginMapper {
	public MemberDto login(LoginDto loginDto) throws Exception;
	void memberInsert(MemberDto memberDto) throws Exception;
	//  메인 베스트 셀러
	List<PerfumeDto> selectPerfumeBest() throws Exception;
}
