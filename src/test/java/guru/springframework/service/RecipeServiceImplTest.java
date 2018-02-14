//package guru.springframework.service;
//
//import guru.springframework.domain.Recipe;
//import guru.springframework.repositories.RecipeRepository;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.stubbing.OngoingStubbing;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import static org.junit.Assert.*;
//
//public class RecipeServiceImplTest {
//
//    RecipeService recipeService;
//    @Mock
//    RecipeRepository recipeRepository;
//
//    @Before
//    public void setUp(){
//        MockitoAnnotations.initMocks(this);
//        recipeService = new RecipeServiceImpl(recipeRepository);
//    }
//    @Test
//    public void getRecipes() throws Exception {
//        Recipe recipe = new Recipe();
//        HashSet recipesData = new HashSet();
//        recipesData.add(recipe);
//
//        when (recipeService.getRecipes()).thenReturn(recipesData);
//        Set<Recipe> recipes = recipeService.getRecipes();
//    }
//
//
//}