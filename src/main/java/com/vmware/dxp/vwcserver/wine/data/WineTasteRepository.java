package com.vmware.dxp.vwcserver.wine.data;

import org.springframework.data.repository.CrudRepository;

import com.vmware.dxp.vwcserver.wine.WineTaste;

public interface WineTasteRepository 
	extends CrudRepository<WineTaste, String>{
}
