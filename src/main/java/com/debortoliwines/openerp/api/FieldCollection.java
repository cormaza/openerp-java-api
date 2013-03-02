/*
 *   This file is part of OpenERPJavaAPI.
 *
 *   OpenERPJavaAPI is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   OpenERPJavaAPI is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with OpenERPJavaAPI.  If not, see <http://www.gnu.org/licenses/>.
 *
 *   Copyright 2011 De Bortoli Wines Pty Limited (Australia)
 */

package com.debortoliwines.openerp.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/***
 * Array of Field objects.
 * @author Pieter van der Merwe
 *
 */
public class FieldCollection extends ArrayList<Field> {

	private static final long serialVersionUID = 470551054665276346L;
	
	/**
	 * Sorts the field entries in this field collection by Name
	 */
	public void SortByName(){
	  Collections.sort(this,new FieldByNameComparator());
	}
	
	private class FieldByNameComparator implements Comparator<Field> { 

	  @Override
	  public int compare(Field arg0, Field arg1) {
	    return arg0.getName().compareTo(arg1.getName());
	  }
	  
	}
	
}
