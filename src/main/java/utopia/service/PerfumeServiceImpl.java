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
   private PerfumeMapper perfumeMapper;

   @Override
   public List<PerfumeDto> selectPerfumeList(int offset) throws Exception {
      return perfumeMapper.selectPerfumeList(offset);
   }
   
   @Override
   public int selectPerfumeListCount() throws Exception {
       return perfumeMapper.selectPerfumeListCount();
   }
   
   @Override
   public List<BrandDto> selectBrandList() throws Exception {
      return perfumeMapper.selectBrandList();
   }

   @Override
   public List<BrandDto> selectBrand(int brandId) throws Exception {
      return perfumeMapper.selectBrand(brandId);
   }

   @Override
   public List<PerfumeDto> selectBrandPerfumeList(int brandId) throws Exception {
      return perfumeMapper.selectBrandPerfumeList(brandId);
   }

   @Override
   public void updateThumbsCount(int perfumeId) throws Exception {
      perfumeMapper.updateThumbsCount(perfumeId);
   }

   @Override
   public List<String> selectCategoryByPerfumeId(int perfumeId) throws Exception {
      return perfumeMapper.selectCategoryByPerfumeId(perfumeId);
   }




}
