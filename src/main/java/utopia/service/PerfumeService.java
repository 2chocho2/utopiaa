package utopia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import utopia.dto.BrandDto;
import utopia.dto.PerfumeDto;

@Service
public interface PerfumeService {

   int selectPerfumeListCount() throws Exception;
   List<PerfumeDto> selectPerfumeList(int offset) throws Exception;
   List<BrandDto> selectBrandList() throws Exception;
   List<BrandDto> selectBrand(int brandId) throws Exception;
   List<PerfumeDto> selectBrandPerfumeList(int brandId) throws Exception;   
   public void updateThumbsCount(int perfumeId) throws Exception;
   List<String> selectCategoryByPerfumeId(int perfumeId) throws Exception;
}