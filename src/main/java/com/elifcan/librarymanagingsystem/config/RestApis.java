package com.elifcan.librarymanagingsystem.config;

public class RestApis {

    private static final String VERSION = "/v1";
    private static final String DEV = "/dev";
    private static final String PROD = "/prod";
    private static final String TEST = "/test";
    private static final String API = "/api";
    private static final String BASE_URL = DEV + VERSION;

    public static final String BOOK = BASE_URL + "/book";

    public static final String DO_REGISTER = BASE_URL + "/do-register";
    public static final String LIST_BOOKS = BASE_URL + "/list_books";
    public static final String GET_ALL_BY_PAGES_LESS_THAN = BASE_URL + "/get-all-by-pages-less-than";
    public static final String GET_ALL_BY_AUTHER_LIKE = BASE_URL + "/get-all-by-author-like";
    public static final String GET_ALL_BY_TITLE_CONTAINING = BASE_URL + "/get-all-by-title-containing";
}
