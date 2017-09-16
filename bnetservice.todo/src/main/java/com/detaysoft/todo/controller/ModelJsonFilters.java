package com.detaysoft.todo.controller;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

public interface ModelJsonFilters {

public final static String SECTEUR_FILTER = "SecteurFilter";
public final static String APPLICATION_FILTER = "ApplicationFilter";
public final static String SERVICE_FILTER = "ServiceFilter";
public final static String UTILISATEUR_FILTER = "UtilisateurFilter";

public static SimpleFilterProvider getDefaultFilters() {
    SimpleBeanPropertyFilter theFilter = SimpleBeanPropertyFilter.serializeAll();
    return new SimpleFilterProvider().setDefaultFilter(theFilter);
}

}