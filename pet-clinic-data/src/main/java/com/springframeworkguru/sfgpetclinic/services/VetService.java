package com.springframeworkguru.sfgpetclinic.services;

import com.springframeworkguru.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
	Vet findById(Long id);

	Set<Vet> findAll();

	Vet save(Vet owner);
}
