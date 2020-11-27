//package com.carol.mySandcastle;
//
//import com.carol.mySandcastle.repositories.CompanyRepository;
//import com.carol.mySandcastle.service.CacheService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cache.annotation.EnableCaching;
//
//
//@SpringBootApplication
//@EnableCaching
//public class MySandcastleApplication {
//
//	@Autowired
//	private CompanyRepository companyRepository;
//
////	@Autowired
////	private UserRepository userRepository;
//
//	@Autowired
//	private CacheService cacheService;
//
//	public static void main(String[] args) {
//		SpringApplication.run(MySandcastleApplication.class, args);
//	}
////usei para aula de cache
////	@Bean
////	public CommandLineRunner commandLineRunner() {
////		return args -> {
////			System.out.println("Executando serviço pela primeira vez: ");
////			System.out.println(this.cacheService.exampleCache());
////
////			System.out.println("Executando o serviço pela segunda vez, deve obter dados do cache: ");
////			System.out.println(this.cacheService.exampleCache());
////
////		};
////	}
//
//	//Usei para aulas 31-34
////	@Bean
////	public CommandLineRunner commandLineRunner() {
////		return args -> {
////
////			User user = new User();
////			user.setEmail("user@hotmail.com");
////			user.setProfile(ProfileEnum.ROLE_USER);
////			user.setPassword(SenhaUtils.createBCrypt("123456"));
////			this.userRepository.save(user);
////
////			User admin = new User();
////			admin.setEmail("adminr@hotmail.com");
////			admin.setProfile(ProfileEnum.ROLE_ADMIN);
////			admin.setPassword(SenhaUtils.createBCrypt("654321"));
////			this.userRepository.save(admin);
////		};
////	}
////Usei para aulas antes da 31
////	@Bean
////	public CommandLineRunner commandLineRunner() {
////		return args -> {
////			Company company = new Company();
////			company.setCompanyName("Castle Builders");
////			company.setCnpj("00000000001");
////
////			this.companyRepository.save(company);
////
////			List<Company> companyList = companyRepository.findAll();
////			companyList.forEach(System.out::println);
////
////			Company companyId = companyRepository.findFirstById(1L);
////			System.out.println("Empresa por ID:" + companyId);
////
////			companyId.setCompanyName("Carol's Castle");
////			this.companyRepository.save(companyId);
////
////			Company companyCnpj = companyRepository.findByCnpj("00000000001");
////			System.out.println("Empresa por CNPJ: " + companyCnpj);
////
////			this.companyRepository.deleteById(1L);
////			companyList = companyRepository.findAll();
////			System.out.println("Empresas: " + companyList);
////		};
////	}
//
//// Aulas sobre properties e suas utilidades:
////	@Value("${pagination.amount_per_page}")
////	private int amoutPerPage;
////
////	public static void main(String[] args) {
////		SpringApplication.run(MySandcastleApplication.class, args);
////	}
////
////	@Bean
////	public CommandLineRunner commandLineRunner() {
////		return args -> {
////			System.out.println("***** Quantidade de elementos por página = " + this.amoutPerPage);
////
////			String passwordEncoded = SenhaUtils.geraBCrypt("1234");
////			System.out.println("Senha encoded: " + passwordEncoded);
////
////			String passwordEncoded2 = SenhaUtils.geraBCrypt("1234");
////			System.out.println("Senha encoded 2.0: " + passwordEncoded2);
////
////			System.out.println("Senha válida " + SenhaUtils.passwordValidation("1234", passwordEncoded));
////
////		};
////	}
//
//}
