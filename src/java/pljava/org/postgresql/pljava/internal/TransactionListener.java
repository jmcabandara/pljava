/*
 * Copyright (c) 2004, 2005 TADA AB - Taby Sweden
 * Distributed under the terms shown in the file COPYRIGHT
 * found in the root folder of this project or at
 * http://eng.tada.se/osprojects/COPYRIGHT.html
 */
package org.postgresql.pljava.internal;

import java.util.EventListener;


/**
 * @author Thomas Hallgren
 */
public interface TransactionListener extends EventListener
{
	void afterAbort(TransactionEvent e);

	void afterCommit(TransactionEvent e);
}
