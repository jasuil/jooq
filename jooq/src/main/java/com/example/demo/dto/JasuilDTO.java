package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.HashSet;

/*
 * it's possible if you want to make an java object
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JasuilDTO {
  private Integer id;
  private String name;  
  private Collection<JasuilDTO> products = new HashSet<>();
}