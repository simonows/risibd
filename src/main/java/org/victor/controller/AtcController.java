package org.victor.controller;


import java.util.List;

import org.victor.model.Country;
import org.victor.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AtcController {

 @Autowired
 AtcService countryService;

 @RequestMapping(value = "/getAllAtc", method = RequestMethod.GET, headers = "Accept=application/json")
 public String getAtc(Model model) {

  List listOfCountries = countryService.getAllCountries();
  model.addAttribute("country", new Country());
  model.addAttribute("listOfCountries", listOfCountries);
  return "countryDetails";
 }

 @RequestMapping(value = "/getAtc/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
 public Country getAtcById(@PathVariable int id) {
  return countryService.getCountry(id);
 }

 @RequestMapping(value = "/addAtc", method = RequestMethod.POST, headers = "Accept=application/json")
 public String addCountry(@ModelAttribute("atc") Country country) {
  if(country.getId()==0)
  {
   countryService.addAtc(country);
  }
  else
  {
   countryService.updateAtc(country);
  }

  return "redirect:/getAllAtc";
 }

 @RequestMapping(value = "/updateAtc/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
 public String updateAtc(@PathVariable("id") int id,Model model) {
   model.addAttribute("atc", this.countryService.getCountry(id));
         model.addAttribute("listOfAtc", this.countryService.getAllCountries());
         return "atcDetails";
 }

 @RequestMapping(value = "/deleteAtc/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
 public String deleteAtc(@PathVariable("id") int id) {
  countryService.deleteAtc(id);
   return "redirect:/getAllAtc";

 }
}

