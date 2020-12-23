package org.victor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name="Building")
public class Building{

 @Id
 @Column(name="id")
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 int id;

 @Column(name="BuildingName")
 String BuildingName;

 @Column(name="opt")
 long population;

 public Building() {
  super();
 }
 public Building(int i, String countryName,long population) {
  super();
  this.id = i;
  this.BuildingName = countryName;
  this.population=population;
 }
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public String getBuilding() {
  return buildingName;
 }
 public void setCountryName(String countryName) {
  this.countryName = countryName;
 }
 public long getPopulation() {
  return population;
 }
 public void setPopulation(long population) {
  this.population = population;
 }

}

