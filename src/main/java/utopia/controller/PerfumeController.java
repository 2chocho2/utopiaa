package utopia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import utopia.dto.BrandDto;
import utopia.dto.PerfumeDto;
import utopia.service.PerfumeService;

@Controller
public class PerfumeController {

	@Autowired
	private PerfumeService perfumeService ;
	
	//브랜드를 클릭했을때, 전체 향수 리스트를 출력
	
	// 각각의(5개) 브랜드를 클릭했을때, 그 브랜드별 향수 리스트를 출력 
	@GetMapping("/utopia/perfume")	
	public ModelAndView perfume(@RequestParam(value = "brandId", required = false, defaultValue = "0") int brandId) throws Exception {
		ModelAndView mv = new ModelAndView("perfume.html");
		
		if (brandId == 0) {
			List<PerfumeDto> list = perfumeService.selectPerfumeList();
			mv.addObject("perfumeList", list);
		} else {
			List<PerfumeDto> list = perfumeService.selectBrandPerfumeList(brandId);
			mv.addObject("perfumeList", list);
		}
		
		
		
		List<BrandDto> brandDto = perfumeService.selectBrandList();
		mv.addObject("brandlist", brandDto);
		
		
		return mv;
	}
	
	@PostMapping("/utopia/updateThumbsCount.do")
	public String updateHitCount(int perfumeId) throws Exception {
		perfumeService.updateHitCount(perfumeId);
		return "redirect:/utopia/perfume";
	}
	
	
	
	
	
	
	
//
//	@GetMapping("/utopia/getPerfume")
//	public ModelAndView getPerfume(@RequestParam int brandId) throws Exception{
//		ModelAndView mv = new ModelAndView ("perfume.html");
//		
//		List<PerfumeDto> list = perfumeService.selectPerfumeList();
//		mv.addObject("list", list);		
//		
//		
//		
//		return mv;
//		
//		
//	}
	
	
}

