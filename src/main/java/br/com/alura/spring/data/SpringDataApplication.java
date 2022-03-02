package br.com.alura.spring.data;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.spring.data.orm.Cargo;
import br.com.alura.spring.data.repository.CargoRepository;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{

	private final CargoRepository repository;
	
	private Boolean system = true;
	
	public SpringDataApplication(CargoRepository repository) {
		this.repository = repository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		Scanner scanner = new Scanner(System.in);
		
		while(system) {
			System.out.println("Qual ação vc quer executar?");
			System.out.println("0 - Sair");
		}
		
		Cargo cargo =  new Cargo();
		cargo.setDescricao("DESENVOLVEDOR DE SOFTWARE");
		
		repository.save(cargo);
	}
}
