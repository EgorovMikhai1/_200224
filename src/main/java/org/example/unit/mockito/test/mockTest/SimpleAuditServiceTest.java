package org.example.unit.mockito.test.mockTest;


import org.example.unit.mockito.mock.AuditService;
import org.example.unit.mockito.mock.Trade;
import org.example.unit.mockito.mock.TradeRepository;
import org.example.unit.mockito.mock.TradingService;
import org.mockito.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SimpleAuditServiceTest {

	@Mock  // actually, this is a stub
	TradeRepository tradeRepository;

	@Mock
	Trade trade;

	@Mock  // and this one is indeed a mock
	AuditService auditService;

	@Test
	public void testAuditLogEntryMadeForNewTrade() throws Exception {
	//	Trade trade = new Trade("Ref 1.txt", "Description 1.txt");

		when(tradeRepository.createTrade(trade)).thenReturn(anyLong());


		TradingService tradingService = new SimpleTradingService(tradeRepository, auditService);
		tradingService.createTrade(trade);

		verify(auditService).logNewTrade(trade);
	}
}