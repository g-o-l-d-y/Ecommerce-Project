package process.Model.Product;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("productDAO")
@Transactional
public class ProductImpl implements ProductInterface
{
	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addProduct(Product product)
	{
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
	public boolean deleteProduct(Product product)
	{
		try
		{
		sessionFactory.getCurrentSession().delete(product);
		return true;	
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public boolean updateProduct(Product product) 
	{
		try
		{
		sessionFactory.getCurrentSession().update(product);
		return true;	
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public Product getProduct(int productId) 
	{
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class,productId);
		session.close();
		return product;
	}

	public List<Product> listProducts()
	{
		Session session=sessionFactory.openSession();
		List<Product> listProducts=(List<Product>)(session.createQuery("from Product").list());
		session.close();
		return listProducts;
	}
}

