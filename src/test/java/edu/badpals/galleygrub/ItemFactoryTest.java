package edu.badpals.galleygrub;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import edu.badpals.galleygrub.Items.Item;
import edu.badpals.galleygrub.Items.ItemFactory;
import org.junit.Before;
import org.junit.Test;


/**
 * Implementar singleton
 */

public class ItemFactoryTest {

    @Before
    public void setup_itemFactory() {
        ItemFactory.clear();
        assertEquals(0, ItemFactory.size());
    }

    @Test
    public void get_absent_item_test() {

        Item kpatty = ItemFactory.getItem("Krabby Patty", 1.25);
        assertNotNull(kpatty);

        assertEquals("Krabby Patty....1,25$", kpatty.toString());
        assertEquals(1, ItemFactory.size());

        Item coral = ItemFactory.getItem("Coral Bits", 1.00);
        assertNotNull(kpatty);

        assertEquals("Coral Bits....1,00$", coral.toString());
        assertNotSame(kpatty,coral);
        assertEquals(2, ItemFactory.size()); 
    }

    @Test
    public void get_present_item_test() {

        Item item = ItemFactory.getItem("Krabby Patty", 1.25);
        assertNotNull(item);

        assertEquals("Krabby Patty....1,25$", item.toString());
        assertEquals(1, ItemFactory.size());

        Item itemClon = ItemFactory.getItem("Krabby Patty", 1.25);
        assertEquals(1, ItemFactory.size());
        assertTrue(item == itemClon);
    } 

    @Test
    public void get_extra_item_test() {

        Item item = ItemFactory.getItem("Krabby Patty", 1.25, "cheese");
        assertNotNull(item);

        assertEquals("Krabby Patty w/ cheese....1,25$", item.toString());
        assertEquals(1, ItemFactory.size());

        item = ItemFactory.getItem("Coral Bits", 1.00, "medium");
        assertNotNull(item);

        assertEquals("Coral Bits w/ medium....1,00$", item.toString());
        assertEquals(2, ItemFactory.size()); 
    }

    @Test
    public void get_present_extra_item_test() {

        Item item = ItemFactory.getItem("Krabby Patty", 1.25, "cheese");
        assertNotNull(item);
        assertEquals(1, ItemFactory.size());

        Item itemClon = ItemFactory.getItem("Krabby Patty", 1.25, "cheese");
        assertEquals(1, ItemFactory.size());
        assertTrue(item == itemClon);
    }

    @Test
    public void get_regular_extra_item_test() {

        Item kpattywc = ItemFactory.getItem("Krabby Patty", 1.25, "cheese");
        assertNotNull(kpattywc);
        assertEquals(1, ItemFactory.size());

        Item kpatty = ItemFactory.getItem("Krabby Patty", 1.25);
        assertEquals(2, ItemFactory.size());
        assertNotSame(kpattywc,kpatty);
    }
}