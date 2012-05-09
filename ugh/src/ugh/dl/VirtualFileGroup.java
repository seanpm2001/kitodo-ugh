package ugh.dl;

/*******************************************************************************
 * ugh.dl / VirtualFileGroup.java
 * 
 * Copyright 2010 Center for Retrospective Digitization, Göttingen (GDZ)
 * 
 * http://gdz.sub.uni-goettingen.de
 * 
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or (at your
 * option) any later version.
 * 
 * This Library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 ******************************************************************************/

import java.io.Serializable;

/*******************************************************************************
 * <p>
 * A <code>VirtualFileGroup</code> contains all file groups needed for the class
 * MetsModsImportExport.
 * </p>
 * 
 * @author Stefan E. Funk
 * @version 2009-11-17
 * @since 2008-11-19
 * @see ContentFile
 * 
 *      CHANGELOG
 * 
 *      17.11.2009 --- Funk --- Refactored some things for Sonar improvement.
 * 
 *      30.10.2009 --- Funk --- Added generated serialVersionUID.
 * 
 *      16.01.2009 --- Funk --- Made the suffix input "." resistent!
 * 
 ******************************************************************************/

public class VirtualFileGroup implements Serializable {

	private static final long	serialVersionUID	= 8594056041230503891L;

	private String				name				= "";
	private String				pathToFiles			= "";
	private String				mimetype			= "";
	private String				fileSuffix			= "";
	private String				idSuffix			= "";

	/***************************************************************************
	 * Default constructor.
	 **************************************************************************/
	public VirtualFileGroup() {
		super();
	}

	/***************************************************************************
	 * Constructor.
	 **************************************************************************/
	public VirtualFileGroup(String theFilegroupName, String thePath,
			String theMimetype, String theFileSuffix) {

		super();
		this.name = theFilegroupName;
		this.pathToFiles = thePath;
		this.mimetype = theMimetype;
		this.fileSuffix = theFileSuffix;
	}

	/***************************************************************************
	 * @return
	 **************************************************************************/
	public String getName() {
		return this.name;
	}

	/***************************************************************************
	 * @param name
	 **************************************************************************/
	public void setName(String name) {
		this.name = name;
	}

	/***************************************************************************
	 * @return
	 **************************************************************************/
	public String getPathToFiles() {
		return this.pathToFiles;
	}

	/***************************************************************************
	 * @param pathToFiles
	 **************************************************************************/
	public void setPathToFiles(String pathToFiles) {
		this.pathToFiles = pathToFiles;
	}

	/***************************************************************************
	 * @return
	 **************************************************************************/
	public String getMimetype() {
		return this.mimetype;
	}

	/***************************************************************************
	 * @param mimetype
	 **************************************************************************/
	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	/***************************************************************************
	 * @return
	 **************************************************************************/
	public String getFileSuffix() {
		return this.fileSuffix;
	}

	/***************************************************************************
	 * @param fileSuffix
	 **************************************************************************/
	public void setFileSuffix(String fileSuffix) {

		// If the given file suffix starts with a ".", remove the ".".
		if (fileSuffix.startsWith(".")) {
			this.fileSuffix = fileSuffix.replaceFirst("\\.", "");
		} else {
			this.fileSuffix = fileSuffix;
		}
	}

	/***************************************************************************
	 * @return
	 **************************************************************************/
	public String getIdSuffix() {
		return this.idSuffix;
	}

	/***************************************************************************
	 * @param idSuffix
	 **************************************************************************/
	public void setIdSuffix(String idSuffix) {
		this.idSuffix = idSuffix;
	}

}