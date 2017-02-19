package ro.ovidiuconeac.server.features.food.data.transformers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.models.features.featurex.Sweet;
import ro.ovidiuconeac.server.features.food.data.entities.SweetEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Ovidiu CONEAC on 2/16/2017.
 */
public class SweetTransformerTest {

    private SweetTransformer sweetTransformer;
    private SweetEntity entity;

    @Before
    public void setUp() {
        sweetTransformer = new SweetTransformer();
        entity = new SweetEntity();
        entity.setId(1L);
        entity.setName("Amandina");
    }

    @After
    public void tearDown() {
        sweetTransformer = null;
    }

    @Test
    public void testSweetTransformer() {
        Sweet Sweet = sweetTransformer.getModelFrom(entity);
        assertNotNull(Sweet);
        assertEquals("Amandina", Sweet.getName());
    }
}
