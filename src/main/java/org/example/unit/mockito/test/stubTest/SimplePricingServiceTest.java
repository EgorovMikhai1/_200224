package org.example.unit.mockito.test.stubTest;//package javaProf.unit.mockito.test.stubTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//import java.util.*;
//
//import org.junit.jupiter.api.Test;
//
//import javaProf.unit.mockito.stub.*;
//
//class SimplePricingServiceTest {
//
//    @Test
//    public void testGetHighestPricedTrade() {
//        Price price1 = new Price(10);
//        Price price2 = new Price(15);
//        Price price3 = new Price(25);
//
//        Collection<Trade> trades = new ArrayList<>();
//        trades.add(new Trade(price1));
//        trades.add(new Trade(price2));
//        trades.add(new Trade(price3));
//
//        PricingRepository pricingRepository = mock(PricingRepository.class);
//        when(pricingRepository.getPriceForTrade(any(Trade.class)))
//                .thenReturn(price1, price2, price3);
//
//        PricingService service = new SimplePricingService(pricingRepository);
//        Price highestPrice = service.getHighestPricedTrade(trades);
//
//        assertEquals(price3.getAmount(), highestPrice.getAmount());
//    }
//}