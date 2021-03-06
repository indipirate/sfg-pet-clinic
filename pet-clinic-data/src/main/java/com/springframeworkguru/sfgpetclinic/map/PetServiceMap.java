package com.springframeworkguru.sfgpetclinic.map;

import com.springframeworkguru.sfgpetclinic.model.Pet;
import com.springframeworkguru.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstarchMapService<Pet,Long> implements CrudService<Pet,Long> {
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(),object);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
