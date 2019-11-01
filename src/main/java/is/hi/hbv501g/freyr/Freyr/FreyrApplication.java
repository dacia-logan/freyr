package is.hi.hbv501g.freyr.Freyr;

import is.hi.hbv501g.freyr.Freyr.Controllers.userController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableJpaRepositories

public class FreyrApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreyrApplication.class, args);
		//userController.prufa();
	}

}
