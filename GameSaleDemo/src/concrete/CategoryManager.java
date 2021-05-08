package concrete;

import Abstract.CategoryService;

public class CategoryManager implements CategoryService {

	@Override
	public void add() {
		System.out.println("Kategori eklendi");
		
	}

	@Override
	public void delete() {
		System.out.println("Kategori silindi");
		
	}

	@Override
	public void update() {
		System.out.println("Kategori güncellendi");
		
	}

}
