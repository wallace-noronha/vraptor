package br.com.caelum.treinovraptor.infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
@ApplicationScoped
public class CriadorDeSessionFactory implements ComponentFactory<SessionFactory>{

	private SessionFactory factory;
	
	@PostConstruct
	public void abre() {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		this.factory = configuration.buildSessionFactory();
		System.out.println("Criando uma factory");
	}
	
	@Override
	public SessionFactory getInstance() {
		System.out.println("Pegando a instancia da Factory");
		return factory;
	}

	@PreDestroy
	public void fecha() {
		System.out.println("Destruindo a factory");
		this.factory.close();
	}
	
}
