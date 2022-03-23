package com.devtarlley.apipetshop;

import com.devtarlley.apipetshop.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
@EnableAutoConfiguration
public class ApiPetshopApplication {

	@Autowired
	private static PetRepository petRepository;

	@Autowired
	private static EspecieRepository especieRepository;

	@Autowired
	private static RacaRepository racaRepository;

	@Autowired
	private static ProprietarioRepository proprietarioRepository;

	@Autowired
	private static EnderecoRepository enderecoRepository;

	@Autowired
	private static EstadoRepository estadoRepository;

	@Autowired
	private static CidadeRepository cidadeRepository;

	@Autowired
	private static ItemRepository itemRepository;

	@Autowired
	private static CategoriaRepository categoriaRepository;

	@Autowired
	private static PedidoRepository pedidoRepository;

	@Autowired
	private static PagamentoRepository pagamentoRepository;

	public static void main(String[] args) throws ParseException {

		SpringApplication.run(ApiPetshopApplication.class, args);

	}


}
