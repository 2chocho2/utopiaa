package utopia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import utopia.dto.BrandDto;
import utopia.dto.PerfumeDto;
import utopia.mapper.PerfumeMapper;



@Service
public class PerfumeServiceImpl implements PerfumeService {
	
	// 제품조회
	@Autowired
	private PerfumeMapper productMapper;

	@Override
	public List<PerfumeDto> selectPerfumeList() throws Exception {
		return productMapper.selectPerfumeList();
	}

	@Override
	public List<BrandDto> selectBrandList() throws Exception {
		return productMapper.selectBrandList();
	}

	@Override
	public List<BrandDto> selectBrand(int brandId) throws Exception {
		return productMapper.selectBrand(brandId);
	}
	}

