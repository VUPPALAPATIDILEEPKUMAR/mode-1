package com.hcl.pp.service;

import java.util.List;

import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

public interface PetService {
  abstract void savePet(Pet pet);
  abstract List<Pet> getAllPets(User user);
 
}
