package com.aabhas.cicd;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
@getmapping



@SpringBootApplication
@Restcontroller
public class GithubCicdActionsApplication {

        @getmapping('/welcome')
        public String welcome(){
			return "Welcome to aabhas !";
		}


//	echo "# github-actions-example" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Aabhas-sharma/github-actions-example.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}
