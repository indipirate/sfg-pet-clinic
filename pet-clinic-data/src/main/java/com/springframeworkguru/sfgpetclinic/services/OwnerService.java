package com.springframeworkguru.sfgpetclinic.services;

import com.springframeworkguru.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long> {
	Owner findByLastName(String lastName);
}
