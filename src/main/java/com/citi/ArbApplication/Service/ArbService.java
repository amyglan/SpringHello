package com.citi.ArbApplication.Service;

import com.citi.ArbApplication.Component.Arbitrage;
import com.citi.ArbApplication.Component.CalculatedArbitrage;

public interface ArbService {
	
	//public CalculatedArbitrage sixMonthAmountFwd(Arbitrage arb);
	//public void investAmountFwd(Arbitrage arb);
	
	public void normalArbitrageCalc(Arbitrage arb);
	public void reverseArbitrageCalc(Arbitrage arb);
	public CalculatedArbitrage checkArbitrage(Arbitrage arb);

}
