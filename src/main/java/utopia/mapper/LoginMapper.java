package utopia.mapper;

import org.apache.ibatis.annotations.Mapper;

import utopia.dto.LoginDto;
import utopia.dto.MemberDto;

@Mapper
public interface LoginMapper {
	public MemberDto login(LoginDto loginDto) throws Exception;
	void memberInsert(MemberDto memberDto) throws Exception;
}
