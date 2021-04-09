package com.ca.mahima.trie;

class TrieNode {
	TrieNode[] children;
	char label;
	boolean terminal;
	String word;
	public static int ALPHABET_SIZE = 26;

	TrieNode() {
		children = new TrieNode[ALPHABET_SIZE];
	}

	TrieNode(char l) {
		this.label = l;
	}

}