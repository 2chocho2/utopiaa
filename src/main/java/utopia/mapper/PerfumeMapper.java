package utopia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import utopia.dto.BrandDto;
import utopia.dto.PerfumeDto;


@Mapper
public interface PerfumeMapper {
	List<PerfumeDto> selectPerfumeList() throws Exception;
	List<BrandDto> selectBrandList() throws Exception;
	List<BrandDto> selectBrand(int brandId) throws Exception;
	List<PerfumeDto> selectBrandPerfumeList(int brandId) throws Exception;
	
	void updateHitCount(int perfumeId) throws Exception;
	
	
	
}
