package com.ShoppingCart.admin.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ShoppingCart.common.entity.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {
	
	public List<Currency> findAllByOrderByNameAsc();
}
