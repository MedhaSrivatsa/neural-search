/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package org.opensearch.neuralsearch.constants;

/**
 * Constants used by neural-search plugin.
 * These constants match opensearch-knn's KNNConstants to maintain compatibility
 * while eliminating direct dependency on the knn plugin's constant definitions.
 *
 * This allows neural-search to work with both opensearch-knn and opensearch-jvector plugins
 * without requiring KNNConstants to be present at compile time.
 */
public final class NeuralSearchConstants {

    private NeuralSearchConstants() {}

    // Field mapping constants used in MMR query transformation
    public static final String TYPE = "type";
    public static final String VECTOR_FIELD_PATH = "vector_field_path";

    // Model index constant used in test cleanup to skip model index deletion
    public static final String MODEL_INDEX_NAME = ".plugins-ml-model";

    // MMR-related constants used in MMR integration tests
    public static final String CANDIDATES = "candidates";
    public static final String DIVERSITY = "diversity";
    public static final String MMR = "mmr";
    public static final String MODEL_ID = "model_id";
    public static final String VECTOR_FIELD_DATA_TYPE = "vector_data_type";
    public static final String VECTOR_FIELD_SPACE_TYPE = "space_type";

    // Engine constants used in dependency validation tests
    public static final String LUCENE_NAME = "lucene";
}
