package controle.modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class PessoaManeger {
	protected SessionFactory sessionFactory;

	public void inicializar() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	public void terminar() {
		sessionFactory.close();
	}

	public void criar(Pessoa pessoa) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(pessoa);

		session.getTransaction().commit();
		session.close();

	}

	public List<Pessoa> buscarPessoas() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();
		session.getTransaction().commit();
		session.close();
		return pessoas;

	}

	public void atualizar(Pessoa pessoa) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.update(pessoa);

		session.getTransaction().commit();
		session.close();
	}

	public void deletar(Pessoa pessoa) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.delete(pessoa);

		session.getTransaction().commit();
		session.close();
	}


}
