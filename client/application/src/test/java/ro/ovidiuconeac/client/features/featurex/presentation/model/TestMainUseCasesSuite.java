package ro.ovidiuconeac.client.features.featurex.presentation.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestMainUseCases.class,
        TestMainUseCasesWithRequestException.class
})
public class TestMainUseCasesSuite {
}