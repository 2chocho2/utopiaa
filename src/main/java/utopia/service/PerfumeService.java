package utopia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import utopia.dto.BrandDto;
import utopia.dto.PerfumeDto;

@Service
public interface PerfumeService {

	List<PerfumeDto> selectPerfumeList() throws Exception;
	List<BrandDto> selectBrand(int brandId) throws Exception;
	List<BrandDto> selectBrandList() throws Exception;
	List<PerfumeDto> selectBrandPerfumeList(int brandId) throws Exception;
	
	
	public void updateThumbsCount(int perfumeId) throws Exception;
	
}
