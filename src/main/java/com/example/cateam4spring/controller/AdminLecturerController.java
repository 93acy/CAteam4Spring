package com.example.cateam4spring.controller;

import com.example.cateam4spring.model.Lecturer;
import com.example.cateam4spring.model.Role;
import com.example.cateam4spring.repo.LecturerRepository;
import com.example.cateam4spring.repo.RoleRepository;
import com.example.cateam4spring.service.AdminLecturerService;
import com.example.cateam4spring.service.EnrolmentService;
import com.example.cateam4spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value="/admin_lecturer")
public class AdminLecturerController {
	
	@Autowired
	private AdminLecturerService alservice;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Autowired RoleRepository rrepo;
	
	@Autowired LecturerRepository lrepo;
	
	@RequestMapping("/new")
	public String showNewLecturerPage(Model model) {
	    Lecturer lecturer = new Lecturer();
	    model.addAttribute("lecturer", lecturer);
	    return "Admin/new_lecturer";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveLecturer(@ModelAttribute("lecturer") Lecturer lecturer) {
		String hashedPassword = passwordEncoder.encode(lecturer.getPassword());
		lecturer.setPassword(hashedPassword);
		alservice.save(lecturer);
	    Role lecturerRole = rrepo.findRoleByName("LECTURER");
	    lecturer.getRoles().add(lecturerRole);
	    lrepo.save(lecturer);
	    return "redirect:/admin_home/lecturer";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditLecturerPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("Admin/edit_lecturer");
	    Lecturer lecturer = alservice.get(id);
	    mav.addObject("lecturer", lecturer);
	     
	    return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
	    alservice.delete(id);
	    return "redirect:/admin_home/lecturer";       
	}

	@RequestMapping("/viewLecturers")
	public String listLecturers(Model model, String keyword) {
		List<Lecturer> listLecturers = alservice.listAll();

		if(keyword !=null) {
			model.addAttribute("listLecturers", alservice.lecturerFindByKeyword(keyword));
		}
		else {
			model.addAttribute("listLecturers", listLecturers);
		}
		return "Admin/admin_lecturer";
	}

	
}


