package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.LinkedList;
import java.util.List;

public class CategoryFilter implements MealsFilter {
	@Override
	public List<Meal> filter(List<Meal> meals) {
		List<Meal> result = new LinkedList<>();
		/* iterate all the meals */
		for (var m : meals) {
			/* check if meal is vegetarian */
			if (m.isVegetarian()) {
				result.add(m);
			}
		}
		return result;
	}
}
