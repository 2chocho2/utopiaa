package utopia.service;

import java.util.List;

import utopia.dto.BrandDto;
import utopia.dto.PerfumeDto;

public interface PerfumeService {

	List<PerfumeDto> selectPerfumeList() throws Exception;
	List<BrandDto> selectBrand(int brandId) throws Exception;
	List<BrandDto> selectBrandList() throws Exception;
	List<PerfumeDto> selectBrandPerfumeList(int brandId) throws Exception;
	
	void updateHitCount(int perfumeId) throws Exception;
	
}
