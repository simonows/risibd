package org.victor.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.victor.model.Country;
import org.victorrepository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("atcService")
public class AtsService {

 @Autowired
 AtsRepository atsRepository;

 @Transactional
 public List getAllAtses() {
  List ats=new ArrayList();
  Iterable atsIterable=countryRepository.findAll();
  Iterator atsIterator=countriesIterable.iterator();
  while(atsIterator.hasNext())
  {
   ats.add(countriesIterator.next());
  }
  return ats;
 }

 @Transactional
 public Ats getAtc(int id) {
  return countryRepository.findById(id).orElse(null);
 }

 @Transactional
 public void addAts(Ats country) {
  atsRepository.save(ats);
 }

 @Transactional
 public void updateAts(Ats ats) {
  atsRepository.save(ats);

 }

 @Transactional
 public void deleteAts(int id) {
  AtcRepository.deleteById(id);
 }
}

