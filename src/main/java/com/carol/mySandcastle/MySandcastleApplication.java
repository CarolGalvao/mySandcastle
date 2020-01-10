package com.carol.mySandcastle;

import com.carol.mySandcastle.entities.Company;
import com.carol.mySandcastle.repositories.CompanyRepository;
import com.carol.mySandcastle.utils.SenhaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class MySandcastleApplication {

	@Autowired
	private CompanyRepository companyRepository;

	public static void main(String[] args) {
		SpringApplication.run(MySandcastleApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			Company company = new Company();
			company.setCompanyName("Castle Builders");
			company.setCnpj("00000000001");

			this.companyRepository.save(company);

			List<Company> companyList = companyRepository.findAll();
			companyList.forEach(System.out::println);

			Company companyId = companyRepository.findFirstById(1L);
			System.out.println("Empresa por ID:" + companyId);

			companyId.setCompanyName("Carol's Castle");
			this.companyRepository.save(companyId);

			Company companyCnpj = companyRepository.findByCnpj("00000000001");
			System.out.println("Empresa por CNPJ: " + companyCnpj);

			this.companyRepository.deleteById(1L);
			companyList = companyRepository.findAll();
			System.out.println("Empresas: " + companyList);
		};
	}

// Aulas sobre properties e suas utilidades:
//	@Value("${pagination.amount_per_page}")
//	private int amoutPerPage;
//
//	public static void main(String[] args) {
//		SpringApplication.run(MySandcastleApplication.class, args);
//	}
//
//	@Bean
//	public CommandLineRunner commandLineRunner() {
//		return args -> {
//			System.out.println("***** Quantidade de elementos por página = " + this.amoutPerPage);
//
//			String passwordEncoded = SenhaUtils.geraBCrypt("1234");
//			System.out.println("Senha encoded: " + passwordEncoded);
//
//			String passwordEncoded2 = SenhaUtils.geraBCrypt("1234");
//			System.out.println("Senha encoded 2.0: " + passwordEncoded2);
//
//			System.out.println("Senha válida " + SenhaUtils.passwordValidation("1234", passwordEncoded));
//
//		};
//	}

}
