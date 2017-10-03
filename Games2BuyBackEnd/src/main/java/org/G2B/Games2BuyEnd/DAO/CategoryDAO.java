package org.G2B.Games2BuyEnd.DAO;

import java.util.List;

import org.G2B.Games2BuyEnd.DTO.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
 