package utopia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import utopia.dto.BrandDto;
import utopia.dto.PerfumeDto;


@Mapper
public interface PerfumeMapper {
   int selectPerfumeListCount() throws Exception;
   List<PerfumeDto> selectPerfumeList(int offset) throws Exception;
   List<BrandDto> selectBrandList() throws Exception;
   List<BrandDto> selectBrand(int brandId) throws Exception;
   List<PerfumeDto> selectBrandPerfumeList(int brandId) throws Exception;   
   public void updateThumbsCount(int perfumeId) throws Exception;
   List<String> selectCategoryByPerfumeId(int perfumeId) throws Exception;

}