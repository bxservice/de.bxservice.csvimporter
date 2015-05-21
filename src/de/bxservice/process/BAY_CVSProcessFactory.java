package de.bxservice.process;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

public class BAY_CVSProcessFactory implements IProcessFactory{

	@Override
	public ProcessCall newProcessInstance(String className) {
		ProcessCall process = null;
		if ("de.bxservice.process.BAY_CVSProcessFactory".equals(className)) {
			try {
				process =  ImportCSVProcess.class.newInstance();
			} catch (Exception e) {}
		} 
		return process;
	}

}