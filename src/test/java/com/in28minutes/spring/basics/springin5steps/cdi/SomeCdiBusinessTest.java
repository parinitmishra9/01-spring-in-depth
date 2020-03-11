package com.in28minutes.spring.basics.springin5steps.cdi;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsCdiApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/11/2020
 * at 6:50 AM
 */
@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {

    // Create Mock
    @Mock
    SomeCdiDao daoMock;

    // Inject Mock
    @InjectMocks
    SomeCdiBusiness business;

    @Test
    void findGreatest_BasicScenario() {
        // when daoMock.getData() method is called return int[] {2, 3}
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2, 4});
        assertEquals(4, business.findGreatest());
    }

    @Test
    void findGreatest_NoElement() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, business.findGreatest());
    }

    @Test
    void findGreatest_EqualElement() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2, 2});
        assertEquals(2, business.findGreatest());
    }
}