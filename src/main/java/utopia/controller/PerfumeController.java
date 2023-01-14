package utopia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import utopia.dto.PerfumeDto;
import utopia.service.PerfumeService;

@Controller
public class PerfumeController {

	@Autowired
	private PerfumeService perfumeService ;
	
	@GetMapping("/utopia/perfume")
	public ModelAndView perfume() throws Exception {
		ModelAndView mv = new ModelAndView("perfume.html");
		
		List<PerfumeDto> list = perfumeService.selectPerfumeList();
		mv.addObject("list", list);		
		return mv;
	}
	@GetMapping("/utopia/perfume/jomalone")
	public ModelAndView perfumeJomalone() throws Exception {
		ModelAndView mv = new ModelAndView("perfume.html");
		
		List<PerfumeDto> list = perfumeService.selectPerfumeList();
		mv.addObject("list", list);		
		return mv;
	}
	
}