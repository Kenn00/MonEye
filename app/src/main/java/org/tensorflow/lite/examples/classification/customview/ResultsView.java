package org.tensorflow.lite.examples.classification.customview;

import java.util.List;
import org.tensorflow.lite.examples.classification.tflite.Classifier.Recognition;

public interface ResultsView {
    public void setResults(final List<Recognition> results);
}
