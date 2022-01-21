package com.ShoppingCart.admin.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ShoppingCart.common.entity.Setting;
import com.ShoppingCart.common.entity.SettingCategory;

public interface SettingRepository extends CrudRepository<Setting, String> {
	public List<Setting> findByCategory(SettingCategory category);
}
