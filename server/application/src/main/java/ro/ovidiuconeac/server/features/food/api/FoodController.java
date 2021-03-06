package ro.ovidiuconeac.server.features.food.api;

/**
 * Created by Ovidiu CONEAC on 2/12/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ovidiuconeac.models.features.food.Cheese;
import ro.ovidiuconeac.models.features.food.Fruit;
import ro.ovidiuconeac.models.features.food.Sweet;
import ro.ovidiuconeac.server.features.food.business.CheeseBean;
import ro.ovidiuconeac.server.features.food.business.FruitsBean;
import ro.ovidiuconeac.server.features.food.business.SweetsBean;
import ro.ovidiuconeac.server.features.food.exceptions.NoResultException;

@RestController
public class FoodController {

    private final FruitsBean fruitsBean;
    private final CheeseBean cheeseBean;
    private final SweetsBean sweetsBean;

    @Autowired
    public FoodController(FruitsBean fruitsBean, CheeseBean cheeseBean, SweetsBean sweetsBean) {
        this.fruitsBean = fruitsBean;
        this.cheeseBean = cheeseBean;
        this.sweetsBean = sweetsBean;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/food/fruit")
    public Fruit getRandomFruit() throws NoResultException {
        return fruitsBean.getRandomFruit();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/food/cheese")
    public Cheese getRandomCheese() throws NoResultException {
        return cheeseBean.getRandomCheese();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/food/sweet")
    public Sweet getRandomSweet() throws NoResultException {
        return sweetsBean.getRandomSweet();
    }
}