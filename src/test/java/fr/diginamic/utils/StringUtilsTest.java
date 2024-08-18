package fr.diginamic.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StringUtilsTest {

    @BeforeEach
    void setUp() {

        assertEquals(-1,StringUtils.levenshteinDistance(null, null));
        assertEquals(-1,StringUtils.levenshteinDistance(null, "Distance"));
        assertEquals(-1,StringUtils.levenshteinDistance("Distance", null));

        assertEquals(2,StringUtils.levenshteinDistance("Chine", "Chien"));
        assertEquals(1,StringUtils.levenshteinDistance("Vienne", "Sienne"));
        assertEquals(2,StringUtils.levenshteinDistance("Instance", "Distance"));
        assertEquals(6,StringUtils.levenshteinDistance("Poule", "Canard"));
        assertEquals(0,StringUtils.levenshteinDistance("MemeMot", "MemeMot"));
    }

    @Test
    void levenshteinDistance() {
    }
}