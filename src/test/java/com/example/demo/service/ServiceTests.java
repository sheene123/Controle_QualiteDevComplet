package com.example.demo.service;

import com.example.demo.data.Voiture;
import com.example.demo.data.VoitureRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ServiceTests {

    @MockBean
    Statistique statistique;

    @Test
    void statistiqueZeroVoiture(){
        when(statistique.prixMoyen()).thenReturn(new Echantillon(0, 0));
    }

    @Test
    void statistique1Voiture(){
        doNothing().when(statistique).ajouter(new Voiture("Ferrari", 5000));
        when(statistique.prixMoyen()).thenReturn(new Echantillon(1, 5000));
    }

    @Test
    void statistique2Voiture(){
        doNothing().when(statistique).ajouter(new Voiture("Ferrari", 1000));
        doNothing().when(statistique).ajouter(new Voiture("Porsche", 3000));
        when(statistique.prixMoyen()).thenReturn(new Echantillon(2, 2000));
    }

}
