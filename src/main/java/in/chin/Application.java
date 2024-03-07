package in.chin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.chin.Entity.Book;
import in.chin.Entity.BookRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(Application.class, args);
		
		BookRepo repo=ctxt.getBean(BookRepo.class);
		
		Book b=new Book();
		b.setBookName("Java");
		b.setBookPrice(1200.02);
		
		repo.save(b);
	}

}
