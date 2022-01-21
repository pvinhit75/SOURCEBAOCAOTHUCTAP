package com.ShoppingCart.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ShoppingCart.common.entity.Country;
import com.ShoppingCart.common.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}
