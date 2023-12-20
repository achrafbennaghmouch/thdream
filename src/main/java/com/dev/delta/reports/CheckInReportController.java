package com.dev.delta.reports;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckInReportController {

	@GetMapping("/checkinreport")
	public String getCitys(Model model) {

		return "city/cities";
	}
}
