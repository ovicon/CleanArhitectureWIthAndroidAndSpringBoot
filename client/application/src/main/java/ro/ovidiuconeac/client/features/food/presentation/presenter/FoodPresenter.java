package ro.ovidiuconeac.client.features.food.presentation.presenter;

import ro.ovidiuconeac.client.features.common.Presenter;
import ro.ovidiuconeac.client.features.food.rest.RestServiceApi;

/**
 * Created by ovidiu on 2/6/17.
 *
 * Main presenter interface.
 * Must implement {@link Presenter} to
 * support methods for presenter caching.
 */

public interface FoodPresenter extends Presenter {
    void requestFruit1(RestServiceApi restServiceApi);
    void requestFruit2(RestServiceApi restServiceApi);
    void requestCheese1(RestServiceApi restServiceApi);
    void requestCheese2(RestServiceApi restServiceApi);
    void requestSweet1(RestServiceApi restServiceApi);
    void requestSweet2(RestServiceApi restServiceApi);
}
