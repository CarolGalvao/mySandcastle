package com.carol.mySandcastle;

import com.carol.mySandcastle.utils.SenhaUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class MySandcastleApplication {

	@Value("${pagination.amount_per_page}")
	private int amoutPerPage;

	public static void main(String[] args) {
		SpringApplication.run(MySandcastleApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("***** Quantidade de elementos por página = " + this.amoutPerPage);

			String passwordEncoded = SenhaUtils.geraBCrypt("1234");
			System.out.println("Senha encoded: " + passwordEncoded);

			String passwordEncoded2 = SenhaUtils.geraBCrypt("1234");
			System.out.println("Senha encoded 2.0: " + passwordEncoded2);

			System.out.println("Senha válida " + SenhaUtils.passwordValidation("1234", passwordEncoded));

		};
	}

}
