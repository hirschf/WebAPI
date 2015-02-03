/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ohdsi.webapi.cohortdefinition;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author cknoll1
 */
public class Codeset {
  
  @JsonProperty("Id")
  public int id;

  @JsonProperty("Name")
  public String name;
  
  @JsonProperty("TargetConcepts")
  public Concept[] targetConcepts;
  
  @JsonProperty("UseDescendents")
  public boolean useDescendents;
  
  @JsonProperty("Excluded")
  public Concept[] excluded;
  
  @JsonProperty("ExcludeDescendents")
  public boolean excludeDescendents;  
}
