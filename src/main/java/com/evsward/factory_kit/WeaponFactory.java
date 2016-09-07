package com.evsward.factory_kit;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface WeaponFactory {
	Weapon create(WeaponType name);

	static WeaponFactory factory(Consumer<Builder> consumer) {
		HashMap<WeaponType, Supplier<Weapon>> map = new HashMap<>();
		consumer.accept(map::put);// 双冒号就是方法引用，没有括号，Lambda有懒加载，不要括号就是说，看情况调	用方法。
		return name -> map.get(name).get();
	}
}
