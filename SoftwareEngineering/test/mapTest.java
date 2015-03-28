//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class MapTest(){
//
//	@Test
//	public void testCellIsRocky(){
//		MapImpl map = new MapImpl();
//		map.generateMap();
//		Position p = new Position(1,1);
//
//		map.setCellIsRocky(p, true);
//		assertTrue(map.getCellIsRocky(p));
//
//		map.setCellIsRocky(p, false);
//		assertFalse(map.getCellIsRocky(p));
//	}
//
//	@Test
//	public void testCellContents(){
//		MapImpl map = new MapImpl();
//		map.generateMap();
//		Position p = new Position(2,2);
//
//		assertEquals(map.getCellContents(p),".");	// defalut value;
//
//		map.setCellContents(p,"+");
//		assertEquals(map.getCellContents(p),"+");
//
//		map.setCellContents(p,"-");
//		assertEquals(map.getCellContents(p),"-");
//
//		map.setCellContents(p,"1");
//		assertEquals(map.getCellContents(p),"1");
//
//		map.setCellContents(p,"3");
//		assertEquals(map.getCellContents(p),"3");
//
//		map.setCellIsRocky(p, true);
//		assertTrue(map.getCellIsRocky(p));
//		assertEquals(map.getCellContents(p),"#");
//	}
//
//	@Test 									// need to discuss
//	public void testCellScentMarker(){
//		MapImpl map = new MapImpl();
//		map.generateMap();
//		Position p = new Position(2,2);
//
//		assertEquals(map.getCellScentMarker)
//	}
//
//	@Test 									// need to know default value of ant ID
//	public void testAntAtCell(){
//		MapImpl map = new MapImpl();
//		map.generateMap();
//		Position p = new Position(1,1);
//
//		map.setAntAtCell(p, 13);
//		assertTrue(map.getAntAtCell(p),13);
//
//		map.setAntAtCell(p, 13);
//		assertFalse(map.getAntAtCell(p),12);
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
