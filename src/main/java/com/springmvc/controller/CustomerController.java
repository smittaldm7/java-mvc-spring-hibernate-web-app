package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvc.dao.CustomerDao;
import com.springmvc.model.Customer;

@Controller
public class CustomerController {

	@GetMapping("/customer/add")
	public String add()
	{
		return "customer/add";
	}
	
	@PostMapping("/customer/create")
    public String addCustomer(@Validated Customer customer, Model model) {
		
		CustomerDao customerDAO = new CustomerDao();
		customerDAO.create(customer);
		customerDAO.create2(customer);
		
		
		//Customer customer2 = new Customer("loftus-cheek",28);
		//customerDAO.create(customer2);
		return "customer/added";
		
		
    }
	
	@GetMapping("/customer/getdetails")
	public String getDetails()
	{
		return "customer/getDetails";
	}
	
	@PostMapping("/customer/displaydetails")
	public String getCustomer(HttpServletRequest request,Model model)
	{
		CustomerDao customerDAO = new CustomerDao();
		//System.out.println(request.getParameter("id"));
		 //java.lang.System.exit(1) ;
		Customer customer = customerDAO.findByCustomerId(Integer.parseInt(request.getParameter("id")));
		model.addAttribute(customer);
		
		return "customer/display";
	}
}
