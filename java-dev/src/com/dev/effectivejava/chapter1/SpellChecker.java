package com.dev.effectivejava.chapter1;

import java.util.Objects;

public class SpellChecker {
	private final Lexican dictionary;
	
	public SpellChecker(Lexican dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
	}
	
	public boolean isValid() {
		return false;
	}
}
