package com.example.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Quote {
 @Id
 private Long id;
 private String who;
 private String what;

public Quote() {}

public Long getId() {
 return id;
 }

public void setId(Long id) {
 this.id = id;
 }

public String getWho() {
 return who;
 }

public void setWho(String who) {
 this.who = who;
 }

public String getWhat() {
 return what;
 }

public void setWhat(String what) {
 this.what = what;
 }
}