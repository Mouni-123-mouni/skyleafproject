package com.skyleaf.repository;

import org.springframework.data.repository.CrudRepository;
import com.skyleaf.beans.CardExpiry;

public interface CardRepository  extends CrudRepository<CardExpiry, String>{

}
