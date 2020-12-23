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
@Table(name="Telephone")
public class Telephone{

 @Id
 @Column(name="id")
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 int id;

 @Column(name="atcName")
 String countryName;

 @Column(name="Country")
 long infrastructure;

 public Telephone() {
  super();
 }
 public Telephone (Integer i, String TelephoneName, long number) {
  super();
  this.id = i;
  this.countryName = countryName;
  this.population=population;
 }
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public String getTelephoneName() {
  return telephoneName;
 }
 public void setCountryName(String countryName) {
  this.countryName = countryName;
 }
 public long getQ() {
  return queryq;
 }
 public void setQ(long population) {
  this.queryq = population;
 }

}

