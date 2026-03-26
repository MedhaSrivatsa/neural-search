/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package org.opensearch.neuralsearch;

import org.opensearch.neuralsearch.constants.NeuralSearchConstants;
import org.opensearch.test.OpenSearchTestCase;

public class NeuralSearchTests extends OpenSearchTestCase {

    public void testValidateKNNDependency() {
        // This test validates that our NeuralSearchConstants.LUCENE_NAME matches the expected value
        // When using opensearch-knn, this would match KNNEngine.LUCENE.getName()
        // When using opensearch-jvector, the constant is still valid for our use cases
        assertEquals("lucene", NeuralSearchConstants.LUCENE_NAME);
    }
}
