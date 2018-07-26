package repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

	@Autowired
	private JdbcTemplate jdbc;
	
	public void addProduct(String name, double price) {
		String sql = "INSERT INTO product VALUES (NULL,?,?)";
		jdbc.update(sql, name, price);
	}
}
