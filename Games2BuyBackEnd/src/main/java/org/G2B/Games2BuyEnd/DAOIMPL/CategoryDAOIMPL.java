package org.G2B.Games2BuyEnd.DAOIMPL;

import java.util.ArrayList;
import java.util.List;

import org.G2B.Games2BuyEnd.DAO.CategoryDAO;
import org.G2B.Games2BuyEnd.DTO.Category;
import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryDAOIMPL implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		category.setId(1);
		category.setName("PC Games");
		category.setDescription("PC Games");
		category.setImgurl("img1.png");

		categories.add(category);

		category = new Category();

		category.setId(2);
		category.setName("PS4 Games");
		category.setDescription("PS4 Games");
		category.setImgurl("img2.png");

		categories.add(category);

		category = new Category();

		category.setId(3);
		category.setName("XBOX Games");
		category.setDescription("XBOX Games");
		category.setImgurl("img3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {

for(Category category:categories)
{
if(category.getId()==id) return category;	
}
return null;
	}

}
