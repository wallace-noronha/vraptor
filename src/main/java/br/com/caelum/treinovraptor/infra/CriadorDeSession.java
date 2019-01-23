package br.com.caelum.treinovraptor.infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class CriadorDeSession implements ComponentFactory<Session> {

	private final SessionFactory factory;
	private Session session;

	public CriadorDeSession(SessionFactory factory) {
		this.factory = factory;
		System.out.println("Construtor da Session");
		
	}
	
	public Session getInstance() {
		System.out.println("pegando a instancia da Sessino");
		return this.session;
	}
	
	@PostConstruct
	public void abre() {
		System.out.println("Abrindo a Session");
		this.session = factory.openSession();
	}

	@PreDestroy
	public void fecha() {
		System.out.println("fechando a session");
		this.session.close();
	}
	
}
