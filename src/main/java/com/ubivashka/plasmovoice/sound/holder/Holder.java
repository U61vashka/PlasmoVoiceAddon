package com.ubivashka.plasmovoice.sound.holder;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface Holder<T> {
	List<T> getList();

	Holder<T> add(T object);

	Holder<T> remove(T object);

	Iterator<T> iterator();

	default Optional<T> findFirstByPredicate(Predicate<T> predicate) {
		return getList().stream().filter(predicate).findFirst();
	}
}
