/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package org.opensearch.neuralsearch;

import org.opensearch.neuralsearch.constants.NeuralSearchConstants;
import org.opensearch.knn.index.engine.KNNEngine;
import org.opensearch.test.OpenSearchTestCase;

public class NeuralSearchTests extends OpenSearchTestCase {

    public void testValidateKNNDependency() {
        assertEquals(NeuralSearchConstants.LUCENE_NAME, KNNEngine.LUCENE.getName());
    }
}
