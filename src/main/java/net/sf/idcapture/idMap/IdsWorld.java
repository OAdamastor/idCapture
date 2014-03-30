/**
 * 
 */
package net.sf.idcapture.idMap;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author OAdamastor
 *
 */
public interface IdsWorld extends Serializable {

	/*
	 * Reference all Fields usable in a list
	 * to qualify ids in this World
	 */
	public List<? extends IdField> getFields();
	
	/* 
	 * Reference all Maps in this world of ids
	 * Fixed order of Maps, allowing for index of map references (in IdFields Definition )
	 */
	public List<IdsMap> getMaps(); // should it be in public interface ?
	
	public List<String> getMapsNames();
	public IdsMap getMap(int mapindex);
	public IdsMap getMap(String mapname);
	
	
	/* sID of map elements
	 * 
	 * IF not storage in elements, idRecords, list
	 * Same volume of information for all maps.
	 * Individual volume lower for one map
	 * 
	 * Allow partial loading (only one or few maps)
	 * 
	 * Should be more efficient for noSQL very large apps.
	 * One or the other solution.
	 * 
	 * ? Regenerate one from the other : no, as hard to keep in sync
	 * to be seen in case by case.
	 */
	
	//public List<int[]> getMapsArrays();
	
	/*
	 * 
	 * Ibid as previous
	 */
	
	// public boolean isFullyLoaded();
	
	
	/*
	 * Reference all ids, 
	 * using a List index as a UID : Universal ID  
	 */
	public List<IdRecords> getIds();
	
}
