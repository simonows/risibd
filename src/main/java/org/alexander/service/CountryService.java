package org.alexander.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.alexander.model.Country;
import org.alexander.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("countryService")
public class CountryService {

 @Autowired
 CountryRepository countryRepository;

 @Transactional
 public List getAllCountries() {
  List countries=new ArrayList();
  Iterable countriesIterable=countryRepository.findAll();
  Iterator countriesIterator=countriesIterable.iterator();
  while(countriesIterator.hasNext())
  {
   countries.add(countriesIterator.next());
  }
  return countries;
 }

 @Transactional
 public Country getCountry(int id) {
  return countryRepository.findById(id).orElse(null);
 }

 @Transactional
 public void addCountry(Country country) {
  countryRepository.save(country);
 }

 @Transactional
 public void updateCountry(Country country) {
  countryRepository.save(country);

 }

 @Transactional
 public void deleteCountry(int id) {
  countryRepository.deleteById(id);
 }
}

