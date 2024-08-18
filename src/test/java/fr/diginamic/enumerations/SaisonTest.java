package fr.diginamic.enumerations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SaisonTest {

    private Saison s;
    private Saison ss;
    private Saison vide;

    @BeforeEach
    void setUp() {

        //Cas nominaux de fonctionnement
        //s = Saison.PRINTEMPS;
       // s = Saison.ETE;
       // s = Saison.HIVER;
        s = Saison.AUTOMNE;

        //Cas limites
        ss = Saison.PRINTEMPS;
        ss.setLibelle("");
        ss.setOrdre(0);
        vide = Saison.valueOfLibelle("");
        vide.setLibelle("");
        vide.setOrdre(0);

        assertEquals("",ss.getLibelle());
        assertEquals(0, ss.getOrdre());
        assertEquals(vide,ss.valueOfLibelle(""));

        ss.setLibelle("VOITURE");
        ss.setOrdre(50);
        assertEquals("",ss.getLibelle());
        assertEquals(0, ss.getOrdre());
        assertEquals(vide,ss.valueOfLibelle("VOITURE"));
    }

    @Test
    void valueOfLibelle() {
        //Cas nominaux de fonctionnement
        //assertEquals("Printemps", s.getLibelle());
        //assertEquals(1, s.getOrdre());
        //assertEquals("Eté", s.getLibelle());
        //assertEquals(2, s.getOrdre());
        //assertEquals("Hiver", s.getLibelle());
        //assertEquals(4, s.getOrdre());
        assertEquals("Automne", s.getLibelle());
        assertEquals(3, s.getOrdre());
    }

    @Test
    void testToString() {
        //Cas nominaux de fonctionnement
        //assertEquals("1. Printemps",s.toString());
        //assertEquals("2. Eté",s.toString());
        //assertEquals("4. Hiver",s.toString());
        assertEquals("3. Automne",s.toString());

        if (ss != null) assertEquals("",ss.toString());
        else System.out.println("ss est null");
    }

}