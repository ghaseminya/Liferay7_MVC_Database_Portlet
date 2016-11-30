package ir.mnm.liferay.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ir.mnm.liferay.model.User;

@Service
public class HelloService {

    private static final Log LOGGER = LogFactory.getLog(HelloService.class);
    
	public void sayHelloToTheLogs(User user) {

		if (user != null) {
			LOGGER.info("Hello " + user.getFirstName());
		}
	}
}
