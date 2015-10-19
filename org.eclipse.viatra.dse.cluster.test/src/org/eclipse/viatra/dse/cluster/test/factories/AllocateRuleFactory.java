package org.eclipse.viatra.dse.cluster.test.factories;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.dse.cluster.interfaces.ITransformationRuleFactory;
import org.eclipse.viatra.dse.examples.bpmn.rules.AssignVariantToTaskRule;

public class AllocateRuleFactory implements ITransformationRuleFactory {

	@Override
	public DSETransformationRule<?, ?> create() throws IncQueryException {		
		return AssignVariantToTaskRule.createRule();
	}

}
