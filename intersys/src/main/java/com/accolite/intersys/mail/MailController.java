package com.accolite.intersys.mail;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


	

	@RestController
	public class MailController {

		@Autowired
		private MailService notificationService;

		

		
		@RequestMapping("/hr/send-mail")
		public String send(@RequestParam("interviewer_mail") String interviewer_mail, @RequestParam("hr_mail")  String hr_mail,
				@RequestParam("candidate_mail")  String candidate_mail, @RequestParam("gmeet_link")  String gmeet_link,	HttpServletRequest request) {
         
			try {
				notificationService.sendEmail(hr_mail,interviewer_mail,gmeet_link);
				notificationService.sendEmail(hr_mail, candidate_mail,gmeet_link);
			} catch (MailException mailException) {
				System.out.println(mailException);
			}
			return "Mails have been sent to interviewer and candidate";
		}

	
	
	
}