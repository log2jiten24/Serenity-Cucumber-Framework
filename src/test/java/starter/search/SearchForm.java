package starter.search;

import org.openqa.selenium.By;

class SearchForm {
    static By SEARCH_FIELD = By.name("q");
    static By SEARCH_BUTTON = By.cssSelector(".search__button");
    static By SEARCH_FIELD_ON_RESULT_PAGE = By.cssSelector("#search_form_input");
    static By SEARCH_BUTTON_ON_RESULT_PAGE = By.cssSelector("#search_button");
}
