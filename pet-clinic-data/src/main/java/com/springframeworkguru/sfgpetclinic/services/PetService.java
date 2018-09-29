package com.springframeworkguru.sfgpetclinic.services;

import com.springframeworkguru.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
	Pet findById(Long id);

	Set<Pet> findAll();

	Pet save(Pet pet);
}
