package com.movies.nostra.common;

public class NostraPaths {
	
	public static final String base = "/nostra";
	
	public static final class category {
		public static final String base 	= "/category";
		public static final String findAll	= base + "/list";
		public static final String findOne	= base + "/{id}";
		public static final String search	= base + "/search";
		public static final String update 	= base + "/update/{id}";
		public static final String delete	= base + "/delete/{id}";
	}
	
	public static final class movie {
		public static final String base 	= "/movie";
		public static final String findAll	= base + "/list";
		public static final String findOne	= base + "/{id}";
		public static final String search	= base + "/search";
		public static final String update 	= base + "/update/{id}";
		public static final String delete	= base + "/delete/{id}";
	}
	
	public static final class booking {
		public static final String base 	= "/booking";
		public static final String findAll	= base + "/list";
		public static final String findOne	= base + "/{id}";
		public static final String search	= base + "/search";
		public static final String update 	= base + "/update/{id}";
		public static final String delete	= base + "/delete/{id}";
	}
	
	public static final class user {
		public static final String base 	= "/user";
		public static final String findAll	= base + "/list";
		public static final String findOne	= base + "/{id}";
		public static final String search	= base + "/search";
		public static final String update 	= base + "/update/{id}";
		public static final String delete	= base + "/delete/{id}";
	}

}
